package bishi.souhu;

/*import leetcode.ThreadTurn;*/

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-25 19:47:53
 **/
public class Main2 {
    static Object o=new Object();
    public static void main(String[] args) {
        Thread numThread=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o){
                    for (int i = 1; i <=1 ; ) {
                        System.out.print(Thread.currentThread().getName()+":"+i);
                        o.notify();//唤醒等待线程
                        i++;
                        try {
                           o.wait();
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }

            }
        });
        Thread zimuThread=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o){
                    for (int i = 0; i < 1; ) {
                        System.out.print(Thread.currentThread().getName()+":"+(char)(i+65)+" ");
                        o.notify();//唤醒等待线程
                        i++;
                        try {
                            o.wait();
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        numThread.start();
        zimuThread.start();
        System.out.println(Thread.currentThread().getName()+":"+Thread.activeCount());


    }
}
