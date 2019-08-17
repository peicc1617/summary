package leetcode.string;

/**
 * @基本功能:翻转字符串
 * @program:summary
 * @author:peicc
 * @create:2019-07-29 19:10:28
 **/
public class ReverString {
    //方法1：倒叙遍历
    public static String reverseString(String str){
        StringBuilder result=new StringBuilder();
        int len=str.length();
        for (int i =len-1; i >=0 ; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    //方法2：利用两个指针
    public static String reverseByPointer(String str,int from,int to){
        char[] array=str.toCharArray();
        while(from<to){
            char temp=array[from];
            array[from++]=array[to];
            array[to--]=temp;
        }
        return String.valueOf(array);
    }
    public static String ReverseSentence(String str){
        if(str==null||str.trim().equals("")){
            return null;
        }
        //整体翻转
        String temp=reverseByPointer(str,0,str.length()-1);
        //转换为数组，每一元素分别翻转
        String[] words=temp.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            sb.append(reverseByPointer(words[i],0,words[i].length()-1)).append(" ");
        }

        return sb.toString();
     }
    public static void main(String[] args) {
        String str="abcdef";
        System.out.println("--------------倒序遍历翻转--------------");
        System.out.println("翻转前："+str);
        String temp=reverseString(str);
        System.out.println("翻转后："+temp);
        System.out.println("原字符串："+str);
        System.out.println("------------利用指针翻转-------------");
        System.out.println("翻转前："+str);
        String temp1=reverseByPointer(str,0,str.length()-1);
        System.out.println("翻转后："+temp1);
        System.out.println("原字符串："+str);
        /* 扩展：剑指offer “student. a am I”-------“I am a student.”*/
        String test="student. a am I";
        System.out.println(ReverseSentence(test));
    }
}
