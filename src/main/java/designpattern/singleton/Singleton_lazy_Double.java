package designpattern.singleton;

/**
 * @基本功能:双重校验锁
 * @program:summary
 * @author:peicc
 * @create:2019-08-12 12:00:17
 **/
public class Singleton_lazy_Double {
    //1、构造器私有化
    private Singleton_lazy_Double(){
    }
    //2、自行对外提供实例
    private static volatile Singleton_lazy_Double singleton=null;//静止指令重排
    //3、提供外界可以访问该实例的方法
    public  Singleton_lazy_Double getInstance(){
        //第一次校验
        if(singleton==null){
            //加锁
            synchronized (Singleton_lazy_Syn.class){
                //第二次校验
                if(singleton==null){
                    //非原子操作，会发生指令重排
                    singleton=new Singleton_lazy_Double();
                }
            }
        }
        return singleton;
    }
}
