package bjwl.controller;
/*订单信息Controller*/
import bjwl.pojo.Torderinfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Torderinfo")
@Controller
public class TorderinfoController {
    /*添加订单*/
    @RequestMapping("/addOrder")
    public void addOrder(Torderinfo torderinfo){

    }
    /*我的订单*/
    @RequestMapping("/selectMyOrder")
    public void selectMyOrder(Integer memID){

    }
}
