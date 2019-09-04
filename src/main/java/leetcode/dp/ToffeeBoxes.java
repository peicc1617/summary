package leetcode.dp;

import java.util.Scanner;

/**
 * @基本功能:将数组中n个元素分成m个部分，使得每部分和的最大值最小
 * @program:summary
 * @author:peicc
 * @create:2019-09-04 21:06:38
 **/
public class ToffeeBoxes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int[][] dp=new int[n+1][m+1];
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if(j==1){//只有一个分组
                    dp[i][j]=dp[i-1][j]+arr[i-1];
                    continue;
                }
                if(i==j){//分组个数等于元素个数
                    int max=arr[0];
                    for (int k = 1; k <=i ; k++) {
                        if(arr[k-1]>max){
                            max=arr[k-1];
                        }
                    }
                    dp[i][j]=max;

                }else{
                    int min=Integer.MAX_VALUE;
                    for (int k = j; k <=i; k++) {
                        int sum=0;
                        for (int l = k; l <=i ; l++) {
                            sum=sum+arr[l-1];
                        }
                        if((sum+dp[k-1][j-1])<min){
                            min=sum+dp[k-1][j-1];
                        }

                    }
                    dp[i][j]=min;
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
