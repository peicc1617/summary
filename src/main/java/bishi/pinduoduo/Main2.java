package bishi.pinduoduo;

import java.util.Scanner;
import java.util.Stack;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-17 14:33:04
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if (str==null){
            System.out.println(0);
            return;
        }
        if (str.length()>100000) {
            System.out.println(0);
            return;
        }
        Stack<Character> stack=new Stack();
        char[] ch=str.toCharArray();
        int res=0;
        int temp=1;
        for (int i = 0; i <ch.length ;i++) {
            char cur=ch[i];
            if (cur=='('||cur=='['){
                stack.push(cur);
            }else if (cur==')'||cur==']'){
                if (!stack.isEmpty()){
                    if (cur==')'&&stack.peek()=='('){
                        stack.pop();
                        temp++;
                        if (2*(temp-1)>res){
                            res=(temp-1)*2;
                        }
                    }else if(cur==']'&&stack.peek()=='['){
                        stack.pop();
                        temp++;
                        if (2*(temp-1)>res){
                            res=(temp-1)*2;
                        }
                    }else{
                        temp=0;
                        while (!stack.isEmpty()){
                            stack.pop();
                        }
                    }
                }
            }

        }
        System.out.println(res);
    }


}
