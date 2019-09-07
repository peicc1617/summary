package leetcode.graphic;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @基本功能:图的广度优先遍历
 * @program:summary
 * @author:peicc
 * @create:2019-08-26 11:17:41
 **/
public class TravleOfGraphicBybfs {
    static final int inf=99999999;//代表无穷大
    //二维数组，存储的是顶点之间的边的信息，若为无穷大，则顶点之间未连通
    static int[][] e;
    //一维数组，存储的是顶点是否被访问过的信息
    static int[] book;
    //顶点的个数
    static int n;
    public static void bfs(){
        //队列初始化
        LinkedList<Integer> queue=new LinkedList<>();
        for (int i = 0; i <n ; i++) {
            if(book[i]==0){
                book[i]=1;//标记已被访问过
                queue.add(i);
                while (!queue.isEmpty()){
                    int cur=queue.poll();
                    System.out.print(cur+" ");//访问元素
                    for (int j = 0; j <n ; j++) {
                        if(e[cur][j]==1&&book[j]==0){
                            book[j]=1;//入队必会被访问到
                            queue.add(j);
                        }
                    }
                }
            }
        }

    }
    //主函数
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /**
         5 5
         0 1
         0 2
         0 4
         1 3
         2 4
         */
        n=sc.nextInt();//顶点个数
        int m=sc.nextInt();//线索个数
        e=new int[n][n];
        book=new int[n];
        //初始化二维矩阵
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i==j){
                    e[i][j]=0;
                }else{
                    e[i][j]=inf;
                }
            }
        }
        //读入顶点之间的边
        for (int i = 0; i <m ; i++) {
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            e[v1][v2]=1;
            e[v2][v1]=1;
        }
        //广度优先遍历
        bfs();

    }
}
