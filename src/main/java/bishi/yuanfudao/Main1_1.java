package bishi.yuanfudao;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-16 16:57:07
 **/
public class Main1_1 {
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
        int x0=0;
        int y0=0;
        int xBound=N-1;
        int yBound=M-1;
        int index=0;
        StringBuilder sb=new StringBuilder();
        while (x0<=xBound&&y0<=yBound){
            if(y0<=yBound){
                for (int i = y0; i <=yBound ; i++) {
                    sb.append(arr[i][x0]).append(" ");
                }
            }
            if(x0<xBound){
                for (int i = x0+1; i <=xBound ; i++) {
                    sb.append(arr[yBound][i]).append(" ");
                }
            }
            if(x0<xBound&&y0<yBound){
                for (int i = yBound-1; i >=y0 ; i--) {
                    sb.append(arr[i][xBound]).append(" ");
                }
            }
            if(x0<yBound-1&&y0<yBound){
                for (int i = xBound-1; i >=x0+1 ; i--) {
                    sb.append(arr[y0][i]).append(" ");
                }
            }
            x0++;
            y0++;
            xBound--;
            yBound--;
        }
        System.out.println(sb.toString().trim());

    }

}
