package bjwl.controller;
/*优惠卷Controller */
import bjwl.pojo.Tconce;
import bjwl.service.TConceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;

import java.util.List;

@RequestMapping("/Tconce")
@ResponseBody
@Controller
public class TconceController {

    @Autowired
    TConceService tConceService;

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
    public List<Tconce> selectConce(Integer memID){
        return tConceService.selectTconecByUserID(memID);
    }
}
