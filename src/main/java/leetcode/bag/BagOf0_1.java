package leetcode.bag;

/**
 * @基本功能:0-1背包
 * @program:summary
 * @author:peicc
 * @create:2019-08-21 15:34:00
 **/
public class BagOf0_1 {
    //暴力枚举法所有可能
    public static void bruteForce(int[][]A){
        int n=A[0].length;
        for(int i = 0;i < Math.pow(2, n);i++){  //总共有2^n个子集，需要进行2^n次循环，及数组A有2^n行
            int temp1 = i;
            for(int j = 0;j < n;j++){    //数组A有n列，每一列代表一个物品
                int temp2 = temp1%2;
                A[i][j] = temp2;
                temp1 = temp1/2;
            }
        }
    }
    //递归求取n个不同物品的所有子集
    public static String[] getAllGroup(int n){
        int len = (int) Math.pow(2, n);
        String[] result = new String[len];
        if(n == 1){
            result[0] = "0";
            result[1] = "1";
            return result;
        }
        String[] temp = getAllGroup(n-1);//获取n-1的所有排列可能
        for(int i = 0;i < temp.length;i++){//针对每一种排列可能，第n个数可以选取（+"1"）或者不选取（+"0"）
            result[i] = "0" + temp[i];         //前一半格雷码，最高位为0
            result[result.length-1-i] = "1" + temp[i];   //后一半格雷码，最高位为1
        }
        return result;
    }
    //对每一种可能计算
    public static void printArray(int[][]A,int[]weight,int[]value,int maxWeight){
        int len1=A.length;
        int len2=A[0].length;
        int curWeight=0;
        int curValue=0;
        int maxValue=value[0];
        for(int i=0;i<len1;i++){
            curValue=0;
            curWeight=0;
            for(int j=0;j<len2;j++){
                System.out.print(A[i][j]+" ");
                curWeight=curWeight+A[i][j]*weight[j];
                curValue=curValue+A[i][j]*value[j];
            }
            System.out.print("当前总重量为："+curWeight+" ");
            if(curWeight>maxWeight){
                System.out.print("重量超出");
            }else{
                if(curValue>maxValue){
                    maxValue=curValue;
                }
                System.out.print("总价值为:"+curValue+" ");
            }
            System.out.println();
        }
        System.out.println("最大价值为:"+maxValue);
    }
    /***
     * @函数功能：动态规划:dp[i][j]=max(dp[i-1][j],dp[i-1][j-weight[i-1]]+value[i-1])
     * @param: weight
     * @param: value
     * @param: w
     * @return：int
     */
    public static int getMaxValue(int[]weight,int[] value,int w){
        int rows=weight.length+1;
        int cols=w+1;
        int[][] result=new int[rows][cols];
        for (int i = 1; i <rows ; i++) {
            for (int j = 1; j <=w ; j++) {
                if(j<weight[i-1]){//第i件物品
                    result[i][j]=result[i-1][j];
                }else{
                    result[i][j]=Math.max(result[i-1][j],result[i-1][j-weight[i-1]]+value[i-1]);
                }
            }
        }
        return result[rows-1][cols-1];
    }

    public static void main(String[] args) {
        int[][]A=new int[16][4];
        bruteForce(A);
        int[] weight={7,3,4,5};
        int[] value={42,12,40,25};
        printArray(A,weight,value,10);
        System.out.println("----------背包问题求解-----------");
        int[] weight1 = {2,1,3,2};
        int[] value1 = {12,10,20,15};
        int result = getMaxValue(weight1, value1,5);
        System.out.println(result);
    }
}
