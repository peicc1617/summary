package basicKnowledge.集合框架.arrayList;

import java.util.ArrayList;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-22 10:16:22
 **/
public class TestRemove {
    static ArrayList list=new ArrayList();

    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            list.add(i);
        }
        list.add(2);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i)+" "+list.get(i).getClass().getName());
        }
        //移除下标为2的元素
        /*list.remove(2);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i)+" "+list.get(i).getClass().getName());
        }*/
        //移除元素2
        list.remove((Integer)2);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i)+" "+list.get(i).getClass().getName());
        }
        System.out.println("**************添加空元素**************");
        System.out.println("添加前元素个数为："+list.size());
        list.add(null);
        System.out.println("添加后元素个数为："+list.size());
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i)/*+" "+list.get(i).getClass().getName()*/);
        }
        //删除元素为空的元素
        System.out.println("*********删除元素为空的元素*********");
        list.remove(null);
        System.out.println("删除后元素个数为："+list.size());
        //链表为空
        System.out.println("**********构造一个新链表*********");
        ArrayList nulllist=new ArrayList(5);
        System.out.println(nulllist.size());

    }
}
