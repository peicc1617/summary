package designpattern.singleton;

/**
 * @基本功能:饿汉模式(类加载的时候就创建了该单例对象)
 * @参考文献：https://www.cnblogs.com/saoyou/p/11087462.html
 * @program:summary
 * @author:peicc
 * @create:2019-08-12 11:14:12
 **/
public class Singleton {
    //1、构造器私有化
    private Singleton(){
    }
    //2、自行对外提供实例
    private static final Singleton singleton=new Singleton();
    //3、提供外界可以获取到该实例的方法
    public static Singleton getInstance(){
        return singleton;
    }

}
