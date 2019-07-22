package basicKnowledge.集合框架.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @基本功能:测试LinkedListAPI
 * @program:summary
 * @author:peicc
 * @create:2019-07-22 21:22:58
 **/
public class TestLinkedListAPI {
    public static void main(String[] args) {
        testLinkedListAPIs();
    }
    private static void testLinkedListAPIs(){
        LinkedList list=new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        printAll(list);
        //将4添加到第一个位置
        list.add(1,4);
        printAll(list);
    }
    private static void printAll(List list){
        System.out.println("*********打印输出********");
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
