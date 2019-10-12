package leetcode.array;

import java.util.Scanner;

/**
 * @基本功能:和为定值K的所有子数组
 * @program:summary
 * @author:peicc
 * @create:2019-10-07 18:00:01
 **/
public class SUM_K_SubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int [n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(printAllSubArray(arr,k));
    }
    /*** 
     * @函数功能：
     * @param arr:元素均为正数
     * @param k:
     * @return：int
     */
    public static int  printAllSubArray(int[] arr,int k){
        int left=0;
        int right=0;
        int len=arr.length;
        int sum=arr[0];
        int res=0;
        while (right<len) {
            if (sum==k) {
                int temp=right-left+1;
                res=Math.max(temp,res);
                sum=sum-arr[left++];
            } else if (sum<k) {
                right++;
                if (right==len) {
                    break;
                }
                sum=sum+arr[right];
            } else {
                sum=sum-arr[left++];
            }
        }
        return res;
    }
}
