package bishi.ebay;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-17 18:34:16
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int K=sc.nextInt();
        int[] arr=new int[K];
        for (int i = 0; i <K ; i++) {
            arr[i]=sc.nextInt();
        }
        ArrayList list=new ArrayList();
        int count=0;
        boolean flag=true;
        for (int i = 0; i <K ; i++) {
            if (!list.contains(arr[i])){
                if (list.size()<M){
                    list.add(arr[i]);
                    count++;
                }else{
                    flag=true;
                    int postion=i+1;
                    for (int j = 0; j <list.size() ; j++) {
                        int temp=(Integer) list.get(j);
                        int index=getIndex(arr,i+1,temp);
                        if (index==-1){
                            list.remove((Integer)j);
                            list.add(arr[i]);
                            count++;
                            flag=false;
                            break;
                        }else{
                            if (index>postion){
                                postion=index;
                            }
                        }
                    }
                    if(flag){
                        list.remove((Integer)arr[postion]);
                        list.add(arr[i]);
                        count++;
                    }

                }
            }
        }
        System.out.println(count);
    }
    public static int getIndex(int[] arr,int start,int target){
        for (int i = start; i <arr.length ; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
