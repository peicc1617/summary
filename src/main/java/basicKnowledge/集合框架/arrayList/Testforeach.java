package basicKnowledge.集合框架.arrayList;

import java.util.ArrayList;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-19 10:58:18
 **/
//测试增强for循环实现原理（查看编译后的class文件）
public class Testforeach {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        for (Integer i:list) {
            System.out.print(i+",");
        }
    }
}
