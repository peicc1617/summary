package bishi.xiaomi;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-11 18:44:50
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[][] array = new int[n][n];
        //读取数据
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //求array[i][j]
                for (int k = j; k < n; k++) {
                    if (array[i][k] != 0) {
                        if (k < n-1) {
                            if (array[i][k] != array[i ][k+1]) {
                                int temp = array[i][k];
                                array[i][k] = 0;
                                array[i][j] = temp;
                            }
                            else {
                                int temp = array[i][k] * 2;
                                array[i][k] = 0;
                                array[i ][k+1] = 0;
                                array[i][j] = temp;
                            }
                        }
                        else {
                            int temp = array[i][k];
                            array[i][k] = 0;
                            array[i][j] = temp;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            if(i!=n-1){
                System.out.println();
            }
        }
    }
}
