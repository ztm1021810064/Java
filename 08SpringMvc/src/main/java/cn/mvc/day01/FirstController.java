package cn.mvc.day01;/**
 * Created by Happy on 2018-03-19.
 */


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstController implements Controller {
    /**
     *   handleRequest  handle处理    Request 请求
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     * @throws Exception
     */
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/index.jsp");
        return mv;
    }
}
