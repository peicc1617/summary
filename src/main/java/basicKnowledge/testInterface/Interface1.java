package basicKnowledge.testInterface;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-22 16:55:15
 **/
public interface Interface1 {
    abstract void doSomething();
    default void say(){
        System.out.println("接口1的default方法");
    }
}
