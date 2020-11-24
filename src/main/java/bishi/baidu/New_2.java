package bishi.baidu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2020-03-14 19:49:08
 **/
public class New_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++){
            int n=sc.nextInt();
            int[][] arr=new int[n+1][n+1];
            for (int j = 0; j <n-1 ; j++) {
                int a=sc.nextInt();
                int b=sc.nextInt();
                arr[a][b]=1;
            }
            int res1=0;
            int res2=0;
            for (int k=1;k<=n;k++){
                if (arr[1][k]==1){
                    res1++;
                }
                if (arr[n][k]==1){
                    res2++;
                }
            }
            if (res1>res2){
                System.out.println("niuniu");
            }else{
                System.out.println("niumei");
            }
        }


    }
}
