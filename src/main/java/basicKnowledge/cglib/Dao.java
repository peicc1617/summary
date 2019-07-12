package basicKnowledge.cglib;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-12 15:17:40
 **/
//创建被代理类
public class Dao {
    public void update(){
        System.out.println("Dao.update");
    }
    public void select(){
        System.out.println("Dao.select");
    }
}
