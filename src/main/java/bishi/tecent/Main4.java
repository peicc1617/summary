package bishi.tecent;


import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-20 19:51:26
 **/
public class Main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int[] res=new int[k];
        for (int i = 0; i <k ; i++) {
            res[i]=getMin(arr);
            operation(arr,res[i]);
            System.out.println(res[i]);
        }


    }
    public static int getMin(int[] arr){
        int min=Integer.MAX_VALUE;
        int index=0;
        boolean flag=false;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=0){
                flag=true;
                if(arr[i]<min){
                    min=arr[i];

                }
            }


        }
        if(!flag){
            return 0;
        }else{
            return min;
        }

    }
    public static void operation(int[] arr,int x){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=0){
                arr[i]=arr[i]-x;
            }
        }
    }
}
