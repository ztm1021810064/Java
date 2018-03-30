package cn.mvc.day10return;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ReturnObjectController {
    @RequestMapping("/first")
    @ResponseBody
    public Object doFirst(){
        return 1;
    }

    @RequestMapping(value = "/second",produces = "text/html;charset=utf-8")
    @ResponseBody
    public Object doSecond(){
        return "就业拼了";
    }
     //对象类型
    @RequestMapping(value = "/third")
    @ResponseBody
    public Object doThird(){
        UserInfo u1=new UserInfo();

        u1.setUsername("友情岁月");
        u1.setPassword("123456");
        return  u1;
    }

    //集合类型List
    @RequestMapping(value = "/four")
    @ResponseBody
    public Object doFour(){
        List<UserInfo> list=new ArrayList<UserInfo>();
        UserInfo u1=new UserInfo();

        u1.setUsername("友情岁月");
        u1.setPassword("123456");

               UserInfo u2=new UserInfo();
        u2.setUsername("明天会更好");
        u2.setPassword("密码2");

        list.add(u1);
        list.add(u2);
        return list;
    }
    //集合类型Map
    @RequestMapping(value = "/five")
    @ResponseBody
    public Object doFive(){
        Map<String,UserInfo> map=new HashMap<String,UserInfo>();
        UserInfo u1=new UserInfo();

        u1.setUsername("友情岁月");
        u1.setPassword("123456");

        UserInfo u2=new UserInfo();
        u2.setUsername("明天会更好");
        u2.setPassword("密码2");

        map.put(u1.getUsername(),u1);
        map.put(u2.getUsername(),u2);
        return map;
    }
}
