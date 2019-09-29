package bishi.douyu;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-28 14:35:35
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        System.out.println();
        for (int i = 0; i <p ; i++) {
            System.out.println("a:"+in.nextInt()+"b:"+in.nextInt());
        }
        in.close();
    }
}
