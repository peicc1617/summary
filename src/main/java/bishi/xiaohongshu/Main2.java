package bishi.xiaohongshu;

import java.util.Scanner;
import java.util.Stack;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-14 14:55:39
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        Stack stack=new Stack();
        if(len>10000){
            System.out.println("");
        }else{
            for (int i = 0; i <len ; i++) {
                if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z')){
                    stack.push(str.charAt(i));
                }else if(str.charAt(i)=='<'){
                    if(!stack.isEmpty()&&((char)stack.peek()!='('&&(char)stack.peek()!=')')){
                        stack.pop();
                    }
                }else if(str.charAt(i)=='('){
                    stack.push(str.charAt(i));
                }else{
                    while(!stack.isEmpty()&&(char)stack.peek()!='('){
                        stack.pop();
                    }
                    if(!stack.isEmpty()&&(char)stack.peek()=='('){
                        stack.pop();
                    }

                }
            }
        }
        StringBuilder sb=new StringBuilder();
        String result=null;
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        result=sb.reverse().toString();
        System.out.println(result);
    }
}
