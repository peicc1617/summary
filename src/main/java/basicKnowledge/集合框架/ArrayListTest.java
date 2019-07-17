package basicKnowledge.集合框架;

import java.util.ArrayList;
import java.util.List;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-17 16:19:36
 **/
public class ArrayListTest {
    public static void main(String[] args) {
        //subList的结果不可以强转成ArrayList
        ArrayList list=new ArrayList();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("***********子列表***********");
        List subList=list.subList(0,5);
        for(int i = 0; i <subList.size() ; i++){
            System.out.println(list.get(i));
        }
        System.out.println("************修改子链表内容*********");
        subList.set(0,"modify");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("************修改子链表个数*********");
        subList.add("add");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        for(int i = 0; i <subList.size() ; i++){
            System.out.println(subList.get(i));
        }
        //对原集合元素个数的修改，会导致子列表的遍历、增加、删除均会产生ConcurrentModificationException异常
        /*list.add("add1");
        for(int i = 0; i <subList.size() ; i++){
            System.out.println(subList.get(i));
        }*/
        System.out.println("************转换成数组***********");
//        System.out.println((String[]) list.toArray());
        //测试toArray()方法：使用有参方法
        ArrayList list1=new ArrayList();
        list1.add("1");
        list1.add("2");
        String[] array=new String[list1.size()];
        array=(String [])list1.toArray(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }



    }


}
