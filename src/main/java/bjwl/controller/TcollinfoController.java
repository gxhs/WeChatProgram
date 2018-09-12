package bjwl.controller;
/*收藏信息COntroller*/

import bjwl.pojo.Key.TcollinfoKey;
import bjwl.pojo.Tcollinfo;
import bjwl.pojo.Tmenberinfo;
import bjwl.service.TCollInfoService;
import bjwl.service.TmenberInfoService;
import org.apache.ibatis.annotations.Param;
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
    @Autowired
    TmenberInfoService tmenberInfoService;
    /*我的收藏*/
    @RequestMapping("/myCollect")
    public List<Tcollinfo> myCollect(Integer memID){
        List<Tcollinfo> tcollinfoList = tCollInfoService.selectVideobyUserId(memID);
        return tcollinfoList;
    }
    /*添加收藏*/
    @RequestMapping("/addCollect")
    public int addCollect(Tcollinfo tcollinfo, @Param("openId") String openId){
        System.out.println(tcollinfo.getId());
        System.out.println(openId+"sssssssssssssssssssssss");
        Tmenberinfo tmenberinfo = tmenberInfoService.selectIdBymemName(openId);
        tcollinfo.setMemid(tmenberinfo.getMemid());
        tCollInfoService.insert(tcollinfo);
        int num =  tCollInfoService.countByVideoId(tcollinfo.getId());
        return num;
    }
    /*取消收藏*/
    @RequestMapping("/deleteCollect")
    public int  deleteCollect(TcollinfoKey tcollinfoKey){
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
