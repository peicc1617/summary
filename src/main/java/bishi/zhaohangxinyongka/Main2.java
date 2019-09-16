package bishi.zhaohangxinyongka;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-15 20:12:57
 **/
public class Main2 {
    static int[][] e;
    static int[] visited;
    static int n;
    static int max=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            n=sc.nextInt();//节点个数
            e=new int[n+1][n+1];
            for (int i = 0; i <n-1 ; i++) {
                int u=sc.nextInt();
                int v=sc.nextInt();
                int value=sc.nextInt();
                e[u][v]=value;
            }
            StringBuilder sb=new StringBuilder();
            for (int i = 1; i <=n ; i++) {
                max=0;
                dfs(i,0);
                sb.append(max).append(" ");
            }
            System.out.println(sb.toString().trim());
        }

    }
    public static void dfs(int cur,int sum){
        for (int i = cur+1; i <=n ; i++) {
            if(e[cur][i]!=0){
                sum=sum+e[cur][i];
                if(sum>max){
                    max=sum;
                }
                dfs(i,sum);
                sum=sum-e[cur][i];
            }
        }
    }
}
