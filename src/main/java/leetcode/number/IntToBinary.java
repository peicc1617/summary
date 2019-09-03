package leetcode.number;

import java.util.*;

public class IntToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            System.out.println(IntToBinary(num));
            System.out.println(IntToBinaryByRe(num));
        }

    }
    //整数转化为二进制
    public static String IntToBinary(int num){
        String result="";
        while(num>0){
            result=num%2+result;
            num=num/2;
        }
        return result;
    }
    //使用递归
    public static String IntToBinaryByRe(int num){
        if(num==0||num==1){
            return String.valueOf(num);
        }
        String result="";
        result=IntToBinaryByRe(num/2)+num%2;
        return result;
    }
}
