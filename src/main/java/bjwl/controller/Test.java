package bjwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;

@RequestMapping("/test")
@Controller
public class Test {


    @ResponseBody
    @RequestMapping("/a")
    public String test(){
        System.out.println("hello World!");
        //return new Gson().toJson("hello World!");
        return "hello World!";


    }
}
