package bishi.baidu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-10 18:35:22
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[]x=new int[n];
        int[] y=new int[n];
        int count=0;
        for (int i = 0; i <n ; i++) {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            count=count+y[i];
        }
        int[] arr=new int[count];
        int index=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <y[i] ; j++) {
                arr[index++]=x[i];
            }
        }
        /*for (int i = 0; i <count ; i++) {
            System.out.println(arr[i]);
        }*/
        Arrays.sort(arr);
        int i=0;
        int j=count-1;
        int result=0;
        while (i<count&&arr[i]>=m){
            result++;
            i++;
        }
        while (j>=0&&arr[j]>=m){
            result++;
            j--;
        }
       while (j>=0&&i<=j){
           long sum=0;
           while(sum<m){
              sum=sum+arr[i]+arr[j];
              i++;
           }
           result++;
           j--;
       }
        System.out.println(result);
    }
}
