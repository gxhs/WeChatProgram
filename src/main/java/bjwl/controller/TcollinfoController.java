package bjwl.controller;
/*收藏信息COntroller*/

import bjwl.pojo.Key.TcollinfoKey;
import bjwl.pojo.Tcollinfo;
import bjwl.pojo.Tconce;
import bjwl.pojo.Tmenberinfo;
import bjwl.pojo.Tvideoinfo;
import bjwl.service.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
    @Autowired
    TConceService tConceService;

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
    public String addCollect(Tcollinfo tcollinfo, @Param("openId") String openId){
        System.out.println(tcollinfo.getId());
        System.out.println(openId+"sssssssssssssssssssssss");
        Tmenberinfo tmenberinfo = tmenberInfoService.selectIdBymemName(openId);
        tcollinfo.setMemid(tmenberinfo.getMemid());
        tcollinfo.setColltm(new Date());
        int state=tCollInfoService.insert(tcollinfo);
        //System.out.println(state+"**************************state");
        if(state==1){
               /*添加优惠卷*/
                Tconce tconce=new Tconce();
                tconce.setMemid(tmenberinfo.getMemid());
            //System.out.println(new Date()+"----------oldTime");
                tconce.setSendtm(new Date());
                //获取时间加一年或加一月或加一天
                Date date = new Date();
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);//设置起时间
                //System.out.println("111111111::::"+cal.getTime());
                //cal.add(Calendar.YEAR, 1);//增加一年
               //add(Calendar.DATE, n);//增加一天
                //cal.add(Calendar.DATE, -10);//减10天
                cal.add(Calendar.MONTH, +1);//增加一个月
            //System.out.println(cal.getTime()+"-----------newTime");
                tconce.setLosetm(cal.getTime());
                tconce.setIflose(false);
                tconce.setFacevalue(1);
                tconce.setState(1);
                tConceService.addTconecByUserID(tconce);
            return "success";
        }
        return "fail";
    }

    /*取消收藏*/
    @RequestMapping("/deleteCollect")
    public String  deleteCollect(TcollinfoKey tcollinfoKey,@Param("openId") String openId){
        Tmenberinfo tmenberinfo = tmenberInfoService.selectIdBymemName(openId);
        tcollinfoKey.setMemid(tmenberinfo.getMemid());
        int state=tCollInfoService.delete(tcollinfoKey);
        int num =  tCollInfoService.countByVideoId(tcollinfoKey.getId());
        if(state==1){
            return "success";
        }
        return "fail";
    }

    /*查询本视频的收藏人数*/
    @RequestMapping("/selectCollectNumber")
    public int selectCollectNumber(Integer ID){
        int num =  tCollInfoService.countByVideoId(ID);
        return num;
    }
}
