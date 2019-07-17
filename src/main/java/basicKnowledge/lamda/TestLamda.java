package basicKnowledge.lamda;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-17 21:06:03
 **/
public class TestLamda {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("普通线程执行");
            }
        });
        thread.start();
        new Thread(()->{
            System.out.println("lamda线程执行");
        }).start();
    }
}
