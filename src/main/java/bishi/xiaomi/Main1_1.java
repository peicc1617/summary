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
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        int count = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {

            if(arr[i] == copy[j]){
                ++count;
                ++j;
            }
        }
        int result1=0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]==copy[i]){
                result1++;
            }
        }
        int result2=n-count;
        int result=Math.max(result1,result2);
        System.out.println(result);
        System.out.println(result2);
    }
}
