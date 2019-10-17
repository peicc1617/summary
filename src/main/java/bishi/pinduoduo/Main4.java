package bishi.pinduoduo;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-17 14:33:19
 **/
public class Main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int k = 0; k <T ; k++) {
            int N=sc.nextInt();
            int M=sc.nextInt();
            int[] arr=new int[N];
            for (int j = 0; j <N ; j++) {
                arr[j]=sc.nextInt();
            }
            int[][] dp=new int[N+1][M+1];
            if (M==1) {
                HashSet set=new HashSet();
                for (int j = 0; j <N ; j++) {
                    set.add(arr[j]);
                }
                dp[N][M]=set.size();
            }else if (N==M){
               dp[N][M]=N;
            }else{
                for (int i = 1; i <=N ; i++) {
                    for (int j = 1; j <=M ; j++) {
                        int max=0;
                        for (int l = j-1; l <=i-1 ; l++) {
                            HashSet set1=new HashSet();
                            for (int m = l+1; m <=i ; m++) {
                                set1.add(arr[m-1]);
                            }
                            int temp=dp[l][j-1]+set1.size();
                            if (temp>max){
                                max=temp;
                            }
                        }
                        dp[i][j]=max;
                    }
                }
            }

            System.out.println(dp[N][M]);
        }

    }
}
