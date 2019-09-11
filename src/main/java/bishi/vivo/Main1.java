package bishi.vivo;

import java.util.Scanner;
import java.util.Stack;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-11 15:51:14
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String temp=str.substring(str.indexOf("0")+1);
        Stack<Character> stack=new Stack();
        int countA=0;
        int countB=0;
        for (int i = 0; i <temp.length() ; i++) {
            if(temp.charAt(i)=='('){
//                stack.push(temp.charAt(i));
                countA++;
            }else{
                countB++;
            }
        }
        System.out.println(countB-countA);
    }
}
