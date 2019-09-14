package bishi.xiaohongshu;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-14 14:55:13
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//用户数量
        int[][] e=new int[N][N];
        int count_1=0;
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <N ; j++) {
                e[i][j]=sc.nextInt();
                if(i!=j&&e[i][j]==1){
                    count_1++;
                }
            }
        }
        int[][] clause=new int[count_1][2];
        int k=0;
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <N ; j++) {
                if(i!=j&&e[i][j]==1){
                    clause[k][0]=i;
                    clause[k][1]=j;
                    k++;
                }
            }
        }
        int[] init=new int[N];
        //初始化，将自己设置成自己的老板
        for (int i = 0; i <N ; i++) {
            init[i]=i;
        }
        int[] result=solution(clause,init);
        HashSet set=new HashSet();
        for (int i = 0; i <result.length ; i++) {
            set.add(result[i]);
        }
        System.out.println(set.size());
    }
    public static int[] solution(int[][] clause,int[] init){
        int len=clause.length;
        for (int i = 0; i <len ; i++) {
            int v=clause[i][0];
            int u=clause[i][1];
            merge(v,u,init);
        }
        return init;
    }
    //找爹
    public static int getFather(int i,int[] init){
        if(i==init[i]){
            return i;
        }else{
            init[i]=getFather(init[i],init);
            return init[i];
        }
    }
    //合并两个子集合
    public static void merge(int v,int u,int[] init){
        int t1,t2;
        t1=getFather(v,init);
        t2=getFather(u,init);
        if(t1!=t2){
            init[t2]=t1;
            init[u]=v;
        }
    }



}
