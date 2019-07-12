package basicKnowledge.jvm.OOM;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * VM args:-XX:permSize=10M -XX:MaxPermSize=10M
 * @program:summary
 * @author:peicc
 * @create:2019-07-11 20:04:36
 **/
//基本思路是运行时产生大量的类去填满方法区
public class JavaMethodAreaOOM {
    static class OOMObject{

    }

    public static void main(final String[] args) {
        while (true){
            Enhancer enhancer=new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invokeSuper(o,objects);
                }
            });
            enhancer.create();
        }
    }
}
