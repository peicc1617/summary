package designpattern.observer;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-03 17:05:31
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();
        subject.attach(new ConcreteObserver("张三"));
        subject.attach(new ConcreteObserver("李四"));
        subject.setState(10);
        subject.notifyObserver();
        subject.setState(20);
        subject.notifyObserver();
    }
}
