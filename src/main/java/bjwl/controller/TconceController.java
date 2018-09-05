package bjwl.controller;
/*优惠卷Controller */
import bjwl.pojo.Tconce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/Tconce")
@ResponseBody
@Controller
public class TconceController {
    /*生成优惠卷*/
    @RequestMapping("/addConce")
    public String addConce(Tconce tconce){

        return "hello,word";
    }
    /*查看用户的优惠卷*/
    @RequestMapping("/selectConce")
    public void selectConce(Integer memID){

    }
}
