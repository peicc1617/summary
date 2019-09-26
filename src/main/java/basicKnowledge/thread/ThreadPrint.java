package basicKnowledge.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @基本功能:线程交替打印输出奇偶
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 09:11:15
 **/
public class ThreadPrint {
    static  Object object=new Object();

    public static void main(String[] args) {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    for (int i = 1; i <100 ; i+=2) {
                        System.out.println(Thread.currentThread().getName()+": "+i);
                        object.notify();//唤醒其他线程
                        try {
                            object.wait();
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        },"打印奇数线程");
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    for (int i = 2; i <=100 ; i+=2) {
                        System.out.println(Thread.currentThread().getName()+": "+i);
                        object.notify();//唤醒其他线程
                        try {
                            object.wait();
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        },"打印偶数线程");
        thread1.start();
        thread2.start();
    }


}
