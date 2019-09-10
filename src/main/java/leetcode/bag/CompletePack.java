package leetcode.bag;

/**
 * @基本功能:完全背包
 * @program:summary
 * @author:peicc
 * @create:2019-09-10 18:17:01
 **/
public class CompletePack {
    /***
     * @函数功能：完全背包
     * @param weight:
     * @param value:
     * @param w:
     * @return：int
     */
    public static int  completePack(int[]weight,int[] value,int w){
        int rows=weight.length+1;//数组行数
        int cols=w+1;//数组列数
        int dp[][]=new int[rows][cols];
        for (int i = 1; i <=weight.length ; i++) {
            for (int j = 1; j <=w ; j++) {
                if(j<weight[i-1]){//第i个物品的重量大于背包容量,此时没法放入背包
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-weight[i-1]]+value[i-1]);//解决当前问题
                }
            }
        }
        return dp[weight.length][w];
    }

}
