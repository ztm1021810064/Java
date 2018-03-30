package cn.mvc.day09;/**
 * Created by Happy on 2018-03-26.
 */

/**
 * 作者：微冷的雨
 *
 * @create 2018-03-26
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public abstract class Player {

    protected String name;
    public Player(String name){
        this.name=name;
    }

    //进攻和防守方法
    public abstract void Attack();
    public abstract void Defense();
}
