package bishi.peerfworld;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-27 18:53:46
 **/
public class Main2 {
    private static final int inf=99999999;//代表正无穷
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int[][] distance=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                int temp=sc.nextInt();
                if (temp==-1) {
                    temp=inf;
                }
                if (i==j){
                    distance[i][j]=0;
                }else{
                    distance[i][j]=temp;
                }

            }
        }
        int[] res=solutionByDijkstra(distance,p);
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <res.length ; i++) {
            if (i!=p) {
                sb.append(res[i]).append(",");
            }
        }
        for (int i = 0; i <sb.length()-1 ; i++) {
            System.out.print(sb.charAt(i));
        }
    }
    public static int[] solutionByDijkstra(int[][] distance,int source){
        int len=distance.length;
        int[] book=new int[len];//存储已知最短路程的顶点，如果为1则源顶点到该顶点最短路程已知
        int[] result=new int[len];
        //初始化返回数组，其中的各个元素表示第source个顶点到其余各个顶点之间的初始路程
        for (int i = 0; i <len ; i++) {
            result[i]=distance[source][i];//源顶点到其他顶点的初始距离
        }
        //book数组初始化
        book[0]=1;//最开始只有源顶点到自身的最短路程已知
        //Dijkstra算法核心语句
        for (int i = 0; i <len-1 ; i++) {//每次循环，源顶点到其中某一个顶点的最短路径被确定，一共有n-1个顶点，所以循环n-1次
            //寻找离源顶点最近的点
            int min=inf;
            int position=0;//记录离源顶点最近点的位置
            for (int j = 0; j <len ; j++) {
                if(book[j]==0&&result[j]<min){//book[j]==0保证源顶点到该顶点的最短路径还未确定
                    min=result[j];
                    position=j;
                }
            }
            //找到离源顶点最段距离的顶点后,源顶点到该顶点的最短路程就被确定，此时将该顶点的标志设为1
            book[position]=1;
            for (int v = 0; v <len ; v++) {
                if(distance[position][v]<inf){//顶点position到顶点V连通
                    if(result[v]>result[position]+distance[position][v]){
                        result[v]=result[position]+distance[position][v];
                    }
                }
            }
        }
        return result;
    }
}
