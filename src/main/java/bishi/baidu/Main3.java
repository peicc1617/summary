package bishi.baidu;

import java.util.*;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-10 18:36:17
 **/
public class Main3 {
    static int[][]e;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        e=new int[n][n];
        for (int i = 0; i <n-1 ; i++) {
            int u=sc.nextInt();
            int v=sc.nextInt();
            e[u-1][v-1]=1;
        }
        HashMap map=new HashMap();
        int count=1;
        HashSet set=new HashSet();
        Stack stack=new Stack();
        for (int i = 0; i <n ; i++) {
            set.add(i);
        }
        while (!set.isEmpty()){
            for (int i = 0; i <n ; i++) {
                boolean flag=true;
                if(set.contains((Object) i)){
                    for (int j = i+1; j <n ; j++) {
                        if(e[i][j]!=0){
                            flag=false;
                            break;
                        }
                    }
                    if (flag){
                        stack.push(count);
                        set.remove((Object) i);
                        for (int j = 0; j <n ; j++) {
                            e[i][j]=0;
                        }
                    }
                }

            }
            count++;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

    }
}
