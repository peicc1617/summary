package basicKnowledge.sort;

import java.util.PriorityQueue;

/**
 * @基本功能:堆排序
 * @program:summary
 * @author:peicc
 * @create:2019-08-19 10:06:47
 **/
public class HeapSort {
    public static void heapSort(int[] arr){
        PriorityQueue priorityQueue=new PriorityQueue();
        for (int i = 0; i <arr.length ; i++) {
            priorityQueue.add(arr[i]);
        }
        while (!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.poll()+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{10,6,7,8,9,1,2,5,3,4};
        heapSort(arr);
    }
}
