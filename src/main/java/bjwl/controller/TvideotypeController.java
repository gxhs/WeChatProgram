package bjwl.controller;
/*视频分类Controller*/
import bjwl.pojo.Tvideotype;
import bjwl.service.TVideoTypeService;
import bjwl.service.impl.TVideoTypeServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/Tvideotype")
@ResponseBody
@Controller
public class TvideotypeController {
    @Autowired
    TVideoTypeService tVideoTypeService;
    /*查询所有的视频类型*/
    @RequestMapping("/selectVideoType")
    public List<Tvideotype> selectVideoType(){
        List<Tvideotype> tvideotypeList = tVideoTypeService.list();
//        Gson gson=new Gson();
//        String json=gson.toJson(tvideotypeList);
//        return json;
        return tvideotypeList;
    }
}
