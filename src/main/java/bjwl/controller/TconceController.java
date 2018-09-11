package bjwl.controller;
/*优惠卷Controller */
import bjwl.pojo.Tconce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;

@RequestMapping("/Tconce")

@Controller
public class TconceController {
    /*生成优惠卷*/
    @ResponseBody
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
    public void selectConce(Integer memID){

    }
}
