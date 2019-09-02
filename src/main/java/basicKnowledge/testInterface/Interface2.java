package basicKnowledge.testInterface;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-22 16:56:49
 **/
public interface Interface2 {
    abstract void doSomething();
    default void say(){
        System.out.println("接口2的default方法");
    }
}
