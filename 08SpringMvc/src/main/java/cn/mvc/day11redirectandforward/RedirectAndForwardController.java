package cn.mvc.day11redirectandforward;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class RedirectAndForwardController {
    //重定向到页面
  @RequestMapping("/first")
    public String doFirst(Model model){
      model.addAttribute("msg","考试");
      return "redirect:/day10/success.jsp";
  }


    @RequestMapping("/listBooks")
    public String listBooks(){
        return "success";
    }
    //转发到处理器方法
    @RequestMapping("/addBook")
    public String addBook(Model model){
        model.addAttribute("msg","考试");
        return "forward:listBooks";
    }


    @RequestMapping("/listBooksRedirect")
    public String listBooksRedirect(){
        return "success";
    }
    //重定向到处理器方法
    @RequestMapping("/addBookRedirect")
    public String addBookRedirect(Model model){
        model.addAttribute("msg","考试");
        return "redirect:listBooksRedirect";
    }
}
