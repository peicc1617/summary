package bishi.vivo;


import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-11 15:51:51
 **/
public class Main2_2 {
    //15 10 5,1,1000#2,3,3000#5,2,15000#10,4,16000
    static int Disk;
    static int Memory;
    static int dp[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Disk=sc.nextInt();
        Memory=sc.nextInt();
        String[] str=sc.nextLine().trim().split("#");
        int num=str.length;
        int[] disk=new int[num];
        int[] momery=new int[num];
        dp=new int[Disk+1][Memory+1];
        int[] visit=new int[num];
        for (int i = 0; i <num ; i++) {
            String[] temp=str[i].split(",");
            disk[i]= Integer.parseInt(temp[0]);
            momery[i]=Integer.parseInt(temp[1]);
            visit[i]=Integer.parseInt(temp[2]);
            zeroOnePach(disk[i],momery[i],visit[i]);
        }
        System.out.println(dp[Disk][Memory]);




    }
    public static void zeroOnePach(int disk,int momery,int visit ){
        for (int i = Disk; i >=disk ; i--) {
            for (int j = Memory; j >=momery ; j--) {
                dp[i][j]=Math.max(dp[i-disk][j-momery]+visit,dp[i][j]);
            }
        }
    }
}
