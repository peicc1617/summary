package leetcode.dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @基本功能:最大连续子数组乘积
 * @program:summary
 * @author:peicc
 * @create:2019-08-29 14:11:14
 **/
public class MaxProductSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int[] num=new int[n];
            for (int i = 0; i <n ; i++) {
                num[i]=sc.nextInt();
            }
            System.out.println(getResult2(num));
        }
    }
    /***
     * @函数功能：动态规划，没考虑负数情况
     * @param: arr
     * @return：int
     */
    public static int getResult1(int[] arr){
        int[] dp=new int[arr.length+1];
        dp[0]=0;
        dp[1]=arr[0];
        for (int i = 2; i <=arr.length ; i++) {
            dp[i]=Math.max(dp[i-1]*arr[i-1],arr[i-1]);//此处需保证数组都为整数
        }
        Arrays.sort(dp);
        return dp[arr.length];
    }
    /***
     * @函数功能：对方法1进行优化，考虑负数
     * @param: arr
     * @return：int
     */
    public static int getResult2(int[] arr){
        int max[]=new int[arr.length+1];//以第i个元素（arr[i-1]）结尾的连续子数组乘积的最大值
        int min[]=new int[arr.length+1];//以第i个元素（arr[i-1]）结尾的连续子数组乘积的最小值
        int dp[]=new int[arr.length+1];//有i个元素时最大连续子数组乘积
        dp[0]=0;
        dp[1]=arr[0];
        min[0]=0;
        min[1]=arr[0];
        max[0]=0;
        max[1]=arr[0];
        for (int i = 2; i <=arr.length ; i++) {
            max[i]=Math.max(Math.max(max[i-1]*arr[i-1],min[i-1]*arr[i-1]),arr[i-1]);
            min[i]=Math.min(Math.min(max[i-1]*arr[i-1],min[i-1]*arr[i-1]),arr[i-1]);
            dp[i]=Math.max(max[i],dp[i-1]);
        }
        return dp[arr.length];
    }
}
