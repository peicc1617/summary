package leetcode.graphic.search;

import java.util.Scanner;

/**
 * @基本功能:利用深度优先搜索解决1-n的全排列
 * @program:summary
 * @author:peicc
 * @create:2019-09-15 17:17:25
 **/
public class FullPerm {
    static int n;
    static int[] box;//盒子
    static int[] visited;//标识是否放入到盒子
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        box=new int[n];
        visited=new int[n+1];
        dfs(0);
    }
    public static void dfs(int step){
        if(step>=n){
            for (int i = 0; i <n ; i++) {
                System.out.print(box[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <=n ; i++) {
            if(visited[i]==0){
                box[step]=i;
                visited[i]=1;
                dfs(step+1);
                visited[i]=0;//回溯
            }
        }
    }
}
