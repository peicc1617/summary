package designpattern.factory.simplefactory;

/**
 * @基本功能:圆珠笔
 * @program:summary
 * @author:peicc
 * @create:2019-08-15 17:13:32
 **/
public class BallPen implements Pen {
    @Override
    public void getPenName() {
        System.out.println("圆珠笔");
    }
}
