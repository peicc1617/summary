package leetcode.bag;

/**
 * @基本功能:多重背包
 * @program:summary
 * @author:peicc
 * @create:2019-09-10 17:15:08
 **/
public class MultiplePack {
    /*** 
     * @函数功能：
     * @param weight:重量
     * @param value:价值
     * @param num:数量
     * @param w:背包重量
     * @return：int
     */
    public static int multilePack(int[]weight,int[] value,int[] num,int w){
        int rows=weight.length+1;//数组行数
        int cols=w+1;//数组列数
        int dp[][]=new int[rows][cols];
        for (int i = 1; i <=weight.length ; i++) {
            for (int j = 1; j <=w ; j++) {
                if(j<weight[i-1]){//第i个物品的重量大于背包容量,此时没法放入背包
                    dp[i][j]=dp[i-1][j];
                }else{
                    int maxNum=Math.min(num[i-1],j/weight[i-1]);
                    int max=0;//保存最大值
                    for (int k = 0; k <=maxNum ; k++) {
                       int temp=Math.max(dp[i-1][j],dp[i-1][j-k*weight[i-1]]+k*value[i-1]);
                       if(temp>max){
                           max=temp;
                       }
                    }
                    dp[i][j]=max;
                }
            }
        }
        return dp[weight.length][w];
    }
}
