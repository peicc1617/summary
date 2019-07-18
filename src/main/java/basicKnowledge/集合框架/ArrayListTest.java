package basicKnowledge.集合框架;

import java.util.ArrayList;
import java.util.Iterator;
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
        for(int i=0;i<1000000;i++){
            list.add(i);
        }
        iteratorThroughRandomAccess(list) ;
        iteratorThroughIterator(list) ;
        iteratorThroughFor2(list) ;
        System.out.println("结束");
    }
    /**************三种遍历方式****************/
    public static void iteratorThroughRandomAccess(List list) {

        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for (int i=0; i<list.size(); i++) {
            list.get(i);
        }
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iteratorThroughRandomAccess："  +endTime+"-"+startTime+"="+interval+" ms");
    }

    public static void iteratorThroughIterator(List list) {

        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for(Iterator iter = list.iterator(); iter.hasNext(); ) {
            iter.next();
        }
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iteratorThroughIterator：" + interval+" ms");
    }


    public static void iteratorThroughFor2(List list) {

        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for(Object obj:list)
            ;
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iteratorThroughFor2：" + interval+" ms");
    }



}
