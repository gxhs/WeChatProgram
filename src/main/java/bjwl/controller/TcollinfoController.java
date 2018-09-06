package bjwl.controller;
/*收藏信息COntroller*/

import bjwl.pojo.Tcollinfo;
import bjwl.service.TCollInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@RequestMapping("/Tcollinfo")
@ResponseBody
@Controller
public class TcollinfoController {

    @Autowired
    TCollInfoService tCollInfoService;
    /*我的收藏*/
    @RequestMapping("/myCollect")
    public List<Tcollinfo> myCollect(Integer memID){
        List<Tcollinfo> tcollinfoList = tCollInfoService.selectVideobyUserId(memID);
        return tcollinfoList;
    }
    /*添加收藏*/
    @RequestMapping("/addCollect")
    public void addCollect(Tcollinfo tcollinfo){
    tCollInfoService.insert(tcollinfo);
    }
    /*查询本视频的收藏人数*/
    @RequestMapping("/selectCollectNumber")
    public int selectCollectNumber(Integer ID){
       int num =  tCollInfoService.countByVideoId(ID);
       return num;
    }

}
