package bishi.qianxin;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-12 18:51:02
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        try{
            n=sc.nextInt();

        }catch (Exception e){
            System.out.println("错误输入");
            return;
        }
        getResult(n);


    }
    public static void getResult(int n){
        String[] arr={"零","一","二","三","四","五","六","七","八","九"};
        String[] arr1={"","十","百","千","万"};
        String str=String.valueOf(n);
        char[] ch=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <ch.length ; i++) {
            int index=ch[i]-48;
            if(index!=0){
                sb.append(arr[index]).append(arr1[ch.length-i-1]);
            }else{
                if(i==ch.length-1){

                }else{
                    if (ch[i+1]!='0'){
                        sb.append(arr[index]);
                    }
                }

            }
        }
        /*String temp=new String(sb);
        char[] tempArr=temp.toCharArray();
        for (int i = 0; i <tempArr.length ; i++) {
            if(){

            }
        }*/
        System.out.println(sb.toString());
    }
}
