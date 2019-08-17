package designpattern.singleton;

/**
 * @基本功能:枚举的单例模式
 * @说明：无论是懒汉还是饿汉模式，都是在不考虑反射和放射机制下的单例模式，如果考虑到了放射，其他单例模式就无法做到单例类只能有一个实例
 * @program:summary
 * @author:peicc
 * @create:2019-08-12 12:50:21
 **/
public enum EnumSingleton {
    INSTANCE;
    public EnumSingleton getInstance(){
        return INSTANCE;
    }
}
