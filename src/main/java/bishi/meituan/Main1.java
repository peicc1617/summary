package bishi.meituan;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-16 14:53:55
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        StringBuilder sb=new StringBuilder();
        if (str==null){
            System.out.println(-1);
            return;
        }
        for (int i = 0; i <str.length() ; ) {
            int end=str.lastIndexOf(str.charAt(i));
            for (int j = i+1; end<str.length()&&j <=end ; j++) {
                int temp=str.lastIndexOf(str.charAt(j));
                if (temp>end){
                    end=temp;
                }
            }
            int len=end-i+1;
            i=end+1;
            count++;

            sb.append(len).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
