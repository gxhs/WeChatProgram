package bjwl.controller;
/*会员信息Controller */
import bjwl.pojo.Tmenberinfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Tmenberinfo")
@Controller
public class TmenberinfoController {
    /*添加用户的基本信息,可为空*/
    @RequestMapping("/addMemberInfo")
    public void addMemberInfo(Tmenberinfo tmenberinfo){

    }
    /*绑定手机号*/
    @RequestMapping("/addPhoneNumber")
    public void addPhoneNumber(String PhoneNum){

    }

}
