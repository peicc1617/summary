package designpattern.factory.simplefactory;

/**
 * @基本功能:客户端，利用工厂生产各种笔
 * @program:summary
 * @author:peicc
 * @create:2019-08-15 17:18:30
 **/
//针对简单工厂：如果需要生产另一种类型的笔如钢笔，首先需要实现这个功能类，然后修改工厂方法，违背了开闭原则。
//而对于工厂方法：如果需要生产另一种类型的笔如钢笔，首先需要实现这个功能类，然后添加相关的工厂类，最后去修改客户端代码。
// 看起来比简单工厂方法更复杂了，事实如此吗？
//考虑以下情况：若需要工厂生产钢笔，
// 对于简单工厂而言，需要修改以下三处代码
//对于工厂模式而言：只需要把工厂类换一下即可
public class Client {
    public static void main(String[] args) {
        PenFactory penFactory=new PenFactory();
        Pen pen1=penFactory.createPen("铅笔");//1
        pen1.getPenName();
        Pen pen2=penFactory.createPen("圆珠笔");//2
        pen2.getPenName();
        Pen pen3=penFactory.createPen("毛笔");//3
        pen3.getPenName();
    }
}
