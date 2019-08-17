package designpattern.factory.simplefactory;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-15 17:14:41
 **/
//简单工厂模式：在工厂类包含了必要的逻辑判断
public class PenFactory {
    public  Pen createPen(String name){
        switch (name){
            case "铅笔":
                return new Pencile();
            case "毛笔":
                return new BrushPen();
            case "圆珠笔":
                return new BallPen();
            default:
                return null;
        }
    }
}
