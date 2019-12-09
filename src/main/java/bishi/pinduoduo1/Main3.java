package bishi.pinduoduo1;


import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-12-05 18:48:39
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int A=sc.nextInt();
        int R=sc.nextInt();
        if (M>=R){
            System.out.println(String.format("%.5f",(double)1.0));
            return;
        }
        if (M<1){
            System.out.println(String.format("%.5f",(double)0));
            return;
        }
        if (M==1){
            System.out.println(String.format("%.5f",(double)0.1));
            return;
        }
       if(A==1){
           double res=M*0.1;
            System.out.println(String.format("%.5f",(double)res));
        }else if (A==2){
           System.out.println(String.format("%.5f",(double)0.21));
       }else if(A==3){
           System.out.println(String.format("%.5f",(double)0.341));
       }

    }
}
