package leetcode.stack;


import java.util.Scanner;
import java.util.Stack;

/**
 * @基本功能:直方图图中最大的矩形(假设每个矩形的宽度为1)
 * @program:summary
 * @author:peicc
 * @create:2019-09-30 09:04:49
 **/
public class LargestRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] height=new int[n];
        for (int i = 0; i <n ; i++) {
            height[i]=sc.nextInt();
        }
        int res=getLargestRectangleArea(height);
        System.out.println(res);
    }
    public static int getLargestRectangleArea(int[] height){
        Stack<Integer> stack=new Stack();//构造一个单调递增栈
        Stack<Integer> stackOfWidth=new Stack<>();
        int res=0;
        for (int i = 0; i <height.length ; i++) {
            if (!stack.isEmpty()&&(Integer)stack.peek()>height[i]){// 待插入元素小于栈顶元素，此时栈中大于栈顶的元素全部弹出
                int w=0;
                while (!stack.isEmpty()&&(Integer)stack.peek()>height[i]) {
                    int h=stack.pop();//获取矩形高度
                    w+=stackOfWidth.pop();//获取矩形宽度
                    int area=h*w;
                    res=Math.max(res,area);
                }
                stack.push(height[i]);//入栈
                stackOfWidth.push(w+1);//更新矩形宽度
            } else {// 待插入元素大于栈顶元素，直接插入
                stack.push(height[i]);
                stackOfWidth.push(1);//宽度
            }
        }
        //单调递增栈构建完毕，此时出栈计算元素面积
        int w=0;
        while (!stack.isEmpty()) {
            int h=stack.pop();
            w+=stackOfWidth.pop();
            int area=h*w;
            res=Math.max(res,area);
        }
        return res;
    }
}
