package bjwl.controller;
/*订单信息Controller*/
import bjwl.pojo.Torderinfo;
import bjwl.service.TorderInfoService;
import bjwl.service.impl.TorderInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/Torderinfo")
@ResponseBody
@Controller
public class TorderinfoController {
    @Autowired
    TorderInfoService torderInfoService;
    /*添加订单*/
    @RequestMapping("/addOrder")
    public void addOrder(Torderinfo torderinfo){
        torderInfoService.insert(torderinfo);
    }
    /*我的订单*/
    @RequestMapping("/selectMyOrder")
    public List<Torderinfo> selectMyOrder(Integer memID){
        List<Torderinfo> torderinfoList = torderInfoService.selectById(memID);
        return torderinfoList;
    }
}
