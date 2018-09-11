package bjwl.controller;
/*会员信息Controller */
import bjwl.pojo.Tmenberinfo;
import bjwl.service.TmenberInfoService;
import bjwl.service.impl.TmenberInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.management.ThreadInfo;
import java.util.Date;
import java.util.Map;

@RequestMapping("/Tmenberinfo")
@ResponseBody
@Controller
public class TmenberinfoController {

    @Autowired
    TmenberInfoService tmenberInfoService;
    /*添加用户的基本信息,可为空*/
    @RequestMapping("/addMemberInfo")
    public void addMemberInfo(Map map){
        Map userInfo= (Map) map.get("userInfo");
        Tmenberinfo tmenberinfo=new Tmenberinfo();
        tmenberinfo.setWxno((String) userInfo.get("nickName"));
        tmenberinfo.setRegtm(new Date());
        tmenberinfo.setMemname((String) userInfo.get("openId"));
        tmenberInfoService.insert(tmenberinfo);
    }
    /*绑定手机号*/
    @RequestMapping("/addPhoneNumber")
    public void addPhoneNumber(Tmenberinfo tmenberinfo){
        tmenberInfoService.updateBynotNull(tmenberinfo);
    }

}
