package leetcode.dp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @基本功能:最长公共子序列
 * @program:summary
 * @author:peicc
 * @create:2019-08-29 16:01:33
 **/
public class LCS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            String str1=sc.next();
            String str2=sc.next();
            int len1= str1.length();
            int len2=str2.length();

            int result=findLongest(str1,str2,len1,len2);
        System.out.println(result);

    }
    public static int findLongest(String str1,String str2,int n,int m){
        int[][] dp=new int[n+1][m+1];
        char[][] state=new char[n+1][m+1];//记录转移状态
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=m ; j++) {
                dp[i][j]=0;
            }
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    state[i][j]='+';//此时由dp[i-1][j-1]转移而来
                }else if(dp[i-1][j]>dp[i][j-1]){
                    dp[i][j]=dp[i-1][j];//比较左边跟上边
                    state[i][j]='-';//此时由dp[i-1][j]转移而来
                }else if(dp[i-1][j]<dp[i][j-1]){
                    dp[i][j]=dp[i][j-1];
                    state[i][j]='*';//此时由dp[i][j-1]转移而来
                }else{
                    dp[i][j]=dp[i][j-1];
                    state[i][j]='/';//此时由dp[i][j-1]或dp[i-1][j]转移而来
                }
            }
        }
        int maxSubLen=dp[n][m];
        String lcs="";
        Set<String> set=new HashSet<>();
        backtrace(state,str1,n,m,maxSubLen,lcs,set);
        for (String str:set) {
            System.out.println(str.toString());
        }
        return dp[n][m];
    }
    public static void backtrace(char[][] state, String str1, int i, int j, int subLen,String lcs, Set<String> set){
        if(i==0||j==0){
            StringBuilder sb=new StringBuilder(lcs);
            lcs=sb.reverse().toString();
            if(lcs.length()==subLen){
                set.add(lcs);
            }
            set.add(lcs);
            return;
        }
        switch (state[i][j]){
            case '+':
                lcs=lcs+ str1.charAt(i-1);
                backtrace(state,str1,i-1,j-1,subLen,lcs,set);
                break;
            case '-':
                backtrace(state,str1,i-1,j,subLen,lcs,set);
                break;
            case '*':
                backtrace(state,str1,i,j-1,subLen,lcs,set);
                break;
            case '/':
                backtrace(state,str1,i-1,j,subLen,lcs,set);
                backtrace(state,str1,i,j-1,subLen,lcs,set);
                break;
        }
    }
}
