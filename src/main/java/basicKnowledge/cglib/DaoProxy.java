package basicKnowledge.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-12 15:20:03
 **/
//创建一个代理类，实现MethodInterceptor接口
public class DaoProxy implements MethodInterceptor {
    /*
     *object 表示要增强的对象
     * Method 表示拦截的方法
     * Object[]表示参数列表，基本参数类型需要传入包装类型
     * methodProxy表示对方法的代理，invokeSuper()表示对被代理对象方法的调用
     */
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法调用前");
        methodProxy.invokeSuper(object,args);
        System.out.println("方法调用后");
        return object;
    }
}
