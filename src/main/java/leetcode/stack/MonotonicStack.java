package leetcode.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @基本功能:单调栈
 * @program:summary
 * @author:peicc
 * @create:2019-09-30 10:05:09
 **/
public class MonotonicStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i <arr.length ; i++) {
            if (!stack.isEmpty()&&stack.peek()>arr[i]) {//栈顶元素大于待插入元素
                while (!stack.isEmpty()&&stack.peek()>arr[i]) {//将大于待插入的元素的栈中元素全部出栈
                    stack.pop();
                }
            }
            stack.push(arr[i]);
        }
    }
}
