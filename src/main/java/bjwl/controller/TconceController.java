package bjwl.controller;
/*优惠卷Controller */
import bjwl.pojo.Tconce;
import bjwl.pojo.Tmenberinfo;
import bjwl.service.TConceService;
import bjwl.service.TmenberInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/Tconce")
@ResponseBody
@Controller
public class TconceController {

    @Autowired
    TConceService tConceService;
    @Autowired
    TmenberInfoService tmenberInfoService;

    /*生成优惠卷*/
    @RequestMapping("/addConce")
    public String addConce(String name){
        System.out.println(name);
        Gson gson=new Gson();
        String json=gson.toJson(name);
        System.out.println("请求连接！！！！！！！！！！！11");
        return json;
    }
    /*查看用户的优惠卷*/
    @RequestMapping("/selectConce")
    public Map selectConce(@Param("openId") String openId){
        Map map=new HashMap();
        System.out.println(openId+"===================");
        Tmenberinfo tmenberinfo = tmenberInfoService.selectIdBymemName(openId);
        List<Tconce> tconceList = tConceService.selectTconecByUserID(tmenberinfo.getMemid());
        int number=tconceList.size();
        if (0==number){
            map.put("number","zero");
            return map;
        }else {
        System.out.println(number+"nubmer==========================");
        map.put("number",number);
        return map;}
    }
}
