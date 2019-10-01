package basicKnowledge.protect.anotherpackage;

import basicKnowledge.protect.TestProtect;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-01 21:00:26
 **/
public class TestProtect3 extends TestProtect {
    public static void main(String[] args)  {
        TestProtect testProtect=new TestProtect();
        testProtect.age=20;
//        testProtect.name="pei";
        TestProtect3 testProtect3=new TestProtect3();
        testProtect3.age=20;
        testProtect3.name="petr";
        try {
            testProtect3.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
