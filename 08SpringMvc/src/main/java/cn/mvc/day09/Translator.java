package cn.mvc.day09;
public class Translator extends Player {
    //声明并实例化一个 外籍中锋 对象
    ForeignCenter wjzf=new ForeignCenter();

    public Translator(String name) {
        super(name);
        wjzf.setName(name);
    }

    @Override
    public void Attack() {
        wjzf.进攻();

    }

    @Override
    public void Defense() {
        wjzf.防守();

    }
}
