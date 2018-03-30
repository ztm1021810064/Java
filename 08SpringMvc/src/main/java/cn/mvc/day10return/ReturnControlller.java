package cn.mvc.day10return;/**
 * Created by Happy on 2018-03-26.
 */

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.registry.infomodel.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Controller
public class ReturnControlller {
    @RequestMapping("/one")
    public void One(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<UserInfo> list=new ArrayList<UserInfo>();
        UserInfo u1=new UserInfo();

        u1.setUsername("光辉岁月");
        u1.setPassword("密码");

        UserInfo u2=new UserInfo();
        u2.setUsername("明天会更好");
        u2.setPassword("密码2");

        list.add(u1);
        list.add(u2);

        String data = JSON.toJSONString(list);

        //如何将这个集合转成json ，并且回送给浏览器
        response.getWriter().write(data);

    }
}
