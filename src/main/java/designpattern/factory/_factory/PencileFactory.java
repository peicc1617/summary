package designpattern.factory._factory;

import designpattern.factory.simplefactory.Pen;
import designpattern.factory.simplefactory.Pencile;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-15 17:38:05
 **/
public class PencileFactory implements AbstractPenFactory {
    @Override
    public Pen createPen() {
        System.out.println("铅笔工厂");
        return new Pencile();
    }
}
