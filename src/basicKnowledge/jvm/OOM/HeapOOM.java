package basicKnowledge.jvm.OOM;

import java.util.ArrayList;
import java.util.List;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-11 17:21:27
 **/
//Java堆OOM异常，主要不断创建对象，并且保证GC Roots到对象之间有可达路径来避免垃圾回收，在对象数量达到最大堆的容量时就会产生内存溢出异常
public class HeapOOM {
    public static void main(String[] args) {
        System.out.println("测试开始");
        List list=new ArrayList();
        while(true){
            list.add(new HeapOOM());
        }
    }
}
