package bishi._360;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 18:51:17
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] A=new int[N];
        for (int i = 0; i <N ; i++) {
            A[i]=sc.nextInt();
        }
        double res=0;
        for (int i = 0; i <N ; i++) {
            double sum=0;
            for (int j = i; j <N ; j++) {
                sum+=A[j];
                if((j-i+1)>=M){
                    double avg=sum/(double) (j-i+1);
                    if(avg>res){
                        res=avg;
                    }
                }
            }
        }
        String str=String.format("%.3f",res);
        System.out.println(str);
    }
}
