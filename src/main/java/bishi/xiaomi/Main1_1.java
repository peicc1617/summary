package bishi.xiaomi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-11 18:45:17
 **/
public class Main1_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] sortArr = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();
            sortArr[i] = arr[i];
        }
        Arrays.sort(sortArr);
        int count = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {

            if(arr[i] == sortArr[j]){
                ++count;
                ++j;
            }
        }
        System.out.println(n-count);
    }
}
