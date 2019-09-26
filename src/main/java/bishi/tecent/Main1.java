package bishi.tecent;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-20 19:51:03
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t ; i++) {
            int n=sc.nextInt();
            String str=sc.next();
            if(n<11){
                System.out.println("NO");
                continue;
            }
            int index=str.indexOf("8");
            if(index==-1){
                System.out.println("NO");
            }else{
                String temp=str.substring(index);
                if(temp.length()>=11){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }

        }
    }
}
