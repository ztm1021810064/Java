package cn.mvc.day06viewresolver;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyViewResolverController extends MultiActionController {
    //外部视图对象引用
    public String doFirst(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        return "OuterViewObject";
    }
    //内部视图对象引用
    public String doSecond(HttpServletRequest request, HttpServletResponse response){
        return "InnerViewObject";
    }
}
