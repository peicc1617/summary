package bishi.qianxin;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-12 18:51:41
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        for (int i = 0; i <q ; i++) {
            int L=sc.nextInt();
            int R=sc.nextInt();
            int K=sc.nextInt();
            hit(arr,L,R,K);
        }
    }
    public static void hit(int[] arr,int L,int R,int K){
        int left=L-1;
        int right=R-1;
        if(left<0){
            left=0;
        }
        if(right>=arr.length){
            right=arr.length-1;
        }
        int res=0;
        for (int i = left; i <=right ; i++) {
            if(arr[i]==K){
                res++;
            }
        }
        System.out.println(res);
    }
}
