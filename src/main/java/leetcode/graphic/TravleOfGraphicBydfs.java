package leetcode.graphic;

import java.util.Scanner;

/**
 * @基本功能:图的深度优先遍历
 * @program:summary
 * @author:peicc
 * @create:2019-08-26 09:55:47
 **/
public class TravleOfGraphicBydfs {
    static final int inf=99999999;//代表无穷大
    //二维数组，存储的是顶点之间的边的信息，若为无穷大，则顶点之间未连通
    static int[][] e;
    //一维数组，存储的是顶点是否被访问过的信息
    static int[] book;
    //顶点的个数
    static int n;
    /**
     * @功能：深度优先遍历：首先以一个未被访问过的顶点作为起始顶点，然后沿当前顶点的边走到未访问过的顶点，当没有为访问过的
     * 顶点时，则回到上一个顶点，继续试探访问别的顶点，直到所有的顶点都被访问过
     * @Param: [cur]
     * @return: void
     * @Date: 2019/8/26
     */
    public static void dfs(int cur){
        book[cur]=1;//标记结点已被访问
        //第一步：首先访问当前节点
        System.out.print(cur+" ");
        for (int i = 0; i <n ; i++) {//从第1个顶点到第n个顶点一次尝试，看当前顶点与哪些顶点有边相连
            if(e[cur][i]==1&&book[i]==0){//判断当前顶点cur到顶点i是否有边，并判断顶点i是否已经访问过
                dfs(i);
            }
        }
    }

    //主函数
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();//读入顶点个数
        int m=sc.nextInt();//边数信息
        book=new int[n];
        e=new int[n][n];
        for (int i = 0; i <m ; i++) {
            int u=sc.nextInt();
            int v=sc.nextInt();
            e[u][v]=1;
        }
        /************深度优先遍历测试***************/
        for (int i = 0; i <n ; i++) {
            if(book[i]==0){
                dfs(i);
            }
        }
    }
}
