package leetcode.array;

import java.util.Scanner;

/**
 * @基本功能:s顺时针打印数组
 * @program:summary
 * @author:peicc
 * @create:2019-10-23 15:10:48
 **/
public class PrintMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        printMatrix(arr);
    }
    public static void printMatrix(int[][] arr){
        int x_Start=0;
        int y_Start=0;
        int x_Bound=arr.length-1;
        int y_Bound=arr[0].length-1;
        System.out.println("顺指针打印矩阵");
        while (x_Start<=x_Bound&&y_Start<=y_Bound){
            //从左往右打印
            for (int y = y_Start; y <=y_Bound ; y++) {
                System.out.print(arr[x_Start][y]);
            }
            System.out.println();
            //从上往下打印
            for (int x = x_Start+1; x <=x_Bound ; x++) {
                System.out.print(arr[x][y_Bound]);
            }
            System.out.println();
            //从右往左打印
            for (int y = y_Bound-1; y >=y_Start ; y--) {
                System.out.print(arr[x_Bound][y]);
            }
            System.out.println();
            //从下往上打印
            for (int x = x_Bound-1; x >=x_Start ; x--) {
                System.out.print(arr[x][y_Start]);
            }
            System.out.println();
            x_Start++;
            y_Start++;
            x_Bound--;
            y_Bound--;
        }
    }
}
