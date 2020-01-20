package leetcode.array;

import java.util.Scanner;

/**
 * @基本功能:合并两个有序数组
 * @program:summary
 * @author:peicc
 * @create:2019-12-09 11:14:10
 **/
public class MergeTwoArr {
    public static int[] merge(int[] arr1,int[] arr2){
        if (arr1==null) {
            return arr2;
        }
        if (arr2==null) {
            return arr1;
        }
        int len1=arr1.length;
        int len2=arr2.length;
        int len=len1+len2;
        int[]  res=new int[len];
        int i=0;
        int j=0;
        int k=0;
        while (i<len1&&j<len2) {
            if(arr1[i]<arr2[j]){
                res[k++]=arr1[i++];
            }else{
                res[k++]=arr2[j++];
            }
        }
        while (i<len1) {
            res[k++]=arr1[i++];
        }
        while (j<len2) {
            res[k++]=arr2[j++];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();

        int[] arr1=new int[n1];

        for (int i = 0; i <n1 ; i++) {
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        for (int i = 0; i <n2 ; i++) {
            arr2[i]=sc.nextInt();
        }
        int[] res=merge(arr1,arr2);
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
