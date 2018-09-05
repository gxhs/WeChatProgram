package bjwl.controller;
/*收藏信息COntroller*/
import bjwl.pojo.Tcollinfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Tcollinfo")
@Controller
public class TcollinfoController {
    /*我的收藏*/
    @RequestMapping("/myCollect")
    public void myCollect(Integer memID){

    }
    /*添加收藏*/
    @RequestMapping("/addCollect")
    public void addCollect(Tcollinfo tcollinfo){

    }
    /*查询本视频的收藏人数*/
    @RequestMapping("/selectCollectNumber")
    public void selectCollectNumber(Integer ID){

    }

}
