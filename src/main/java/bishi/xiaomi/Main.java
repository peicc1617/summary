

import java.util.Arrays;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-11 18:45:25
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] copy=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
            copy[i]=arr[i];
        }
        Arrays.sort(arr);
        int count=0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]==copy[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
