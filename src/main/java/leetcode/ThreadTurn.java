package leetcode;

/**
 * @基本功能:两个线程交替执行，一个输出偶数，一个输出奇数
 * @program:summary
 * @author:peicc
 * @create:2019-07-29 12:56:49
 **/
//线程执行完毕如何终止？
public class ThreadTurn {
     static Object o=new Object();



    public static void main(String[] args) {
        ThreadTurn threadTurn=new ThreadTurn();
        Thread oddThread=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (threadTurn){
                    for (int i = 1; i <100 ; i+=2) {
                        System.out.println("打印奇数线程"+i);
                        threadTurn.notify();//唤醒等待线程
                        try {
                            threadTurn.wait();
//                            Thread.sleep(100);
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }

            }
        });
        Thread evenThread=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (threadTurn){
                    for (int i = 0; i < 100; i+=2) {
                        System.out.println("打印偶数线程"+i);
                        threadTurn.notify();//唤醒等待线程
                        try {
                            threadTurn.wait();
//                            Thread.sleep(100);
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        evenThread.start();
        oddThread.start();

    }
}
