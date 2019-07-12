package basicKnowledge.cglib;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-12 15:17:40
 **/
//创建被代理类
public class Dao {
    public Dao(){
        System.out.println("构造函数被调用");
        update();//构造函数调用update()与select()方法，也会被拦截。如何设置使得构造函数调用方法而不被拦截呢？
    }
    public void update(){
        System.out.println("Dao.update");
    }
    public void select(){
        System.out.println("Dao.select");
    }
}
