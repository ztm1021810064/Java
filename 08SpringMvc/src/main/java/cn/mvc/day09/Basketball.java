package cn.mvc.day09;

import org.springframework.web.filter.CharacterEncodingFilter;

public class Basketball {

    public static void main(String[] args) {

        Player b=new Forwards("巴蒂尔");
        b.Attack();
        Player m=new Guards("麦克格雷迪");
        m.Attack();
	  /*Player ym=new Center("姚明");
	  ym.Attack();
	  ym.Defense();*/
        Player ym=new Translator("姚明");
        ym.Attack();
        ym.Defense();
    }
}
