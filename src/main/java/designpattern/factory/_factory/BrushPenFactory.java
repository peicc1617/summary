package designpattern.factory._factory;

import designpattern.factory.simplefactory.BrushPen;
import designpattern.factory.simplefactory.Pen;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-15 17:36:38
 **/
public class BrushPenFactory implements AbstractPenFactory {
    @Override
    public Pen createPen() {
        System.out.println("毛笔工厂");
        return new BrushPen();
    }
}
