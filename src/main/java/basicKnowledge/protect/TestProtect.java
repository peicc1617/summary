package basicKnowledge.protect;

import basicKnowledge.protect.anotherpackage.TestProtect4;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-01 20:54:12
 **/
public class TestProtect {
    private int id;
    protected String name;
    public int age;
    int  sex;

    public static void main(String[] args) {
        TestProtect testProtect=new TestProtect();
        testProtect.age=20;
        testProtect.name="pei";
        testProtect.id=1;
        testProtect.sex=0;
        /*TestProtect4 testProtect4=new TestProtect4();
        testProtect4.clone();*/
    }
}
