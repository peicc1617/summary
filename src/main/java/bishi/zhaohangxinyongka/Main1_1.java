package bishi.zhaohangxinyongka;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-15 20:12:51
 **/
public class Main1_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] arr=str.toCharArray();
        int[] res=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            res[i]=1;
        }
        for (int i = 0; i <arr.length ; i++) {
            char cur=arr[i];
            if(cur=='R'){
                int j=i+1;
                while (arr[j]=='R'){
                    j++;
                }
                int distance=j-i;
                if(distance%2==0){//偶数
                    res[j]=res[j]+1;
                }else{
                    res[j-1]=res[j-1]+1;
                }
            }else{
                int j=i-1;
                while (arr[j]=='L'){
                    j--;
                }
                int distance=i-j;
                if (distance%2==0){
                    res[j]=res[j]+1;
                }else{
                    res[j+1]=res[j+1]+1;
                }
            }
            res[i]=res[i]-1;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
