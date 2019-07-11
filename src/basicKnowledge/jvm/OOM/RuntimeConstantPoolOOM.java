package basicKnowledge.jvm.OOM;

import java.util.ArrayList;
import java.util.List;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-11 19:50:14
 **/
//运行时常量池溢出
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        //list常量池引用，避免full GC回收常量行为
        List list=new ArrayList();
        int i=0;
        RuntimeConstantPoolOOM.test_intern();
        while(true){
            list.add(String.valueOf(i++).intern());
        }
    }
    //测试intern()方法
    //String.intern()方法的作用是：如果字符串常量池中已经包含一个等于此String对象的字符串，则返回代表池中这个字符串的String对象；
    //否则，将此String对象包含的字符串添加到常量池中，并且返回此String对象的引用。
    public static void test_intern(){
        String str1=new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern()==str1);
        String str2=new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern()==str2);
    }
}
