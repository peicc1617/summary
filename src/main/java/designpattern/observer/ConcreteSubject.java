package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @基本功能:具体主题
 * @program:summary
 * @author:peicc
 * @create:2019-09-03 16:56:58
 **/
public class ConcreteSubject implements Subject {
    //存放观察者
    private List<Observer> observers=new ArrayList<>();
    //被观察的状态
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    //注册观察者
    @Override
    public void attach(Observer obj) {
        observers.add(obj);
    }
    //移除观察者
    @Override
    public void detach(Observer obj) {
        if(observers.contains(obj)){
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observers) {
            observer.update(state);
        }
    }
}
