package leetcode.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @基本功能:返回指定位置元素左右两边比它小的元素的位置
 * @program:summary
 * @author:peicc
 * @create:2019-09-30 10:38:37
 **/
public class PositionOfLessThanIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[][] res=new int[n][2];//返回位于位置i的元素左右两边比它小的元素的位置
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        Stack<Integer> stack=new Stack<>();//构造一个单调递增栈
        for (int i = 0; i <arr.length ; i++) {
            if (!stack.isEmpty()&&arr[stack.peek()]>=arr[i]) {// 待入栈元素小于栈顶元素，对于弹出的每个元素来说，待入栈元素都是其右边最靠近的最小元素
                while (!stack.isEmpty()&&arr[stack.peek()]>=arr[i]) {
                    res[stack.peek()][1]=i;
                    stack.pop();
                }
            }
            //单调递增栈更新完毕
            if (!stack.isEmpty()) {//如果栈内元素非空，对于待入栈元素而言，其左边最小元素的位置即为此时栈顶元素
                res[i][0]=stack.peek();
            } else {// 否则，其左边无最小元素
                res[i][0]=-1;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {// 出栈的时候更新比它小的右边元素的位置
            res[stack.pop()][1]=-1;
        }
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i][0]+" "+res[i][1]);
        }
    }
}
