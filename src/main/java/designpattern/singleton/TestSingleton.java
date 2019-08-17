package designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-12 12:55:00
 **/
public class TestSingleton {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton s=Singleton.getInstance();
        Singleton sual=Singleton.getInstance();
        Constructor<Singleton> constructor=Singleton.class.getDeclaredConstructor();
        //值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。值为 false 则指示反射的对象应该实施 Java 语言访问检查。
        //实际上setAccessible是启用和禁用访问安全检查的开关,并不是为true就能访问为false就不能访问
        constructor.setAccessible(true);
        Singleton s2=constructor.newInstance();
        System.out.println(s+"\n"+sual+"\n"+s2);
        System.out.println("正常情况下，实例化两个实例是否相同："+(s==sual));
        System.out.println("通过反射攻击单例模式情况下，实例化两个实例是否相同："+(s==s2));
        System.out.println("*****************************");
        EnumSingleton singleton1=EnumSingleton.INSTANCE;
        EnumSingleton singleton2=EnumSingleton.INSTANCE;
        System.out.println("正常情况下，实例化两个实例是否相同："+(singleton1==singleton2));
        Constructor<EnumSingleton> constructor1= null;
        constructor1 = EnumSingleton.class.getDeclaredConstructor();
        constructor1.setAccessible(true);
        EnumSingleton singleton3= null;
        singleton3 = constructor1.newInstance();
        System.out.println(singleton1+"\n"+singleton2+"\n"+singleton3);
        System.out.println("通过反射攻击单例模式情况下，实例化两个实例是否相同："+(singleton1==singleton3));
    }
}
