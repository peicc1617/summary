package basicKnowledge.polymorphism;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-05 14:06:17
 **/
public class Main {
    public static void main(String[] args) {
        Father father=new Son();
        Son son=new Son();
        System.out.println(father.str);
        System.out.println( ((Son)father).str);//向下转型
        father.saySomething();
        System.out.println(son.str);
        son.saySomething();
    }
}
