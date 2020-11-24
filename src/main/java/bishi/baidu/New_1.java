package bishi.baidu;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2020-03-14 18:41:03
 **/
public class New_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[k+1];
        for (int i=0;i<n;i++) {
            int index=sc.nextInt();
            arr[index]++;
        }
        int res=0;
        for (int i=1;i<=k;i++) {
            if (arr[i]%2==0) {
                res+=arr[i]/2;
            }else {
                res+=arr[i]/2+1;
            }
        }
        System.out.println(res);
    }
}
