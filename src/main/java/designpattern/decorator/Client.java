package designpattern.decorator;

/**
 * @基本功能:客户端代码
 * @program:summary
 * @author:peicc
 * @create:2019-09-04 09:34:03
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteComponent c=new ConcreteComponent();
        Decorator d1=new ConcreteDecoratorA();
        Decorator d2=new ConcreteDecoratorB();
        d1.setComponent(c);//装饰者d1对c进行装饰
        d1.operation();
        d2.setComponent(d1);//装饰者d2对d1进行装饰(思考一下：如果装饰者不继承Component,d1能对c进行装饰吗？d2能对d1进行装饰吗？)
        d2.operation();
    }



}
