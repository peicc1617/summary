package bishi.common;

import java.util.Scanner;

public class RabbitMatrix {
    static int book[][];
    static int min=Integer.MAX_VALUE;

    public static void main(String[] args) {
        int step=0,sum=0,x=0,y=0;
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        int[][] arr=new int[len][len];

        for(int i=0;i<len;i++) {
            String s=in.next();
            String[] strArr=s.split(",");
            for(int j=0;j<len;j++) {
                int value=Integer.parseInt(strArr[j]);
                arr[i][j]=value;
            }

        }
        book=new int[len][len];
        book[0][0]=1;
        dfs(arr,0,0,arr[0][0]);
        System.out.println(min);
    }
    //DFS
    public static void dfs(int[][] arr,int x,int y,int sum) {
        int next[][]= {{0,1},{1,0},{0,-1},{-1,0}};//右，下，左，上
        int len=arr[0].length;
//        int[][] book=new int[len][len];
//        book[x][y]=1;
        if(x==len-1&&y==len-1) {
            if(sum<min)
                min=sum;
        }
        int tx=-1,ty=-1;
        for(int k=0;k<=3;k++) {
            tx=x+next[k][1];
            ty=y+next[k][0];
            //判断越界
            if(tx<0||tx>len-1||ty<0||ty>len-1)
                continue;
            //判断该点是否已经在路径中
            if(book[tx][ty]==0) {
                book[tx][ty]=1;//标记该点已走过
                sum+=arr[tx][ty];
                dfs(arr, tx,ty,sum);
                book[tx][ty]=0;
                sum-=arr[tx][ty];
            }
        }
    }
}
