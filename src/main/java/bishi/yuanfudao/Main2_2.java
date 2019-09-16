package bishi.yuanfudao;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-16 16:57:22
 **/
public class Main2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int[] sum=new int[n];
        int[] len=new int[n];
        len[0]=arr[0]<=n?1:0;
        for (int i = 1; i <n ; i++) {
            if(arr[i]>s){
                len[i]=0;
                sum[i]=arr[i];
            }else{
                len[i]=1;
                sum[i]=arr[i];
                for (int j = i-len[i]; j >=0&&sum[i]<=s ; j=i-len[i]) {
                    sum[i]+=sum[j];
                    len[i]+=len[j];
                }
                for (int j = i+1-len[i]; j <i&&sum[i]>s ; j++) {
                    len[i]-=1;
                    sum[i]-=arr[j];
                }
            }
        }
        int max=0;
        for (int i = 0; i <n ; i++) {
            if(len[i]>max){
                max=len[i];
            }
        }
        System.out.println(max);
    }
}
