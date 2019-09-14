package bishi.xiaohongshu;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-14 14:56:03
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for (int i = 0; i <n ; i++) {
            num[i]=sc.nextInt();
        }
        int[] dp=new int[n+1];
        if(n==1){
            System.out.println(num[0]+" "+1);
        }
        if(n==2){
            System.out.println(Math.max(num[0],num[1])+" "+1);
        }
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=num[0];
            }else if(i==2){
                dp[i]=Math.max(num[0],num[1]);
            }else{
                dp[i]=Math.max(dp[i-2]+num[i-1],dp[i-1]);
            }

        }
        int count=0;
        int sum=dp[n];
        for (int i = n; i >=2 ; ) {
            if(dp[i]>dp[i-1]){
                count++;
                sum=sum-num[i-1];
                i=i-2;
            }else{
                i=i-1;
            }
            if(sum==0){
                break;
            }
        }
        System.out.println(dp[n]+" "+count);
    }

}
