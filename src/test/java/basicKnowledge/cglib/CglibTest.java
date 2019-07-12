package basicKnowledge.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-12 15:31:05
 **/
//测试类
public class CglibTest {
    //通用写法
    @Test
    public void testCglib(){
        DaoProxy daoProxy=new DaoProxy();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(Dao.class);//要代理的类
        enhancer.setCallback(daoProxy);//设置回调
        Dao dao=(Dao)enhancer.create();//生成代理对象
        dao.update();
        dao.select();
    }
    //定义不同的拦截策略
    @Test
    public void testCglibforDifferent(){
        DaoProxy daoProxy=new DaoProxy();
        DaoAnotherProxy daoAnotherProxy=new DaoAnotherProxy();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(Dao.class);
        enhancer.setCallbacks(new Callback[]{daoProxy,daoAnotherProxy, NoOp.INSTANCE});
        enhancer.setCallbackFilter(new DaoFilter());
        enhancer.setInterceptDuringConstruction(false);//设置使得构造函数调用类的其他方法不被拦截
        Dao dao=(Dao)enhancer.create();
        dao.update();
        dao.select();
    }
}
