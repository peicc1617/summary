package bishi.sougou;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-16 18:52:08
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] arr=new int[N];
        for (int i = 1; i <=M ; i++) {
            int L=sc.nextInt();
            int R=sc.nextInt();
            operation(arr,L,R,i);
        }
        long sum=0;
        for (int i = 0; i <N ; i++) {
            sum=sum+i*arr[i];
        }
        long res=sum%100000009;
        System.out.println(res);
    }
    public static void operation(int[] arr,int L,int R,int count){
        if(L>R){
            return;
        }else{
            for (int i = L; i <=R ; i++) {
                arr[i]=count;
            }
        }
    }
}
