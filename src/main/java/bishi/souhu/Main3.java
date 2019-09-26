package bishi.souhu;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-25 19:48:03
 **/
public class Main3 {
    // 打印数字的线程
    Thread th1 = new Thread(() -> {
        synchronized (this) {
            for (int i = 1; i < 53; i++) {
                System.out.println(i);
                if (i % 2 == 0) { // 判读i是否等于0，
                    try {
                        this.notify();// 唤起下个线程
                        this.wait();// 等于0让该线程停止
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    });

    // 打印字母的线程
    Thread th2 = new Thread(() -> {
        synchronized (this) {
            for (int i = 0; i < 26; i++) {
                System.out.println((char) +(65 + i));
                this.notify();// 唤起其他线程
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    });

    public static void main(String[] args) {
        Main3 w2 = new Main3();

        Thread th1 = new Thread();
        Thread th2 = new Thread();

        w2.th1.start();
        w2.th2.start();
    }

}
