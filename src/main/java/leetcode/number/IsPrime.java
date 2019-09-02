package leetcode.number;

/**
 * @基本功能:判断是否是质数（除了1和它本身，不能被任何数整数）
 * @program:summary
 * @author:peicc
 * @create:2019-08-30 17:54:23
 **/
public class IsPrime {
    public static boolean isPrime(int val){
        if(val<2){
            return false;
        }
        if(val==2||val==3){
            return true;
        }

        for (int i = 2; i <Math.sqrt(val) ; i++) {
             if(val%i==0){
                return false;
             }
        }
        return true;
    }
}
