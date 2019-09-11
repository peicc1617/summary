package bishi.vivo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-11 15:51:58
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().trim().split(" ");
        int len=str.length;
        int[] arr=new int[len];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <len ; i++) {
            arr[i] = Integer.parseInt(str[i]);
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        Iterator iterator=map.values().iterator();
        int sum=0;
        while (iterator.hasNext()){
            int value=(Integer) iterator.next();

                sum=sum+value*value;


        }
        System.out.println(sum);
/*int count=len;
while(count!=0){

}
        for (int i = 0; i <len ;) {
            if(arr[i]==arr[i+1]){
                while(arr[i]==arr[i+1]){
                    i++;
                }
                boolean flag=true;
                for (int j = i+1; j <len ; j++) {
                    if(arr[j]==arr[i]){
                        flag=false;
                        break;
                    }
                }
            }else{
                i++;
            }


        }*/
    }
}
