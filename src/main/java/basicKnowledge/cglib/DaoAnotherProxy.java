package basicKnowledge.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-12 16:17:46
 **/
//方法调用前后输出开始与结束时间
public class DaoAnotherProxy implements MethodInterceptor {
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("StartTime=["+System.currentTimeMillis()+"]");
        methodProxy.invokeSuper(object,args);
        System.out.println("EndTime=["+System.currentTimeMillis()+"]");
        return object;
    }
}
