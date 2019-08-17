package 常见题型;

import java.util.*;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-12 19:58:23
 **/
public class Test20190812 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        int min=array[n/2]+array[n/2-1];
        int max=array[0]+array[n-1];
        int result=max-min;
        System.out.println(result);
    }
}
