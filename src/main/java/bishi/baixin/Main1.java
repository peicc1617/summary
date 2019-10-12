package bishi.baixin;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-12 16:02:19
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        for (int i = 1; i <=N ; i++) {
            String str=String.valueOf(i);
            int len=str.length();
            boolean flag=true;
            for (int j = i-len*9; j <=i ; j++) {
                int res=function(j);
                if(res==i){
                    flag=false;
                    break;
                }
                if(flag){
                    count++;
                }
            }


        }
        System.out.println(count);
    }
    public static int function(int x){
        int res=x;
        while(x>0){
            int temp=x%10;
            res+=temp;
            x=x/10;
        }
        return res;
    }
}
