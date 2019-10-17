package bishi.pinduoduo;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-17 14:32:54
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long T=sc.nextLong();
        for (int i = 0; i <T ; i++) {
            long A=sc.nextLong();
            long B=sc.nextLong();
            if (A<-1000000000||A>1000000000||B<-1000000000||B>1000000000){
                System.out.println(-1);
                continue;
            }
            long count=0;
            while (A<=B) {
                if (A==B){
                    break;
                }else if (A*10+1<=B){
                    A=A*10+1;
                    count++;
                }else if (A*2<=B){
                    A=A*2;
                    count++;
                }else{
                    break;
                }
            }
            if (A==B){
                System.out.println(count);
            }else{
                System.out.println(-1);
            }
        }
    }
}
