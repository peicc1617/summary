package bishi.ebay;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-17 18:33:43
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int W=sc.nextInt();
        int[] weight=new int[n];
        for (int i = 0; i <n ; i++) {
            weight[i]=sc.nextInt();
        }
        Arrays.sort(weight);
        int i=0;
        int j=n-1;
        int res=0;
        while (i<=j){
            if (weight[i]+weight[j]<=W){
                i++;
                j--;
            }else{
                j--;
            }
            res++;
        }
        System.out.println(res);
    }
}
