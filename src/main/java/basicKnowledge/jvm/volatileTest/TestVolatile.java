package basicKnowledge.jvm.volatileTest;

/**
 * @基本功能:测试volatile关键字的线程安全性
 * @program:summary
 * @author:peicc
 * @create:2019-08-28 16:04:13
 **/
public class TestVolatile{
    public static volatile int race = 0;
    public static void increase(){
        race++;
    }

    public static void main(String[] args){

        Thread[] threads = new Thread[10];
        for(int i = 0; i < 10; i++){
            //每个线程对t进行1000次加1的操作
            threads[i]=new Thread(new Runnable(){
                @Override
                public void run(){
                    for(int j = 0; j < 1000; j++){
                       increase();
                    }
                }
            });
            threads[i].start();
        }

        //等待所有累加线程都结束
        while(Thread.activeCount() > 1){
            Thread.yield();
        }

        //打印t的值
        System.out.println(race);
    }
}
