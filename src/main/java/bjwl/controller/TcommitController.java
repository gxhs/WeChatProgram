package bjwl.controller;
/*评论Controller*/
import bjwl.pojo.Tcommit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Tcommit")
@Controller
public class TcommitController {
    /*添加评论*/
    @RequestMapping("/addCommit")
    public void addCommit(Tcommit tcommit){

    }
    /*查询该视频的评论*/
    @RequestMapping("/selectCommit")
    public void selectCommit(Integer ID){

    }
}
