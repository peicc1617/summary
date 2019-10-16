package bishi.common;

import java.util.HashMap;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public final static ThreadLocal<String> s = new ThreadLocal<String>();
    /***
     * @函数功能：
     * @param: args
     * @return：void
     */
    public static void main(String[] args) {
        String str="你好";
        System.out.println(str.length());
    }

}