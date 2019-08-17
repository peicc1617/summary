package basicKnowledge.polymorphism;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-05 14:04:48
 **/
public class Son extends Father {
    String str="son";

    @Override
    public void saySomething() {
        System.out.println("我是你儿子");
    }
}
