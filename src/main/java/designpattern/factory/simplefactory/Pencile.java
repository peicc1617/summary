package designpattern.factory.simplefactory;

/**
 * @基本功能:铅笔
 * @program:summary
 * @author:peicc
 * @create:2019-08-15 17:12:14
 **/
public class Pencile implements Pen {
    @Override
    public void getPenName() {
        System.out.println("铅笔");
    }
}
