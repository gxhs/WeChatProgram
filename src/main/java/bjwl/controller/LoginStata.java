package bjwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class LoginStata {

    @RequestMapping("/state")
    @ResponseBody
    public String getState(){
        System.out.println("==========================+++++++++++++++++++======");
//        Map map = new HashMap();
//        map.put("state",state);
        return "false";
    }
}
