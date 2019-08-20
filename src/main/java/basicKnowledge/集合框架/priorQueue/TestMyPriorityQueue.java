package basicKnowledge.集合框架.priorQueue;

import java.util.Random;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-19 15:07:14
 **/
public class TestMyPriorityQueue {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue=new MyPriorityQueue();
        Random r=new Random(1);
        for (int i = 0; i < 10; i++) {
            int val=r.nextInt(100);
            System.out.print("入队："+val+"-----------");
            myPriorityQueue.add(val);
            System.out.print("最小元素为："+myPriorityQueue.peek());
            System.out.println();
        }
        while(myPriorityQueue.size()!=0){
            System.out.print("出队："+myPriorityQueue.poll()+"----------");
            System.out.print("最小元素为："+myPriorityQueue.peek());
            System.out.println();
        }
    }
}
