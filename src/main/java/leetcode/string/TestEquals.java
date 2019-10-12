package leetcode.string;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-09 21:14:58
 **/
public class TestEquals {
    public static void main(String[] args) {
        String s="111";
        String x="";
        String ab=s+x;
        String y="111";
        System.out.println(ab==s);
        System.out.println(ab.equals(s));
        String str="hello";
        String str1="word";
        String str2="helloword";
        System.out.println(str2==str+str1);
        System.out.println(str2.equals(str+str1));
        String str00="hello";
        String str01="o";
        String str02="hell";
        String str03="hell"+"o";
        System.out.println(str00==str03);
        System.out.println(str00==str+str01);
        String aa=null;
        String bb="abc";
        String cc=aa+bb;
        System.out.println(cc);

    }
}
