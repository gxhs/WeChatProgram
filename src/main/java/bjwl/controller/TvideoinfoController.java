package bjwl.controller;
/*视频信息Controller*/
import bjwl.pojo.Tvideoinfo;
import bjwl.service.TCollInfoService;
import bjwl.service.TCommitService;
import bjwl.service.TvideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("/Tvideoinfo")
@ResponseBody
@Controller
public class TvideoinfoController {
    @Autowired
    TvideoInfoService tvideoInfoService;
    @Autowired
    TCommitService tCommitService;
    @Autowired
    TCollInfoService tCollInfoService;

    /*获取视频信息*/
    @RequestMapping("/getVideoInfo")
    public List<Tvideoinfo> getVideoInfo(Integer ID){
        List<Tvideoinfo> tvideoinfoList = tvideoInfoService.getVideo(ID);
        return tvideoinfoList;
    }

    /*更新点击量*/
    @RequestMapping("/updateClickNum")
    public void updateClickNum(Tvideoinfo tvideoinfo){
        tvideoInfoService.updateClickNumByid(tvideoinfo);
    }

    /*获取视频信息*/
    @RequestMapping("/getListAll")
    public List<Tvideoinfo> getListAll() throws ParseException {
        List<Tvideoinfo> tvideoinfoList = tvideoInfoService.getListAll();
        for(Tvideoinfo tvideoinfo : tvideoinfoList){
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tvideoinfo.getOntime());
            int collection=tCollInfoService.countByVideoId(tvideoinfo.getId());
            int commit=tCommitService.countById(tvideoinfo.getId());
            tvideoinfo.setTime(time);
            tvideoinfo.setCollection(collection);
            tvideoinfo.setCollectionNummber(commit);
        }
        return tvideoinfoList;
     }

    /*根据分类获取视频信息*/
    @RequestMapping("/getVideoByTypeId")
    public List<Tvideoinfo> getVideoByTypeId(int typeId){
        System.out.println("-------------------------------视频分类id"+typeId);
        List<Tvideoinfo> tvideoinfoList = tvideoInfoService.getVideoByTypeId(typeId);
        return tvideoinfoList;
    }

    /*搜索视频*/
    @RequestMapping("/findMovies")
    public List<Tvideoinfo> findMovies(String findName){
        return tvideoInfoService.findMovie(findName);
    }

}
