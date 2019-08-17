package designpattern.factory._factory;

import designpattern.factory.simplefactory.BallPen;
import designpattern.factory.simplefactory.Pen;

/**
 * @基本功能:圆珠笔工厂
 * @program:summary
 * @author:peicc
 * @create:2019-08-15 17:33:54
 **/
public class BallPenFactory implements AbstractPenFactory {
    @Override
    public Pen createPen() {
        System.out.println("圆珠笔工厂");
        return new BallPen();
    }
}
