package bishi._20190923;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-23 22:09:45
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <len ; ) {
            char temp=str.charAt(i);
            int j=i;
            int count=1;
            while ((j+1)<len&&str.charAt(j)+1==str.charAt(j+1)){
                count++;
                j++;
            }
            if(count>=4){
                sb.append(str.charAt(i)).append("-").append(str.charAt(j));
            }else{
                while (i<=j){
                    sb.append(str.charAt(i));
                    i++;
                }
            }
            i=j+1;
        }
        System.out.println(sb.toString());
    }
}
