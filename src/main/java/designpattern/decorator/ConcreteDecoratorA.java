package designpattern.decorator;

/**
 * @基本功能:具体装饰者A
 * @program:summary
 * @author:peicc
 * @create:2019-09-04 09:27:04
 **/
public class ConcreteDecoratorA extends Decorator {
    @Override
    public void operation() {
        super.operation();
        //在被装饰对象的基础上进行功能扩展
        System.out.println("装饰者A新增的功能");
    }
}
