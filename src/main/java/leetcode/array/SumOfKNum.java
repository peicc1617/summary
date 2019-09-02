package leetcode.array;

/**
 * @基本功能:寻找和为定值的多个数
 * @program:summary
 * @author:peicc
 * @create:2019-08-21 11:01:43
 **/
public class SumOfKNum {
    //以字符串的形式返回1~n的所有子集
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
            result[i] = temp[i]+"0";
            result[len-1-i] = temp[i]+"1" ;
        }
        return result;
    }
    public static void printNumOfSum(int n,int sum){
        String[] allGroup=getAllGroup(n);
        for (int i = 0; i <allGroup.length ; i++) {
            char[] temp=allGroup[i].toCharArray();
            int curSum=0;
            for(int j=0;j<temp.length;j++){
                if(temp[j]=='1'){
                    curSum=curSum+(j+1);
                }
            }
            if(curSum==sum){
                for (int j = 0; j <temp.length ; j++) {
                    if(temp[j]=='1'){
                        System.out.print((j+1)+" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printNumOfSum(10,16);
    }
}
