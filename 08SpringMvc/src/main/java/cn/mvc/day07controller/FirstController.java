package cn.mvc.day07controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/Logger")
public class FirstController  {
    //*通配都的是  0到 多个  字符
    @RequestMapping("/*someFirst")
    public String  doSomeFirst(){
        return "first";
    }

    //*通配都的是  0到 多个  字符   只要以someSecond开头就可以
    @RequestMapping("/someSecond*")
    public String  doSomeSecond(){
        return "first";
    }

    //*通配都的是  0到 多个  字符   在someThird之前可以有0到N级目录
    @RequestMapping("/**/someThird")
    public String  doSomeThird(){
        return "first";
    }

    //*通配都的是  0到 多个  字符   必须有一级目录
    @RequestMapping("/*/someFour")
    public String  doSomeFour(){
        return "first";
    }

    //*通配都的是  0到 多个  字符   必须有一级目录
    @RequestMapping("/someFive*Six")
    public String  doSomeFive(){
        return "first";
    }

    //mvc  get  post

    //GPR  get  post  redirect  get一把

    @RequestMapping(value = "/first",method = RequestMethod.GET)
    public String  doFirst(){
        return "first";
    }


    @RequestMapping(value = "/first",method = RequestMethod.POST)
    public String  doFirst(String uname,String upwd){
        System.out.println(uname);
        System.out.println(upwd);
        return "first";
    }
    @RequestMapping("/second")
    public String  doSecond(){
        return "second";
    }

    @RequestMapping("/third")
    public String  doThird(){
        return "third";
    }

}











