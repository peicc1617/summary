package bishi.common;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public final static ThreadLocal<String> s = new ThreadLocal<String>();
    public static void main(String[] args) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                s.set("123");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(s.get());
            }
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                s.set("456");


                System.out.println(s.get());
            }
        }).start();
    }

}