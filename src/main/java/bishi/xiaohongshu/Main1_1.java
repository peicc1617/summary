package bishi.xiaohongshu;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @基本功能:并查集
 * @program:summary
 * @author:peicc
 * @create:2019-09-14 14:55:31
 **/
public class Main1_1 {
    static int N;
    static int[][] e;
    static int[] book;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();//用户数量
        e=new int[N][N];
        book=new int[N];
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <N ; j++) {
                e[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for (int i = 0; i <N ; i++) {
            if(book[i]==0){
                count++;
                bfs(i);
            }
        }
        System.out.println(count);
    }
    /***
     * @函数功能：树的广度遍历
     * @param cur:当前结点
     * @return：void
     */
    public static void bfs(int cur){
        LinkedList queue=new LinkedList();
        queue.add(cur);
        while (!queue.isEmpty()){
            int temp=(int)queue.poll();
            book[temp]=1;
            for (int i = 0; i <N ; i++) {
                if(temp!=i&&e[temp][i]==1&&book[i]==0){
                    queue.offer(i);
                }
            }
        }

    }
}
