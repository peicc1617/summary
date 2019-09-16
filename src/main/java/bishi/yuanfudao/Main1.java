package bishi.yuanfudao;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-16 16:56:42
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[][] arr=new int[N][M];
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <M ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int[] res=print(arr,N,M);
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]+" ");
        }

    }
    public static int[] print(int[][] arr,int rows,int cols){
        int x0=0;
        int y0=0;
        int xBound=rows-1;
        int yBound=cols-1;
        int index=0;
        int result[]=new int[rows*cols];

        while (x0<=xBound&&y0<=yBound){
            if(y0<=yBound){
                for (int i = y0; i <=yBound ; i++) {
                    result[index++]=arr[i][x0];
                }
            }
            if(x0<xBound){
                for (int i = x0+1; i <=xBound ; i++) {
                    result[index++]=arr[yBound][i];
                }
            }
            if(x0<xBound&&y0<yBound){
                for (int i = yBound-1; i >=y0 ; i--) {
                    result[index++]=arr[i][xBound];
                }
            }
            if(x0<yBound-1&&y0<yBound){
                for (int i = xBound-1; i >=x0+1 ; i--) {
                    result[index++]=arr[y0][i];
                }
            }
            x0++;
            y0++;
            xBound--;
            yBound--;
        }
        return result;
    }
}
