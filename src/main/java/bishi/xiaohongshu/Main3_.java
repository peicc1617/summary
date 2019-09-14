package bishi.xiaohongshu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-14 14:56:10
 **/
public class Main3_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int[][] arr=new int[n][2];
        HashSet set=new HashSet();
        for (int i = 0; i <n ; i++) {
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
            arr[i][0]=arr1[i];
            arr[i][1]=arr2[i];
            set.add(arr1[i]+arr2[i]);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[1];
            }
        });
        int count=0;
        for (int i = 0; i <n-1 ; i++) {
            if(arr[i][1]<=arr[i+1][1]){
               count++;
            }
        }
        System.out.println(count);
    }
}
