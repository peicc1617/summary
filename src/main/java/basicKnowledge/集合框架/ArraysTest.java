package basicKnowledge.集合框架;

import java.util.Arrays;
import java.util.List;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-17 14:46:16
 **/
//测试Arrays
public class ArraysTest {
    public static void main(String[] args) {
       String[] str={"are","you","ok"};
       List list=Arrays.asList(str);
       System.out.println(list.get(0));
       str[0]="I";
       System.out.println(list.get(0));
       list.set(0,"he");
        System.out.println(list.get(0));
        System.out.println(str[0]);
       list.add("ni");
    }
}
