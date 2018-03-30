package cn.mvc.day09;
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    public void Attack() {
        System.out.print("中锋"+name+"1");
    }

    public void Defense() {
        System.out.print("中锋"+name+"2");
    }
}
