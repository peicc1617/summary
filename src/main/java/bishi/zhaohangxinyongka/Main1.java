package bishi.zhaohangxinyongka;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-15 20:12:44
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        char[] arr=str.toCharArray();
        int[] result=new int[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            result[i]=1;
        }
        int j=0;
        for (int i = 0; i <len ; i++) {
            if(arr[i]=='R'){
                j=0;
                while(arr[i+j+1]=='R'){
                    j++;
                }
                if(j%2==0){
                    result[i+j]=result[i+j]+1;
                }else{
                    result[i+j+1]=result[i+j+1]+1;
                }
                result[i]=result[i]-1;
            }else{
                j=0;
                while (arr[i-j-1]=='L'){
                    j++;
                }
                if(j%2==0){
                    result[i-j]=result[i-j]+1;
                }else{
                    result[i-j-1]= result[i-j-1]+1;
                }
                result[i]=result[i]-1;
            }
        }
        for (int i = 0; i <str.length() ; i++) {
            if(i==0){
                System.out.print(result[i]);
            }else{
                System.out.print(" "+result[i]);
            }

        }

    }
}
