package bjwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("")
public class LoginStata {

    @RequestMapping("")
    @ResponseBody
    public String getState(String state){
        System.out.println("================================");
//        Map map = new HashMap();
//        map.put("state",state);
        return state;
    }
}
