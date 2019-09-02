package leetcode.graphic;

import java.util.Scanner;

/**
 * @基本功能:2048
 * @program:summary
 * @author:peicc
 * @create:2019-08-26 19:44:33
 **/
public class GameOf2048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int direction = sc.nextInt();
        int[][] array = new int[4][4];
        //读取数据
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        switch (direction) {
            case 1://向上移动
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        //为每一array[j][i]赋值
                        for (int k = j; k < 4; k++) {
                            if (array[k][i] != 0) {
                                if (k < 3) {
                                    if (array[k][i] != array[k + 1][i]) {
                                        int temp = array[k][i];
                                        array[k][i] = 0;
                                        array[j][i] = temp;
                                    }
                                    else {
                                        int temp = array[k][i] * 2;
                                        array[k][i] = 0;
                                        array[k + 1][i] = 0;
                                        array[j][i] = temp;
                                    }
                                }
                                else {
                                    int temp = array[k][i];
                                    array[k][i] = 0;
                                    array[j][i] = temp;
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 2://向下移动
                for (int i = 0; i < 4; i++) {
                    for (int j = 3; j >= 0; j--) {
                        //为array[j][i]赋值
                        for (int k = j; k >= 0; k--) {
                            if (array[k][i] != 0) {
                                if (k < 1) {
                                    int temp = array[k][i];
                                    array[k][i] = 0;
                                    array[j][i] = temp;
                                }
                                else {
                                    if (array[k][i] != array[k - 1][i]) {
                                        int temp = array[k][i];
                                        array[k][i] = 0;
                                        array[j][i] = temp;
                                    }
                                    else {
                                        int temp = array[k][i] * 2;
                                        array[k][i] = 0;
                                        array[k - 1][i] = 0;
                                        array[j][i] = temp;
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 3://向左移动
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        //求array[i][j]
                        for (int k = j; k < 4; k++) {
                            if (array[i][k] != 0) {
                                if (k < 3) {
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
                                break;
                            }
                        }
                    }
                }
                break;
            case 4://向右移动
                for (int i = 0; i < 4; i++) {
                    for (int j = 3; j >= 0; j--) {
                        //求array[i][j]
                        for (int k = j; k >= 0; k--) {
                            if (array[i][k] != 0) {
                                if (k < 1) {
                                    int temp = array[i][k];
                                    array[i][k] = 0;
                                    array[i][j] = temp;
                                }
                                else {
                                    if (array[i][k] != array[i][k-1]) {
                                        int temp = array[i][k];
                                        array[i][k] = 0;
                                        array[i][j] = temp;
                                    }
                                    else {
                                        int temp = array[i][k] * 2;
                                        array[i][k] = 0;
                                        array[i][k - 1] = 0;
                                        array[i][j] = temp;
                                    }
                                    break;
                                }
                            }
                        }
                    }

                }
                break;
        }
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
