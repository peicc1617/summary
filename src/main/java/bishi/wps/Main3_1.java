package bishi.wps;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-18 19:48:04
 **/
public class Main3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(getResult(n));
        }
    }
    public static int getResult(int n){
        if (n<=3){
            return 1;
        }else{
            return getResult(n-4)+getResult(n-1);
        }
    }
}
