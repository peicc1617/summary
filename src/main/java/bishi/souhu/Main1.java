package bishi.souhu;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-25 19:47:40
 **/
public class Main1 {
    static int m;
    static int n;
    static int res;
    static int[][] limit;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        limit=new int[n][2];
        for (int i = 0; i <n ; i++) {
            limit[i][0]=sc.nextInt();
            limit[i][1]=sc.nextInt();
        }
        getResult(0,0);
        System.out.println(res);
    }
    public static void getResult(int cur,int sum){
        if(cur>=n||sum>=m){
            if(sum==m){
                res++;
            }
            return;
        }
        int li=limit[cur][0];
        int ri=limit[cur][1];
        for (int i = li; i <=ri ; i++) {
            getResult(cur+1,sum+i);
        }
    }

}
