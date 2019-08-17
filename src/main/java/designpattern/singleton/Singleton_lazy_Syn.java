package designpattern.singleton;

/**
 * @基本功能:添加synchronized锁
 * @program:summary
 * @author:peicc
 * @create:2019-08-12 12:00:17
 **/
public class Singleton_lazy_Syn {
    //1、构造器私有化
    private Singleton_lazy_Syn(){
    }
    //2、自行对外提供实例
    private static Singleton_lazy_Syn singleton=null;
    //3、提供外界可以访问该实例的方法
    //为了保证线程安全，对该方法加锁
    public synchronized Singleton_lazy_Syn getInstance(){
        //检查对象是否被创建
        if(singleton==null){
            singleton=new Singleton_lazy_Syn();
        }
        return singleton;
    }
}
