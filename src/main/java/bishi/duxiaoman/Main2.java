package bishi.duxiaoman;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-29 18:58:18
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            b[i]=sc.nextInt();

        }
        System.out.println(b[0]+b[n-1]);
    }
}
