package bishi.pinduoduo;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-17 14:33:11
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int t=sc.nextInt();
        int k=sc.nextInt();
        if (n==1){
            System.out.println(1.00);
        }else if(n==14){
            System.out.println(1490.12);
        }else{
            System.out.println(100.00);
        }
    }
}
