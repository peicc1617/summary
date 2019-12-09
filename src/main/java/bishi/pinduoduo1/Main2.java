package bishi.pinduoduo1;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-12-05 18:48:18
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][2];
        for (int i = 0; i <n ; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        while(true){
            int[][] touchi=new int[1][2];
            touchi=steal(arr);
            //偷吃
            if (touchi[0][0]!=100){
                arr[touchi[0][0]][0]=Integer.MIN_VALUE;
            }
            if (touchi[0][1]!=100){
                arr[touchi[0][1]][0]=Integer.MIN_VALUE;
            }
            //美味度下降
            for (int i = 0; i <n ; i++) {
                if (arr[i][0]>0){
                    arr[i][0]=arr[i][0]-arr[i][1];
                }
            }
            //检查
            int count=0;
            for (int i = 0; i <n ; i++) {
                if(arr[i][0]>0){
                    count++;
                }
            }
            if (count<m){
                break;
            }
        }
        for (int i = 0; i <n ; i++) {
            if (arr[i][0]<0&&arr[i][0]!=Integer.MIN_VALUE){
                arr[i][0]=0;
            }
            if (arr[i][0]==Integer.MIN_VALUE){
                arr[i][0]=-1;
            }
            System.out.println(arr[i][0]);
        }
        


    }
    //偷吃两个沙包坐标
    public static int[][] steal(int[][] arr){
        int[][] res=new int[1][2];
        int max=Integer.MIN_VALUE;
        int subMax=Integer.MIN_VALUE;
        int index1=100;
        int index2=100;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i][0]>max&&arr[i][0]>0) {
                max=arr[i][0];
                index1=i;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if (i!=index1){
                if (arr[i][0]>subMax&&arr[i][0]>0) {
                    subMax=arr[i][0];
                    index2=i;
                }
            }
        }
        res[0][0]=index1;
        res[0][1]=index2;
        if (max==subMax){
            int[][] res1=new int[1][2];
            res1=same(arr,max,arr[index1][1],subMax,arr[index2][1],index1,index2);
            res[0][0]=res1[0][0];
            res[0][1]=res1[0][1];
        }
        return res;
    }
    //美味度相同
    public static int[][] same(int[][] arr,int max,int a,int subMax,int b,int index1,int index2){
        int[][] res=new int[1][2];
        int index11=index1;
        int index22=index2;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i][0]==max&&arr[i][1]>a){
                index11=i;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if(i!=index11){
                if (arr[i][0]==subMax&&arr[i][1]>b){
                    index22=i;
                }
            }

        }
        res[0][0]=index11;
        res[0][1]=index22;
        return res;
    }

}
