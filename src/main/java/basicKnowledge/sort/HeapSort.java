package basicKnowledge.sort;

import java.util.PriorityQueue;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-19 10:06:47
 **/
public class HeapSort {
    public static void main(String[] args) {

        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.add(10);
        priorityQueue.add(7);
        priorityQueue.add(15);
        System.out.println(priorityQueue.peek());
    }
}
