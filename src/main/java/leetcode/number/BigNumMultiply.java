package leetcode.number;

import java.util.Scanner;

/**
 * @基本功能:大数相乘
 * @program:summary
 * @author:peicc
 * @create:2019-09-12 12:33:57
 **/
public class BigNumMultiply {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str1=sc.next();
            String str2=sc.next();
            String result=bigNumberMultiply(str1,str2);
            System.out.println(result);
        }
    }
    public static String  bigNumberMultiply(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        int maxLen=len1+len2;//乘积最大长度
        int[] result=new int[maxLen];//结果数组
        int[] num1=new int[len1];
        int[] num2=new int[len2];
        for (int i = 0; i <len1 ; i++) {
            num1[i]=str1.charAt(len1-i-1)-'0';
        }
        for (int i = 0; i <len2 ; i++) {
            num2[i]=str2.charAt(len2-i-1)-'0';
        }
        for (int i = 0; i <len1 ; i++) {
            for (int j = 0; j <len2 ; j++) {
                int temp=result[i+j];
                temp=temp+num1[i]*num2[j];
                int gewei=temp%10;
                int shiwei=temp/10;
                result[i+j]=gewei;
                result[i+j+1]+=shiwei;//进位
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = maxLen-1; i >=0 ; i--) {
            if(result[i]!=0){
                for (int j = i; j >=0 ; j--) {
                    sb.append(result[j]);
                }
                break;
            }
        }
        return  sb.toString();

    }
}
