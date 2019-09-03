package designpattern.observer;

/**
 * @基本功能:观察者
 * @program:summary
 * @author:peicc
 * @create:2019-09-03 16:52:11
 **/
public interface Observer {
    //当主题状态改变时，更新通知
    void update(int state);
}
