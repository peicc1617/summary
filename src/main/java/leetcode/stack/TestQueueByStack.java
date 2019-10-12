package leetcode.stack;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-07 15:14:03
 **/
public class TestQueueByStack {
    public static void main(String[] args) throws Exception {
        QueueByStack<Integer> queueByStack=new QueueByStack<>();
        for (int i = 0; i <3 ; i++) {
            queueByStack.add(i);
        }
        System.out.println(queueByStack.peek());
        System.out.println(queueByStack.poll());
        System.out.println(queueByStack.peek());
        System.out.println(queueByStack.poll());
        System.out.println(queueByStack.poll());
    }
}
