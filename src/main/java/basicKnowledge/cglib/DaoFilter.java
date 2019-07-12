package basicKnowledge.cglib;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-12 16:23:57
 **/
//返回的数值表示顺序
public class DaoFilter implements CallbackFilter {
    public int accept(Method method) {
        if(method.getName().equals("select")){
            return 0;
        }
        return 1;
    }
}
