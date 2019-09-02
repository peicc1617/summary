package leetcode.graphic;

import java.util.Scanner;

/**
 * @基本功能: 利用深度优先求解最短路径
 * @program:summary
 * @author:peicc
 * @create:2019-08-26 16:18:15
 **/
public class ShortestPathBydfs {
    private static final int inf=99999999;
    static int min=inf;
    static int n;//顶点（城市）数量
    static int[][] e;//二维数组，存储城市距离
    static int[] book;//存储访问标志位

    /**
     * @功能：
     * @Param cur:当前城市
     * @Param des：目标城市
     * @Param distance:已走过的距离
     * @return: int
     * @Date: 2019/8/26
     */
    public static void shortestBydfs(int cur,int des,int distance){
        if(distance>min){
            return ;
        }
        if(cur==des){
            if(distance<min){
                min=distance;
                return;
            }
        }
        for (int i = 0; i <n; i++) {//从第一个城市到第n个城市依次尝试
            //判断当前城市到城市i是否有道路且城市i是否已经在走过的路径中
            if(e[cur][i]<inf&&book[i]==0){
                book[i]=1;//标记城市i已经在路径中
                shortestBydfs(i,des,distance+e[cur][i]);
                book[i]=0;//恢复标志位（因为允许一个城市包含在不同的路径之中）
            }
        }
    }

    public static void main(String[] args) {
        /*
        5 8
        0 1 2
        0 4 10
        1 2 3
        1 4 7
        2 0 4
        2 3 4
        3 4 5
        4 2 3
        */
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();//城市数量
        int m=sc.nextInt();//路径线索
        e=new int[n][n];
        book=new int[n];
        //二维数组初始化
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(i==j){
                    e[i][j]=0;
                }else{
                    e[i][j]=inf;
                }
            }
        }
        //二维数组读入数据
        for (int i = 0; i <m ; i++) {
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            int road=sc.nextInt();
            e[v1][v2]=road;
        }
        //定义出发城市
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                book[i]=1;//从第一个城市出发
                shortestBydfs(i,j,0);//到达第四个城市
                System.out.println("城市"+i+"城市"+j+"的最短路径为："+min);
                //重置
                book[i]=0;
                min=inf;
            }
        }

    }
}
