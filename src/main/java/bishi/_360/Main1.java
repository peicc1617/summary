package bishi._360;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 18:51:03
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int[][] res=new int[n][2];
        LinkedList<Integer> stack=new LinkedList<>();//构造一个单调递减栈
        for (int i = 0; i <arr.length ; i++) {
            while(!stack.isEmpty()&&arr[stack.peek()]>=arr[i]){//待插入元素小于等于栈顶元素
                res[stack.peek()][1]=i;
                stack.pop();
            }
            if(!stack.isEmpty()){
                res[i][0]=stack.peek();
            }else{
                res[i][0]=-1;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            res[stack.pop()][1]=-1;
        }
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i][0]+" "+res[i][1]);
        }
    }

}
