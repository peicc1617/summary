package bishi.shenxinfu;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @基本功能:最小费用
 * @program:summary
 * @author:peicc
 * @create:2019-09-18 18:08:43
 **/
public class MinCost {
    static int[][] next={{0,1},{1,0},{0,-1},{-1,0}};
    static int[][] cost;
    static int[][] visited;
    static int targetX;
    static int targetY;
    static int min=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        cost=new int[n][n];
        visited=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                cost[i][j]=sc.nextInt();
            }

        }
        targetX=n-1;
        targetY=n-1;
        dfs(0,0,cost[0][0]);
        System.out.println(min);
    }
    public static void dfs(int x,int y,int sum){
        if(x==targetX&&y==targetY){
            if(sum<min){
                min=sum;
            }
            return;
        }
        for (int i = 0; i <4 ; i++) {
            int tx=x+next[i][0];
            int ty=y+next[i][1];
            if(tx>=0&&tx<cost.length&&ty>=0&&ty<cost[0].length&&visited[tx][ty]==0){
                visited[tx][ty]=1;
                dfs(tx,ty,sum+cost[tx][ty]);
                visited[tx][ty]=1;
            }
        }
    }

}
