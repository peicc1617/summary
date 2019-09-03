package designpattern.observer;

/**
 * @基本功能:主题接口
 * @program:summary
 * @author:peicc
 * @create:2019-09-03 16:50:47
 **/
public interface Subject {
    //添加观察者
    void attach(Observer obj);
    //删除观察者
    void detach(Observer obj);
    //通知观察者
    void notifyObserver();
}
