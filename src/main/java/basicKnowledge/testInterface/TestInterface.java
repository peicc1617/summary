package basicKnowledge.testInterface;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-22 16:57:44
 **/
public class TestInterface implements Interface1,Interface2 {
    @Override
    public void say() {
        System.out.println("我被重写了");
    }

    @Override
    public void doSomething() {
        System.out.println("我被实现了");
    }

    public static void main(String[] args) {
        TestInterface testInterface=new TestInterface();
        testInterface.say();
    }
}
