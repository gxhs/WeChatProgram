package bjwl.controller;
/*视频信息Controller*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Tvideoinfo")
@Controller
public class TvideoinfoController {
    /*获取视频信息*/
    @RequestMapping("/getVideoInfo")
    public void getVideoInfo(Integer ID){

    }
    /*更新点击量*/
    @RequestMapping("/updateClickNum")
    public void updateClickNum(Integer ID){

    }
}
