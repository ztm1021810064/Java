package cn.mvc.day05multiactioncontroller;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyMultiActionController extends MultiActionController {
    public String doFirst(HttpServletRequest request, HttpServletResponse response){
        return "first";
    }

    public String doSecond(HttpServletRequest request, HttpServletResponse response){
        return "second";
    }
}
