package bishi.common;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public class Main {
    public final static ThreadLocal<String> s = new ThreadLocal<String>();
    public static void main(String[] args) {
       int n=Runtime.getRuntime().availableProcessors();
        System.out.println(n);
    }

}