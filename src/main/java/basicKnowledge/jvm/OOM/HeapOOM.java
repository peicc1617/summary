package basicKnowledge.jvm.OOM;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @program:summary
 * @author:peicc
 * @create:2019-07-11 17:21:27
 **/
//1、Java堆OOM异常，主要不断创建对象，并且保证GC Roots到对象之间有可达路径来避免垃圾回收，
// 在对象数量达到最大堆的容量时就会产生内存溢出异常
//2、设置Java堆的大小：-Xmx:堆的最小值 -Xmx:堆的最大值 -XX:+HeapDumpOnOutOfMemoryError
// 在出现OOM异常时dump出当前内存转储快照
public class HeapOOM {
    public static void main(String[] args) {
        System.out.println("测试开始");
        List list=new ArrayList();
        while(true){
            list.add(new HeapOOM());
        }
    }
}
