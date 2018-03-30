package cn.mvc.day09;
public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    public void Attack() {
        System.out.print("前锋"+name+"1");
    }

    public void Defense() {
        System.out.print("前锋"+name+"2");
    }
}
