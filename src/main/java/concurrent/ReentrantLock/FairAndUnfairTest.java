package concurrent.ReentrantLock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @基本功能:测试公平锁和非公平锁
 * @program:summary
 * @author:peicc
 * @create:2019-10-08 13:11:50
 **/
public class FairAndUnfairTest {
    private static Lock fairLock=new ReentrantLock2(true);// 公平锁
    private static Lock unfairLock=new ReentrantLock2(false);// 非公平锁
    private static CountDownLatch count=new CountDownLatch(1);
    private static class Job extends Thread{
        private Lock lock;
        public Job(Lock lock) {
            this.lock=lock;
        }
        @Override
        public void run() {
            try {
                count.await();
            }
            catch (InterruptedException e) {
            }
            for (int i = 0; i <2 ; i++) {
                lock.lock();
                try {
                    System.out.print("Lock by ["+getName()+ "], Waiting by [" /*+ ((ReentrantLock2) lock).getQueuedThreads()*/);
                    ArrayList<Thread> list=(ArrayList<Thread>) ((ReentrantLock2) lock).getQueuedThreads();
                    for (int j = 0; j <list.size() ; j++) {
                        System.out.print(list.get(j).getName()+",");
                    }
                    System.out.println("]");
                } finally {
                    lock.unlock();
                }

            }
        }
    }
    private static void testLock(Lock lock){
        for (int i = 0; i <5 ; i++) {
            Thread thread=new Job(lock);
            thread.setName(""+i);
            thread.start();
        }
        count.countDown();
    }
    /*********
     *内部类
     */
    private static class ReentrantLock2 extends ReentrantLock{
        /***
         * @函数功能：构造函数
         * @param fair:
         * @return：
         */
        public ReentrantLock2(boolean fair){
            super(fair);
        }

        @Override
        public Collection<Thread> getQueuedThreads() {
            List<Thread> list=new ArrayList<>(super.getQueuedThreads());
            Collections.reverse(list);
            return list;
        }
    }

    public static void main(String[] args) {
        System.out.println("-------------------公平锁测试-----------------");
        testLock(fairLock);
       /* System.out.println("-------------------非公平锁测试-----------------");
        testLock(unfairLock);*/
    }

}
