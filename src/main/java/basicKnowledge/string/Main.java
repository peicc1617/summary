package basicKnowledge.string;

import java.util.*;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-21 19:31:59
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       String str1="hello";
       String str2="hello";
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str1));
        System.out.println(str1==str2);
        String str3="he";
        String str4="llo";
        String str5=str3+str4;
        System.out.println(str1==str5);
        String  str6="";
        for (int i = 0; i <3 ; i=i+2) {
            str6+=String.valueOf(i)+" "+String.valueOf(i+1);
        }
        System.out.println(str6);
    }
}
