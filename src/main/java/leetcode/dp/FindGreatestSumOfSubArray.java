package leetcode.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @基本功能:连续子数组的最大和
 * @program:summary
 * @author:peicc
 * @create:2019-09-09 09:53:15
 **/
public class FindGreatestSumOfSubArray {
    /***
     * @函数功能：通过三层循环枚举每个连续子数组，然后对其求和，最后获得和的最大值
     * @param: arr
     * @return：int
     */
    public static int getResult1(int[] arr){
        ArrayList<Integer> list=new ArrayList();
        for (int i = 0; i <arr.length ; i++) {//子数组的起点
            for (int j = i; j <arr.length ; j++) {//子数组的终点
                int sum=0;//保存子数组求和结果
                for (int k = i; k <=j ; k++) {//对子数组求和
                    sum+=arr[k];
                }
                list.add(sum);
            }
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
    /***
     * @函数功能：通过两层循环去枚举每个子数组的和
     * @param: arr
     * @return：int
     */
    public static int getResult2(int[] arr){
        int maxSum=arr[0];
        for (int i = 0; i <arr.length ; i++) {//子数组的起点
            int sum=0;
            for (int j = i; j <arr.length ; j++) {//子数组的终点
                sum+=arr[j];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }
    /***
     * @函数功能：动态规划
     * @param: arr
     * @return：int
     */
    public static int getResult3(int[] arr){
        //状态转移方程：dp[i]=max(dp[i-1]+arr[i],arr[i])
        int[] dp=new int[arr.length];//dp[i]表示以元素arr[i]结尾的连续子数组的最大和(连续子数组包含arr[i])
        dp[0]=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            dp[i]=Math.max(dp[i-1]+arr[i],arr[i]);
        }
        Arrays.sort(dp);//最大连续子数组之和可能是以任何一个元素结尾的连续子数组的最大和。因此应进行排序，然后找到最大值
        return dp[dp.length-1];
    }
    /***
     * @函数功能：主方法
     * @param: args
     * @return：void
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();//数组长度
            int[] arr=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println("三层循环"+getResult1(arr));
            System.out.println("两层循环"+getResult2(arr));
            System.out.println("动态规划"+getResult3(arr));

        }

    }
}
