package basicKnowledge.thread;

/**
 * @基本功能:测试守护线程
 * @program:summary
 * @author:peicc
 * @create:2019-10-22 16:48:08
 **/
public class TestDaemon {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    // 利用Thread.currentThread.getName()获取当前线程名字。
                    System.out.println("子线程："+Thread.currentThread().getName() + ":" + i);
                }
                System.out.println("子线程执行完毕。。。。");
            }
        });
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程："+Thread.currentThread().getName() + ":" + i);
        }
        System.out.println("主线程执行完毕。。。。");
    }
}
