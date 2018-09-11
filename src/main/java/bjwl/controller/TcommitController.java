package bjwl.controller;
/*评论Controller*/
import bjwl.pojo.Tcommit;
import bjwl.service.TCommitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/Tcommit")
@ResponseBody
@Controller
public class TcommitController {

    @Autowired
    TCommitService tCommitService;

    /*添加评论*/
    @RequestMapping("/addCommit")
    public int addCommit(Tcommit tcommit){
       return tCommitService.insert(tcommit);
    }
    /*查询该视频的评论*/
    @RequestMapping("/selectCommit")
    public List<Tcommit> selectCommit(Integer ID){
        List<Tcommit> tcommitList = tCommitService.selectbyTvideoId(ID);
        return  tcommitList;
    }
}
