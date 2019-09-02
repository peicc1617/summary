package leetcode.array;

/**
 * @基本功能:最大连续子数组和
 * @program:summary
 * @author:peicc
 * @create:2019-08-21 10:13:24
 **/
public class MaxSubArray {
    //暴力求解(O(n^3))
    public static int maxSubArray(int[] array){
        int maxSum=array[0];
        int curSum=0;
        int len=array.length;
        for (int i = 0; i <len ; i++) {
            for(int j=i;j<len;j++){//子数组的终点
                for(int k=i;k<=j;k++){//子数组起始位置
                    curSum+=array[k];
                }
                if(curSum>maxSum){
                    maxSum=curSum;
                }
                curSum=0;//清零
            }
        }
        return maxSum;
    }
    //暴力破解（O(n^2)）
    public static int maxSubArray1(int[] array){
        int len=array.length;
        int maxSum=0;
        int curSum=0;
        for (int i = 0; i <len ; i++) {
            for(int j=i;j<len;j++){
                curSum=curSum+array[j];
                if(curSum>maxSum){
                    maxSum=curSum;
                }
            }
            curSum=0;
        }
        return maxSum;
    }

    //动态规划
    /**
     * @功能：
     * @状态转移方程为：设curSum(j)为以j结尾的最大连续子数组和则curSum(j)=max{0,curSum(j-1)}+a[j]
     * @Param: [array]
     * @return: int
     * @Date: 2019/8/21
     */
    public static int maxSubArrayByDP(int[] array){
        int maxSum=0;
        int curSum=0;
        for(int i=0;i<array.length;i++){
            if(curSum>=0){
                curSum+=array[i];
            }else{
                curSum=array[i];
            }
            if(curSum>maxSum){
                maxSum=curSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] array={1,-2,-4,10,3,7,2,-5};
        System.out.println(maxSubArray(array));
        System.out.println(maxSubArrayByDP(array));
        System.out.println(maxSubArray1(array));
    }
}
