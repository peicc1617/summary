package leetcode.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @基本功能:实现一个特殊功能的栈，能够返回栈中最小元素
 * @program:summary
 * @author:peicc
 * @create:2019-10-07 10:21:39
 **/
public class GetMin {
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            String str=sc.next();
            if (str.indexOf("push")!=-1) {//push
                int x=sc.nextInt();
                stack1.push(x);
                if (!stack2.isEmpty()) {
                    if (x<stack2.peek()) {
                        stack2.push(x);
                    } else {
                        stack2.push(stack2.peek());
                    }
                } else {
                    stack2.push(x);
                }


            } else if (str.indexOf("pop")!=-1) {//pop
                if ((!stack1.isEmpty())&&(!stack2.isEmpty())) {
                    stack1.pop();
                    stack2.pop();
                }

            } else {//getMin
                System.out.println(stack2.peek());
            }
        }
    }
}
