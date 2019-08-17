package basicKnowledge.集合框架.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-19 15:23:29
 **/
//测试fast-fail机制
public class Test_fast_fail {
    static ArrayList<Integer> list=new ArrayList<Integer>();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    list.add(i);
                    printAll();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=10;i<20;i++){
                    list.add(i);
                    printAll();
                }
            }
        }).start();
    }
    private static void printAll(){
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }
    }
}
