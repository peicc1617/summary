package bishi.yuanfudao;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-16 16:57:14
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int max=0;
        for (int i = 0; i <n ; i++) {
            for (int j = i; j <n ; j++) {
                int sum=0;
                for (int k = i; k <=j ; k++) {
                    sum=sum+arr[k];
                }
                if(sum<=s){
                    int temp=j-i+1;
                    if(temp>max){
                        max=temp;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
