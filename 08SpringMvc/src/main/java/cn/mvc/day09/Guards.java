package cn.mvc.day09;
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    public void Attack() {
        System.out.print("1"+name+"1");
    }

    public void Defense() {
        System.out.print("1"+name+"2");
    }
}
