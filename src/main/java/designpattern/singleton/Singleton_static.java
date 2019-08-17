package designpattern.singleton;

/**
 * @基本功能:静态内部类
 * @program:summary
 * @author:peicc
 * @create:2019-08-12 12:18:35
 **/
public class Singleton_static {
    //1、构造方法私有化
    private Singleton_static(){

    }
    //2、通过静态内部类提供实例(类加载器负责加锁)
    //第一次访问内中的静态字段时会被加载，并且同一个类只被加载一次
    private static class SingletonHolder{
        private static Singleton_static singleton_static=new Singleton_static();
    }
    //3、对外外界可以访问该实例的方法
    public Singleton_static getInstance(){
        return SingletonHolder.singleton_static;
    }
}
