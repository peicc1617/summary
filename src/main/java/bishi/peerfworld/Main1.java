package bishi.peerfworld;

import java.util.Scanner;
import java.util.Stack;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-27 18:53:30
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        Stack stack=new Stack();
        int max=arr[0];//记录最大值
        int min=arr[0];//记录最小值
        for (int i = 0; i <n ; i++) {
            if (i<n-1) {
                if (arr[i]>max) {
                    max=arr[i];
                }
                if (arr[i]<min) {
                    min=arr[i];
                }
            }
            stack.push(arr[i]);
        }
        stack.pop();
        System.out.println(max+","+min);
    }
}
