package leetcode.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @基本功能:利用两个栈实现一个队列
 * @program:summary
 * @author:peicc
 * @create:2019-10-07 14:46:39
 **/
public class ImplementsQueueByStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        for (int i = 0; i <N ; i++) {
            String str=sc.next();
            if (str.contains("add")) {// add
                int x=sc.nextInt();// 读取待入队的数
                stack1.push(x);
            } else if (str.contains("peek")) {// peek
                if (!stack2.isEmpty()) {
                    System.out.println(stack2.peek());
                } else {// 当第二个栈为空时，将第一个栈中的元素弹出压入第二个栈中
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                    System.out.println(stack2.peek());
                }
            } else {// poll
                if (!stack2.isEmpty()) {
                    stack2.pop();
                } else {// 当第二个栈为空时，将第一个栈中的元素弹出压入第二个栈中
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                    stack2.pop();
                }
            }
        }
    }
}
