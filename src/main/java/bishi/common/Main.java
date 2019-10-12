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
        int[] arr=new int[5];
        System.out.println(arr[0]);
    }

}