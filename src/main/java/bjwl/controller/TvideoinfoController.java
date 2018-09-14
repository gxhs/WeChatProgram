package bjwl.controller;
/*视频信息Controller*/
import bjwl.pojo.Key.TcollinfoKey;
import bjwl.pojo.Tvideoinfo;
import bjwl.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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
    @Autowired
    private LoginService loginService;
    @Autowired
    TmenberInfoService tmenberInfoService;

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
    public List<Tvideoinfo> getListAll(HttpServletRequest request) throws ParseException {
        String re_session= request.getParameter("rd_session");
        System.out.println(re_session+"====================re");
        List<Tvideoinfo> tvideoinfoList = tvideoInfoService.getListAll();
        for(Tvideoinfo tvideoinfo : tvideoinfoList){
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tvideoinfo.getOntime());
            int collection=tCollInfoService.countByVideoId(tvideoinfo.getId());
            int commit=tCommitService.countById(tvideoinfo.getId());
            if (re_session!=null){
                String openid=loginService.selectOpenIdByRe(re_session).get(0).getAppid();
                int memId=tmenberInfoService.selectIdBymemName(openid).getMemid();
                int iscollect=iscollect(tvideoinfo.getId(),memId);
                System.out.println(iscollect+"--------------------is");
                tvideoinfo.setIscollect(iscollect);
            }else {
                tvideoinfo.setIscollect(0);
            }
            tvideoinfo.setTime(time);
            tvideoinfo.setCollection(collection);
            tvideoinfo.setCollectionNummber(commit);
        }
        return tvideoinfoList;
     }

    /*根据分类获取视频信息*/
    @RequestMapping("/getVideoByTypeId")
    public List<Tvideoinfo> getVideoByTypeId(HttpServletRequest request,int typeId){
        String re_session= request.getParameter("rd_session");
        System.out.println("-------------------------------视频分类id"+typeId);
        List<Tvideoinfo> tvideoinfoList = tvideoInfoService.getVideoByTypeId(typeId);
        for(Tvideoinfo tvideoinfo : tvideoinfoList){
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tvideoinfo.getOntime());
            int collection=tCollInfoService.countByVideoId(tvideoinfo.getId());
            int commit=tCommitService.countById(tvideoinfo.getId());
            if (re_session!=null){
                String openid=loginService.selectOpenIdByRe(re_session).get(0).getAppid();
                int memId=tmenberInfoService.selectIdBymemName(openid).getMemid();
                int iscollect=iscollect(tvideoinfo.getId(),memId);
                System.out.println(iscollect+"--------------------is");
                tvideoinfo.setIscollect(iscollect);
            }else {
                tvideoinfo.setIscollect(0);
            }
            System.out.println(commit+collection+"评论+++++++++++++++++++++++++++收藏");
            System.out.println();
            tvideoinfo.setTime(time);
            tvideoinfo.setCollection(collection);
            tvideoinfo.setCollectionNummber(commit);
        }
        return tvideoinfoList;
    }

    /*搜索视频*/
    @RequestMapping("/findMovies")
    public List<Tvideoinfo> findMovies(String findName){
        System.out.println(findName+"----finName");
        List<Tvideoinfo> tvideoinfoList1 = tvideoInfoService.findMovie(findName);
        for (Tvideoinfo tvideoinfo1:tvideoinfoList1){
            int collection=tCollInfoService.countByVideoId(tvideoinfo1.getId());
            int commit=tCommitService.countById(tvideoinfo1.getId());
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tvideoinfo1.getOntime());
            tvideoinfo1.setTime(time);
            tvideoinfo1.setCollection(collection);
            tvideoinfo1.setCollectionNummber(commit);
        }
        return tvideoinfoList1;
    }

    /*根据分类获取视频信息*/
    @RequestMapping("/getVideoById")
    public Tvideoinfo getVideoById(HttpServletRequest request,int videoId){
        String re_session= request.getParameter("rd_session");
        System.out.println("-------------------------------视频分类id"+videoId);
        Tvideoinfo tvideoinfo = tvideoInfoService.selectByPrimaryKey(videoId);
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tvideoinfo.getOntime());
        int collection=tCollInfoService.countByVideoId(tvideoinfo.getId());
        int commit=tCommitService.countById(tvideoinfo.getId());
            if (re_session!=null){
                String openid=loginService.selectOpenIdByRe(re_session).get(0).getAppid();
                int memId=tmenberInfoService.selectIdBymemName(openid).getMemid();
                int iscollect=iscollect(tvideoinfo.getId(),memId);
                System.out.println(iscollect+"--------------------is");
                tvideoinfo.setIscollect(iscollect);
            }else {
                tvideoinfo.setIscollect(0);
            }
            System.out.println(commit+collection+"评论+++++++++++++++++++++++++++收藏");
            System.out.println();
            tvideoinfo.setTime(time);
            tvideoinfo.setCollection(collection);
            tvideoinfo.setCollectionNummber(commit);

        return tvideoinfo;
    }

    public int iscollect(Integer id,Integer memId){
        TcollinfoKey tcollinfoKey=new TcollinfoKey();
        tcollinfoKey.setMemid(memId);
        tcollinfoKey.setId(id);
        if(tCollInfoService.countByKey(tcollinfoKey)==null){
            return 0;
        }return 1;
    }

}
