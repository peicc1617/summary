package designpattern.singleton;

/**
 * @基本功能:懒汉模式（需要的时候再加载） 存在并发安全问题，多个线程可能创建多个实例
 * @program:summary
 * @author:peicc
 * @create:2019-08-12 11:20:49
 **/
public class Singleton_lazy {
    //1、构造器私有化
    private Singleton_lazy(){
    }
    //2、自行对外提供实例
    private static Singleton_lazy singleton=null;
    //3、提供外界可以访问该实例的方法
    public Singleton_lazy getInstance(){
        //检查对象是否被创建
        if(singleton==null){
            singleton=new Singleton_lazy();
        }
        return singleton;
    }
}
