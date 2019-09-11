package bishi.baidu;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-10 18:35:46
 **/
public class Main2 {
    static int result=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        getResult(n,k);
        System.out.println(result);
    }
    public static void getResult(int n,int k){
        if(n<=k){
            result++;
            return;
        }
        if((n-k)%2!=0){
            result++;
            return;
        }else{
            int x1=(n-k)/2;
            int x2=(n-k)/2+2;
            getResult(x1,k);
            getResult(x2,k);
        }
    }
}
