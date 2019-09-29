package bishi.duxiaoman;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-29 18:58:11
 **/
public class Main1_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for (int i = 1; i <=n ; i++) {
            arr[i]=sc.nextInt();
        }
        int res=0;
        for (int i = 1; i <=n/2 ; i=i+1) {
            int j=2*i;
            int k=j+1;
            while (arr[i]>0||(j>n/2&&arr[j]>0)||(k>n/2&&k<=n&&arr[k]>0)){
                if (arr[i]>0) {
                    arr[i]=arr[i]-1;
                }
                if (arr[j]>0) {
                    arr[j]=arr[j]-1;
                }
                if (k<=n&&arr[k]>0) {
                    arr[k]=arr[k]-1;
                }


                res++;
            }

        }

        System.out.println(res);
    }
}
