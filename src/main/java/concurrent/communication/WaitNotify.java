package concurrent.communication;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @基本功能:通知等待机制
 * @program:summary
 * @author:peicc
 * @create:2019-09-03 15:36:41
 **/
public class WaitNotify {
    static boolean flag=true;
    static Object lock=new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread waitthrad=new Thread(new Wait(),"WaitingThread");
        Thread notifyThread=new Thread(new Notify(),"NotifyThread");
        waitthrad.start();
        Thread.sleep(1000);
        notifyThread.start();
    }
    static class Wait implements Runnable{
        @Override
        public void run() {
            synchronized (lock){
                //条件不满足时
                while(flag){
                    System.out.println(Thread.currentThread()+"flag is true.keep waiting."+new SimpleDateFormat("HH:mm:ss").format(new Date()));
                    try {
                        lock.wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //条件满足时
                System.out.println(Thread.currentThread()+"flag is false.Running."+new SimpleDateFormat("HH:mm:ss").format(new Date()));

            }
        }
    }
    static class Notify implements Runnable{
        @Override
        public void run() {
            synchronized (lock){
                System.out.println(Thread.currentThread()+"hold lock.notify"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
                lock.notifyAll();
                flag=false;
            }
            synchronized (lock){
                System.out.println(Thread.currentThread()+"hold again"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        }
    }
}

