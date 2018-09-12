package bjwl.controller;

import java.util.Date;
import java.util.HashMap;

import java.util.Map;
import java.util.UUID;

import bjwl.pojo.Loginstate;
import bjwl.pojo.Tmenberinfo;
import bjwl.service.LoginService;
import bjwl.service.TmenberInfoService;
import bjwl.service.TorderInfoService;
import bjwl.util.AesCbcUtil;
import bjwl.util.HttpRequest;

import com.google.gson.Gson;
import org.activiti.engine.impl.util.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/wXLoginController")
public class WXLoginController {

    @Autowired
    TmenberInfoService tmenberInfoService;
    @Autowired
    LoginService loginService;





    /*添加用户的基本信息,可为空*/
//    @RequestMapping("/addMemberInfo")
    public void addMemberInfo(Map map){
        System.out.println("=======================================================");
        Tmenberinfo tmenberinfo=new Tmenberinfo();
        tmenberinfo.setWxno((String) map.get("nickName"));
        tmenberinfo.setRegtm(new Date());
        tmenberinfo.setMemname((String) map.get("openId"));
        tmenberInfoService.insert(tmenberinfo);
    }

    /**
     *     * @Title: decodeUserInfo
     *     * @author：lizheng
     *     * @date：2018年3月25日
     *     * @Description: 解密用户敏感数据
     *     * @param encryptedData 明文,加密数据
     *
     * @param iv   加密算法的初始向量
     * @param code 用户允许登录后，回调内容会带上 code（有效期五分钟），开发者需要将 code 发送到开发者服务器后台，使用code 换取 session_key api，将 code 换成 openid 和 session_key
     * @return
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    @RequestMapping(value = "/decodeUserInfo", method = RequestMethod.POST)
    @ResponseBody
    public Map decodeUserInfo(String encryptedData, String iv, String code) {

        Map map = new HashMap();

        // 登录凭证不能为空
        if (code == null || code.length() == 0) {
            map.put("status", 0);
            map.put("msg", "code 不能为空");
            return map;
        }

        // 小程序唯一标识 (在微信小程序管理后台获取)
        String wxspAppid = "wx32dfda65fd24e579";
        // 小程序的 app secret (在微信小程序管理后台获取)
        String wxspSecret = "18e917921e08521f95a9019e8866a747";
        // 授权（必填）
        String grant_type = "authorization_code";

        //////////////// 1、向微信服务器 使用登录凭证 code 获取 session_key 和 openid
        //////////////// ////////////////
        // 请求参数
        String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type="
                + grant_type;
        // 发送请求
        String sr = HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
        // 解析相应内容（转换成json对象）
        JSONObject json = new JSONObject(sr);
        // 获取会话密钥（session_key）
        String session_key = json.get("session_key").toString();
        // 用户的唯一标识（openid）
        String openid = (String) json.get("openid");

        //////////////// 2、对encryptedData加密数据进行AES解密 ////////////////
        try {
            String result = AesCbcUtil.decrypt(encryptedData, session_key, iv, "UTF-8");
            if (null != result && result.length() > 0) {
                map.put("status", 1);
                map.put("msg", "解密成功");

                JSONObject userInfoJSON = new JSONObject(result);
                Map userInfo = new HashMap();
                try {
                    userInfo.put("openId", userInfoJSON.get("openId"));
                    userInfo.put("nickName", userInfoJSON.get("nickName"));
                    System.out.println(userInfo.get("openId"));
                    userInfo.put("gender", userInfoJSON.get("gender"));
                    userInfo.put("city", userInfoJSON.get("city"));
                    userInfo.put("province", userInfoJSON.get("province"));
                    userInfo.put("country", userInfoJSON.get("country"));
                    userInfo.put("avatarUrl", userInfoJSON.get("avatarUrl"));
                    userInfo.put("unionId", userInfoJSON.get("unionId"));
                }catch (Exception e){
                    System.out.println(e);
                }
                UUID uuid = UUID.randomUUID();
                String myOpenId=String.valueOf(userInfoJSON.get("openId"));
        //        if (loginService.selectByKey(myOpenId)==null){
                        Loginstate loginstate=new Loginstate();
                        loginstate.setAppid((String) userInfoJSON.get("openId"));
                        loginstate.setRdSession(String.valueOf(uuid));
                        loginstate.setUpdatetime(new Date());
                        loginService.insert(loginstate);
                        map.put("rd_session",uuid);
        //        }
                addMemberInfo(userInfo);
                map.put("userInfo", userInfo);
            } else {
                map.put("status", 0);
                map.put("msg", "解密失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
