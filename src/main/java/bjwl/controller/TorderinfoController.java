package bjwl.controller;
/*订单信息Controller*/
import bjwl.pojo.Tmenberinfo;
import bjwl.pojo.Torderinfo;
import bjwl.pojo.Tvideoinfo;
import bjwl.service.*;
import bjwl.service.impl.TorderInfoServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("/Torderinfo")
@ResponseBody
@Controller
public class TorderinfoController {
    @Autowired
    TCollInfoService tCollInfoService;
    @Autowired
    TorderInfoService torderInfoService;
    @Autowired
    TmenberInfoService tmenberInfoService;
    @Autowired
    TvideoInfoService tvideoInfoService;
    @Autowired
    TCommitService tCommitService;
    /*添加订单*/
    @RequestMapping("/addOrder")
    public void addOrder(Torderinfo torderinfo,@Param("openId") String openId){
        Tmenberinfo tmenberinfo = tmenberInfoService.selectIdBymemName(openId);
        torderinfo.setMemid(tmenberinfo.getMemid());
        torderinfo.setOrdertm(new Date());
        torderinfo.setFee(1f);
        torderInfoService.insert(torderinfo);
    }
    /*我的订单*/
    @RequestMapping("/selectMyOrder")
    public List<Tvideoinfo> selectMyOrder(@Param("openId") String openId){
        Tmenberinfo tmenberinfo = tmenberInfoService.selectIdBymemName(openId);
        List<Torderinfo> torderinfoList = torderInfoService.selectById(tmenberinfo.getMemid());
        List<Tvideoinfo> tvideoinfoList3 = new ArrayList<>();
        for (Torderinfo torderinfo:torderinfoList){
            tvideoinfoList3.add(tvideoInfoService.selectByPrimaryKey(torderinfo.getId()));
        }
        for(Tvideoinfo tvideoinfo2 : tvideoinfoList3){
            int collection=tCollInfoService.countByVideoId(tvideoinfo2.getId());
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tvideoinfo2.getOntime());
            int commit=tCommitService.countById(tvideoinfo2.getId());
            tvideoinfo2.setCollection(collection);
            tvideoinfo2.setTime(time);
            tvideoinfo2.setCollectionNummber(commit);
        }
        return tvideoinfoList3;
    }
}
