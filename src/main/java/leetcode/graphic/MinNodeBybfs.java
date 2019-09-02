package leetcode.graphic;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-26 17:05:55
 **/
public class MinNodeBybfs {
    static final int inf=99999999;//代表无穷大
    //二维数组，存储的是顶点之间的边的信息，若为无穷大，则顶点之间未连通
    static int[][] e;
    //一维数组，存储的是顶点是否被访问过的信息
    static int[] book;
    static int[] queue;//队列存储访问元素
    static int head,tail;//队列的头指针和尾指针
    //顶点的个数
    static int n;
    public static int bfs(int start,int end){
        //队列初始化
        head=tail=0;
        queue[tail]=start;//将出发城市入队
        book[start]=1;//标记第一个顶点已被访问
        tail++;
        boolean flag=false;
        int result=0;
        //当队列不为空的时候循环
        while(head<tail){
            int cur=queue[head];
            if(queue[cur]==end){
                result=head;
                flag=true;
                break;
            }
            for (int i = 0; i <n ; i++) {
                if (e[cur][i]==1&&book[i]==0){
                    queue[tail]=i;
                    book[i]=1;//标记城市已经被访问
                    tail++;
                }
            }
            if (flag){
                break;
            }
//            tail++;
            head++;//当一个点扩展结束后，head++后移一位，才能继续往下扩展
        }
        return result;

    }
    //主函数
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /**
         5 7 0 4
         0 1
         0 2
         1 2
         1 3
         2 3
         2 4
         3 4
         */
        n=sc.nextInt();//顶点个数
        int m=sc.nextInt();//线索个数
        int start=sc.nextInt();//出发城市
        int end=sc.nextInt();//到达城市
        e=new int[n][n];
        queue=new int[n];
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
        int jie=bfs(start,end);
        for (int i = 0; i <=jie; i++) {
            System.out.println(queue[i]);
        }

    }
}
