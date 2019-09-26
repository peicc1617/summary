package bishi.sougou;

import designpattern.observer.Observer;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-16 18:52:28
 **/
public class Main3 {
    static  Object object=new Object();
    public static void main(String[] args) {
test();
    }
    public    static void test(){
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    System.out.println("测试");
                    object.notify();
                }

            }
        });
        thread.start();


    }
}
