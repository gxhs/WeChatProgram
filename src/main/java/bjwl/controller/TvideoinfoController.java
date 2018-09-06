package bjwl.controller;
/*视频信息Controller*/
import bjwl.pojo.Tvideoinfo;
import bjwl.service.TvideoInfoService;
import bjwl.service.impl.TvideoInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/Tvideoinfo")
@ResponseBody
@Controller
public class TvideoinfoController {
    @Autowired
    TvideoInfoService tvideoInfoService;
    /*获取视频信息*/
    @RequestMapping("/getVideoInfo")
    public List<Tvideoinfo> getVideoInfo(Integer ID){
        List<Tvideoinfo> tvideoinfoList = tvideoInfoService.list(ID);
        return tvideoinfoList;
    }
    /*更新点击量*/
    @RequestMapping("/updateClickNum")
    public void updateClickNum(Tvideoinfo tvideoinfo){
        tvideoInfoService.updateClickNumByid(tvideoinfo);
    }
}
