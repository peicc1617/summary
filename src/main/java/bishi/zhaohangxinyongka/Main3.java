package bishi.zhaohangxinyongka;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-15 20:13:12
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='?'){
                count++;
            }
        }

    }
}
