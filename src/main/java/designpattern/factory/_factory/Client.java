package designpattern.factory._factory;

import designpattern.factory.simplefactory.Pen;
import designpattern.factory.simplefactory.PenFactory;

/**
 * @基本功能:客户端
 * @program:summary
 * @author:peicc
 * @create:2019-08-15 18:11:53
 **/
//工厂方式：使得一个类的实例化延迟到其子类
public class Client {
    public static void main(String[] args) {
        //判断逻辑在客户端实现
        AbstractPenFactory pencileFactory=new PencileFactory();
        Pen pen1=pencileFactory.createPen();
        pen1.getPenName();
        Pen pen2=pencileFactory.createPen();
        pen2.getPenName();
        Pen pen3=pencileFactory.createPen();
        pen3.getPenName();
    }
}
