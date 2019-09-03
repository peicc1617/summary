package designpattern.observer;

/**
 * @基本功能:具体观察者
 * @program:summary
 * @author:peicc
 * @create:2019-09-03 17:01:19
 **/
public class ConcreteObserver implements Observer {
    //观察者名字
    private String name;
    //订阅者状态
    private int state;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int state) {
        this.state=state;
        System.out.println(name+"状态更新为："+state);
    }
}
