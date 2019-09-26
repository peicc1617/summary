package bishi.tecent;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-20 19:51:20
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        String[] res=new String[T];
        for (int i = 0; i <T ; i++) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int j = 0; j <n ; j++) {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            if(n==2){
                String str=arr[0]+" "+arr[1];
                res[i]=str;
            }

            if(n>2){
                int p=0;
                int q=n-1;
                int sum1=0;
                while (p<q){
                    sum1=sum1+arr[p]+arr[q];
                    p=p+2;
                    q=q-2;
                }
                p=1;
                q=n-2;
                int sum2=0;
                while (p<=q){
                    if(p==q){
                        sum2=sum2+arr[p];
                    }else{
                        sum2=sum2+arr[p]+arr[q];
                    }

                    p=p+2;
                    q=q-2;
                }
                StringBuilder sb=new StringBuilder();
                if(sum1<=sum2){
                    sb.append(sum1).append(" ").append(sum2);

                }else{
                    sb.append(sum2).append(" ").append(sum1);
                }
                res[i]=sb.toString();
            }


        }
        for(int i=0;i<T;i++){
            System.out.println(res[i]);
        }
    }
}
