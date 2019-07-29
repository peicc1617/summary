package leetcode.string;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-07-29 19:10:28
 **/
public class ReverString {
    public static String reverseString(String str){
        StringBuilder result=new StringBuilder();
        int len=str.length();
        for (int i =len-1; i >=0 ; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str="abcdef";
        String temp=reverseString(str);
        System.out.println(temp);
    }
}
