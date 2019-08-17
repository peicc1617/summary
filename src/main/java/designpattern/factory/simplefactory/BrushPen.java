package designpattern.factory.simplefactory;

/**
 * @基本功能:毛笔
 * @program:summary
 * @author:peicc
 * @create:2019-08-15 17:14:10
 **/
public class BrushPen implements Pen {
    @Override
    public void getPenName() {
        System.out.println("毛笔");
    }
}
