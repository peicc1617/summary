package leetcode.tree;

import java.util.Scanner;

/**
 * @基本功能:并查集
 * @program:summary
 * @author:peicc
 * @create:2019-08-24 15:16:41
 **/
public class Union_find {
    /**
     * @功能：
     * @Param: [clause, n]
     * @return: int
     * @Date: 2019/8/24
     */
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
        }else{//路径压缩
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
            init[t2]=t1;//u的最高领导人归顺v的最高领导人
//            init[u]=v;
        }
    }

    public static void main(String[] args) {
        //输入测试样例
        //第一行两个数 n,m n:表示强盗的人数 m:表示线索的数目
        //接下来的m行每一行有两个数a,b,表示强盗a和强盗b是同伙
      /*

            */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] clause=new int[m][2];
        for (int i = 0; i <m ; i++) {
            clause[i][0]=sc.nextInt();
            clause[i][1]=sc.nextInt();
        }
        int[] init=new int[n+1];
        //初始化，将自己设置成自己的老板
        for (int i = 1; i <=n ; i++) {
            init[i]=i;
        }
        int[] result=solution(clause,init);
        for (int i = 1; i <result.length ; i++) {
            System.out.println(i+"->"+result[i]);
        }
    }
}
