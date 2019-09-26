package basicKnowledge.thread;

/**
 * @基本功能:两个线程交替执行，一个输出偶数，一个输出奇数
 * @program:summary
 * @author:peicc
 * @create:2019-07-29 12:56:49
 **/
//线程执行完毕如何终止？
public class ThreadPrint1 {
     static Object o=new Object();
    static boolean flag=false;//标志位


    public static void main(String[] args) {
        ThreadPrint1 threadTurn=new ThreadPrint1();
        Thread oddThread=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (threadTurn){
                    for (int i = 1; i <100 ; ) {
                        if(!flag){
                            System.out.println("打印奇数线程"+i);
                            threadTurn.notify();//唤醒等待线程
                            flag=true;
                            i+=2;
                        }else{
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

            }
        },"奇数线程");
        Thread evenThread=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (threadTurn){
                    for (int i = 2; i <= 100; ) {
                        if(flag){
                            System.out.println("打印偶数线程"+i);
                            threadTurn.notify();//唤醒等待线程
                            flag=false;
                            i+=2;
                        }else{
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
            }
        },"偶数线程");
        evenThread.start();
        oddThread.start();

    }
}
