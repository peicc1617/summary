package bishi.tecent;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-20 19:51:11
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        int[] y=new int[n];
        int M=0;
        for (int i = 0; i <n ; i++) {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            M+=x[i];
        }
        int[] num=new int[M];
        int p=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <x[i] ; j++) {
                num[p]=y[i];
                p++;
            }
        }
        Arrays.sort(num);
        int max=Integer.MIN_VALUE;
        /*for (int i = 0; i <M/2 ; i++) {
            int sum=num[i]+num[M-1-i];
            if(sum>max){
                max=sum;
            }
        }*/
        int i=0;
        int j=M-1;
        while(i!=j){
            int sum=num[i]+num[j];
            i++;
            j--;
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
