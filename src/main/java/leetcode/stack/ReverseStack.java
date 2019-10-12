package leetcode.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @基本功能:使用递归和栈来逆序一个栈
 * @program:summary
 * @author:peicc
 * @create:2019-10-07 15:41:07
 **/
public class ReverseStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack stack=new Stack();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = n-1; i >=0 ; i--) {
            stack.push(arr[i]);
        }
        reverseStack(stack);
        for (int i = 0; i <n ; i++) {
            if (i==0){
                System.out.print(stack.pop());
            } else {
                System.out.print(" "+stack.pop());
            }
        }
    }
    public static void reverseStack(Stack stack){
        if (stack==null||stack.isEmpty()||stack.size()==1) {
            return;
        }
        int x=(Integer) stack.pop();
        reverseStack(stack);
        Stack temp=new Stack();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        stack.push(x);
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }
}
