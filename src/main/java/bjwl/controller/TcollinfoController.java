package bjwl.controller;
/*收藏信息COntroller*/

import bjwl.pojo.Key.TcollinfoKey;
import bjwl.pojo.Tcollinfo;
import bjwl.pojo.Tmenberinfo;
import bjwl.pojo.Tvideoinfo;
import bjwl.service.TCollInfoService;
import bjwl.service.TCommitService;
import bjwl.service.TmenberInfoService;
import bjwl.service.TvideoInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@RequestMapping("/Tcollinfo")
@ResponseBody
@Controller
public class TcollinfoController {

    @Autowired
    TCollInfoService tCollInfoService;
    @Autowired
    TmenberInfoService tmenberInfoService;
    @Autowired
    TvideoInfoService tvideoInfoService;
    @Autowired
    TCommitService tCommitService;

    /*我的收藏*/
    @RequestMapping("/myCollect")
    public List<Tvideoinfo> myCollect(@Param("openId") String openId){
        Tmenberinfo tmenberinfo = tmenberInfoService.selectIdBymemName(openId);
        List<Tcollinfo> tcollinfoList = tCollInfoService.selectVideobyUserId(tmenberinfo.getMemid());
        List<Tvideoinfo> tvideoinfoList = new ArrayList<>();
        for (Tcollinfo tcollinfo:tcollinfoList){
            tvideoinfoList.add(tvideoInfoService.selectByPrimaryKey(tcollinfo.getId()));
        }
        for(Tvideoinfo tvideoinfo2 : tvideoinfoList){
            int collection=tCollInfoService.countByVideoId(tvideoinfo2.getId());
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tvideoinfo2.getOntime());
            int commit=tCommitService.countById(tvideoinfo2.getId());
            tvideoinfo2.setTime(time);
            tvideoinfo2.setCollection(collection);
            tvideoinfo2.setCollectionNummber(commit);
        }
        return tvideoinfoList;
    }
    /*添加收藏*/
    @RequestMapping("/addCollect")
    public int addCollect(Tcollinfo tcollinfo, @Param("openId") String openId){
        System.out.println(tcollinfo.getId());
        System.out.println(openId+"sssssssssssssssssssssss");
        Tmenberinfo tmenberinfo = tmenberInfoService.selectIdBymemName(openId);
        tcollinfo.setMemid(tmenberinfo.getMemid());
        tcollinfo.setColltm(new Date());
        tCollInfoService.insert(tcollinfo);
        int num =  tCollInfoService.countByVideoId(tcollinfo.getId());
        return num;
    }
    /*取消收藏*/
    @RequestMapping("/deleteCollect")
    public int  deleteCollect(TcollinfoKey tcollinfoKey,@Param("openId") String openId){
        Tmenberinfo tmenberinfo = tmenberInfoService.selectIdBymemName(openId);
        tcollinfoKey.setMemid(tmenberinfo.getMemid());
        tCollInfoService.delete(tcollinfoKey);
        int num =  tCollInfoService.countByVideoId(tcollinfoKey.getId());
        return num;
    }

    /*查询本视频的收藏人数*/
    @RequestMapping("/selectCollectNumber")
    public int selectCollectNumber(Integer ID){
        int num =  tCollInfoService.countByVideoId(ID);
        return num;
    }
}
