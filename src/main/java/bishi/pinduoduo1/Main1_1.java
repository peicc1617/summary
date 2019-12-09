package bishi.pinduoduo1;

import java.util.*;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-12-05 18:47:56
 **/
public class Main1_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
        int[][] arr=new int[n][2];
        int[] min=new int[n];
        int[] max=new int[n];
        for (int i=0;i<n;i++) {
           int a=sc.nextInt();
           int b=sc.nextInt();
           min[i]=a;
           max[i]=b;
           arr[i][0]=a;
           arr[i][1]=b;

        }
        Arrays.sort(min);
        Arrays.sort(max);
        int res_min=100;
        int res_max=-100;
        first:for (int i = 0; i <n ; i++) {
            int count=0;
            for (int j = 0; j <n ; j++) {
                if (min[i]>=arr[j][0]&&min[i]<=arr[j][1]){
                    count++;
                }
                if (count>=k){
                    res_min=min[i];
                    break first;
                }
            }

        }
        second:for (int i = n-1; i >=0 ; i--) {
            int count=0;
            for (int j = 0; j <n ; j++) {
                if (max[i]>=arr[j][0]&&max[i]<=arr[j][1]){
                    count++;
                }
                if (count>=k){
                    res_max=max[i];
                    break second;
                }
            }

        }
        if (res_min==100||res_max==-100){
            System.out.println("error");
        }else{
            System.out.println(res_min+" "+res_max);
        }
    }
}
