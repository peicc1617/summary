package leetcode.dp;

/**
 * @基本功能:求解斐波那契数列
 * @program:summary
 * @author:peicc
 * @create:2019-07-30 10:00:30
 **/
public class Fibonacci {
    //递归求解
    public static int solveFibonacciByRE(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return solveFibonacciByRE(n-1)+solveFibonacciByRE(n-2);
    }
    //动态规划
    public static int solveFibonacciByDP(int n){
        int result[]=new int[n+1];
        result[1]=1;
        for(int i=2;i<=n;i++){
            result[i]=result[i-1]+result[i-2];
        }
        return result[n];
    }

    public static void main(String[] args) {
        //测试递归调用时间
        Long start=System.currentTimeMillis();
        int temp=Fibonacci.solveFibonacciByRE(10);
        Long end=System.currentTimeMillis();
        System.out.println("递归调用结果："+temp+"递归调用时间："+(end-start));
        //测试动态规划调用时间
        start=System.currentTimeMillis();
        temp=Fibonacci.solveFibonacciByDP(10);
        end=System.currentTimeMillis();
        System.out.println("递归调用结果："+temp+"动态规划调用时间："+(end-start));
    }
}
