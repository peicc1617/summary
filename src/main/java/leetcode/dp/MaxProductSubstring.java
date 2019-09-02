package leetcode.dp;

import java.util.Scanner;

/**
 * @基本功能:最大子数组乘积
 * @program:summary
 * @author:peicc
 * @create:2019-08-29 14:11:14
 **/
public class MaxProductSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for (int i = 0; i <n ; i++) {
            num[i]=sc.nextInt();
        }
        int[] max=new int[n+1];//max[i]:以第i个元素结尾的最大连续子数组乘积
        int[] min=new int[n+1];//min[i]:以第i个元素结尾的最大连续子数组乘积
        int[] dp=new int[n+1];//dp[i]:有i个元素时最大连续子数组乘积
        dp[0]=0;
        dp[1]=num[0];
        min[1]=num[0];
        for (int i = 2; i <=n ; i++) {
            max[i]=Math.max(Math.max(max[i-1]*num[i-1],min[i-1]*num[i-1]),num[i-1]);
            min[i]=Math.min(Math.min(max[i-1]*num[i-1],min[i-1]*num[i-1]),num[i-1]);
            dp[i]=Math.max(max[i],dp[i-1]);
            System.out.println(num[i-1]+" "+max[i]+" "+min[i]+" "+dp[i]);
        }
        System.out.println(dp[n]);

    }
}
