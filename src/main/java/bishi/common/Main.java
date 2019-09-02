package bishi.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-02 10:42:29
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int group = sc.nextInt();
        ArrayList res=new ArrayList();
        for (int i = 0; i < group; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            int result=count(l-1,r-1,k,arr);
            res.add(result);
        }
        for (int i = 0; i <res.size() ; i++) {
            System.out.println(res.get(i));
        }
    }
    public static int count(int l,int r,int k,int[] arr){
        int count=0;
        for (int i = l; i <=r ; i++) {
            if(arr[i]==k){
                count++;
            }
        }
        return count;
    }
}
