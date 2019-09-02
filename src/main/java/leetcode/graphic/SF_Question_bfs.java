package leetcode.graphic;

import java.util.Scanner;

/**
 * @基本功能:
 * @输入：第一行输入3个数，n,m,k分别代表人数，语言数，已知的信息数。
 * @输入：接下来的k行，每行两个数u,v,代表第u个人会第v中语言
 * @program:summary
 * @author:peicc
 * @create:2019-08-30 10:14:16
 **/
public class SF_Question_bfs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[][] e=new int[n][m];
        int[] book=new int[n];//标志位
        for (int i = 0; i <k ; i++) {
            int u=sc.nextInt();
            int v=sc.nextInt();
            e[u-1][v-1]=1;
        }
        //图的深度遍历
        int count=0;//记录独立子图的个数
        for (int i = 0; i <n ; i++) {
            if(book[i]==0){//如果此人没有被访问到
                book[i]=1;
                count++;
                for (int j = 0; j <m ; j++) {//每个人通过所会的语言能与多少人交流
                    if(e[i][j]==1){//说明此人掌握了此种语言
                        for (int l = 0; l <n ; l++) {
                            if(e[l][j]==1){
                                book[l]=1;
                            }
                        }

                    }
                }
            }
        }
        System.out.println(count-1);
    }
}
