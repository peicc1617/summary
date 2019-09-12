package leetcode.number;

import java.util.Scanner;

/**
 * @基本功能:大数相加
 * @program:summary
 * @author:peicc
 * @create:2019-09-12 12:30:00
 **/
public class BigNumSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(bigNumberSum(str1, str2));
    }
    /*** 
     * @函数功能：
     * @param str1:
     * @param str2:
     * @return：java.lang.String
     */
    public static String bigNumberSum(String str1, String str2) {
        int len1=str1.length();//第一个数的长度
        int len2=str2.length();//第二个数的长度
        int maxLength = len1> len2?len1 : len2;//两个大数相加的结果的长度为较大的一个数的长度加1
        int[] arrayA = new int[maxLength + 1];
        int[] arrayB = new int[maxLength + 1];
        for(int i = 0; i < str1.length(); i++)
            arrayA[i] =str1.charAt(len1 - 1 - i) - '0';

        for(int i = 0; i < str2.length(); i++)
            arrayB[i] = str2.charAt(len2 - 1 - i) - '0';

        // 2.构建result数组，数组长度等于较大整数位数 + 1
        int[] result = new int[maxLength + 1];
        // 3.遍历数组，按位相加
        for(int i = 0; i < result.length; i++) {
            int temp = result[i];
            temp += arrayA[i] + arrayB[i];
            // 判断是否进位
            if(temp >= 10) {
                temp = temp - 10;
                result[i + 1] = 1;//进位
            }
            result[i] = temp;
        }

        // 4.由于刚刚是逆序相加，因此需要将上述结果逆序
        StringBuilder sb = new StringBuilder();
        //从最高位开始找到第一个非零位
        boolean findFirst = false;
        for(int i = result.length - 1; i >= 0; i--) {
            if(!findFirst) {
                if(result[i] == 0)
                    continue;

                findFirst = true;
            }
            sb.append(result[i]);
        }

        return sb.toString();
    }
}
