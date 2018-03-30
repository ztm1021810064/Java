package cn.mvc.day08autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserInfoController {
    //01.  零散参数的装配
    @RequestMapping("/login")
    public String login(@RequestParam("uname") String username, String password, Model model) {
        model.addAttribute("uname", username);
        System.out.println("username=" + username);
        System.out.println("password=" + password);
        return "success";
    }

    //02. 对象类型参数装配
    @RequestMapping("/loginObject")
    public String loginObject(UserInfo info, Model model) {
        model.addAttribute("uname", info.getUsername());
        System.out.println("username=" + info.getUsername());
        System.out.println("password=" + info.getPassword());
        return "success";
    }

    //03. 域属性参数装配
    @RequestMapping("/loginAreaProperty")
    public String loginAreaProperty(UserInfo info, Model model) {
        model.addAttribute("uname", info.getUsername());
        System.out.println("username=" + info.getUsername());
        System.out.println("password=" + info.getPassword());
        System.out.println("password=" + info.getCar().getBrand());
        return "success";
    }

    //04. 集合的参数装配
    @RequestMapping("/loginList")
    public String loginList(UserInfo info, Model model) {
        model.addAttribute("uname", info.getUsername());
        System.out.println("username=" + info.getUsername());
        System.out.println("password=" + info.getPassword());
        System.out.println("password=" + info.getCar().getBrand());
        System.out.println("password=" + info.getGirlList().get(0).getCool());
        System.out.println("password=" + info.getGirlList().get(1).getCool());
        return "success";
    }


    //05.PathVariable
    @RequestMapping("/loginPathVariable/{name}")
    public String loginPathVariable(@PathVariable("name") String username,String uname) {
        System.out.println("username="+username);
        System.out.println("uname="+uname);
        return "success";
    }
}







