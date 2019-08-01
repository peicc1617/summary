package leetcode.dp;

/**
 * @基本功能:最小路径和
 * @program:summary
 * @author:peicc
 * @create:2019-07-30 16:31:57
 **/
public class MinPathSum {
    /**
     * @功能：状态转移方程：设dp[i][j]为从左上角到达点grid[i][j]的最小路径和,其等于到达其左边的点和上边的点的路径最小值加上当前点
     * 即dp[i][j]=min(dp[i-1][j],dp[i][j-1])+grid[i][j]
     * 因此，要想求dp[i][j],需要求出dp[i-1][j],dp[i][j-1],要想求出dp[i-1][j],需要求出dp[i-2][j]以及dp[i-1][j-1]
     * 构造一个数组dp[i][j],保存到grid[i][j]的最小路径和
     * @Param: [grid]
     * @return: int
     * @Date: 2019/7/30
     */
    public static int minPathSum(int[][] grid){
        int rows=grid.length;//行数
        int cols=grid[0].length;//列数
        int[][] dp=new int[rows][cols];
        dp[0][0]=grid[0][0];//初始化
        //第一行
        for (int i = 1; i <cols ; i++) {
            dp[0][i]=dp[0][i-1]+grid[0][i];
        }
        //第一列
        for (int i = 1; i <rows ; i++) {
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        for(int i=1;i<rows;i++){
            for (int j=1;j<cols;j++){
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[rows-1][cols-1];
    }

    public static void main(String[] args) {
        int[][] array={{1,3,1},{1,5,1},{4,2,1}};
        int result=minPathSum(array);
        System.out.println(result);
        System.out.println("************断点停顿********");
    }
}
