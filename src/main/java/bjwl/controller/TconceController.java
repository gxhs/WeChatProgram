package bjwl.controller;
/*优惠卷Controller */
import bjwl.pojo.Tconce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Tconce")
@Controller
public class TconceController {
    /*生成优惠卷*/
    @RequestMapping("/addConce")
    public void addConce(Tconce tconce){

    }
    /*查看用户的优惠卷*/
    @RequestMapping("/selectConce")
    public void selectConce(Integer memID){

    }
}
