package basicKnowledge.jvm.Class;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-02 21:12:19
 **/
public class Parent {
    public static int A=1;
    static {
        A=2;
    }
    static class Sub extends Parent{
        public static int B=A;
    }

    public static void main(String[] args) {
        System.out.println(Sub.B);;
    }
}
