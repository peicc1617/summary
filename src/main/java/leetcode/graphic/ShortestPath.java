package leetcode.graphic;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-24 10:11:20
 **/
public class ShortestPath {
    private static final int inf=99999999;//代表正无穷
    /**
     * @功能：通过Floyd-Warshall来解决顶点i到顶点j的最短路径
     * @时间复杂度：O(n^3)
     * @Param: [distance]
     * @return: int[][]
     * @Date: 2019/8/24
     */
    public static int[][] solutionByFloyd(int distance[][]){
        int len=distance.length;
        for (int i = 0; i <len ; i++) {//
            for (int j = 0; j <len ; j++) {
                for (int k = 0; k <len ; k++) {
                    if(distance[j][k]>distance[j][i]+distance[i][k]){
                        distance[j][k]=distance[j][i]+distance[i][k];
                    }
                }
            }
        }
        return distance;
    }
    /**
     * @功能：
     * @Param: [distance, source] 各个顶点之间的距离
     * @return: int[] 第source个顶点到其余点的最短距离
     * @Date: 2019/8/24
     */
    public static int[] solutionByDijkstra(int[][] distance,int source){
        int len=distance.length;
        int[] book=new int[len];//存储已知最短路程的顶点，如果为1则源顶点到该顶点最短路程已知
        int[] result=new int[len];
        //初始化返回数组，其中的各个元素表示第source个顶点到其余各个顶点之间的初始路程
        for (int i = 0; i <len ; i++) {
            result[i]=distance[source][i];
        }
        //book数组初始化
        book[0]=1;//最开始只有源顶点到自身的最短路程已知
        //Dijkstra算法核心语句
        for (int i = 0; i <len-1 ; i++) {//每次循环，源顶点到其中某一个顶点的最短路径被确定，一共有n-1个顶点，所以循环n-1次
            //寻找离源顶点最近的点
            int min=inf;
            int position=0;//记录离源顶点最近点的位置
            for (int j = 0; j <len ; j++) {
                if(book[j]==0&&result[j]<inf){//book[j]==0保证源顶点到该顶点的最短路径还未确定
                    min=result[j];
                    position=j;
                }
            }
            //找到离源顶点最段距离的顶点后,源顶点到该顶点的最短路程就被确定，此时将该顶点的标志设为1
            book[position]=1;
            //由该顶点出发，更新源顶点到该顶点所能到达的顶点的最短距离
            //怎么知道该顶点能到达哪些顶点呢？通过distance[v1][v2]可知：
            //distance[v1][v2]表示的是顶点v1到顶点v2的距离，若distance[v1][v2]<inf,说明这两个顶点是连通的
            //因此，遍历distance[position][v],其中V=0,1,2,...,n-1
            for (int v = 0; v <len ; v++) {
                if(distance[position][v]<inf){//顶点position到顶点V连通
                    //result[position]表示源顶点到位置position顶点的距离
                    //result[position]+distance[position][v]表示源顶点通过位置position顶点到达顶点v的距离
                    if(result[v]>result[position]+distance[position][v]){
                        result[position]=result[position]+distance[position][v];
                    }
                }
            }
        }
        return result;
    }
    //主函数
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] temp=sc.nextLine().split(" ");
        int len=temp.length;
        int[][] distance=new int[len][len];
        for (int i = 0; i <len ; i++) {
            int num=Integer.parseInt(temp[i]);
            if(num==-1){
                num=inf;
            }
            distance[0][i]=num;
        }
        for (int i = 1; i < len; i++) {
            String[] temp1=sc.nextLine().split(" ");
            for (int j = 0; j <len ; j++) {
                int num=Integer.parseInt(temp1[j]);
                if(num==-1){
                    num=inf;
                }
                distance[i][j]=num;
            }
        }
        for (int i = 0; i <len ; i++) {
            System.out.println();
            for (int j = 0; j <len ; j++) {
                System.out.print(distance[i][j]+" ");
            }
        }
        System.out.println("------------方法1-------------");
        int[][] result=solutionByFloyd(distance);
        for (int i = 1; i <result.length ; i++) {
            System.out.println(result[0][i]);
        }
        System.out.println("----------------------方法2--------------");
        int[]  result1=solutionByDijkstra(distance,0);
        for (int i = 1; i <result1.length ; i++) {
            System.out.println(result1[i]);
        }
    }
}
