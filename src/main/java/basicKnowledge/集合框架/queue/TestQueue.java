package basicKnowledge.集合框架.queue;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-07-23 21:48:43
 **/
public class TestQueue {
    public static void main(String[] args) {
        ArrayQueue arrayQueue=new ArrayQueue(3);
        arrayQueue.add(0);
        arrayQueue.add(1);
        arrayQueue.add(2);
        arrayQueue.remove(0);
        arrayQueue.add(3);
//        arrayQueue.add(3);
    }
}
