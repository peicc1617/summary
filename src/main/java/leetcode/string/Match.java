package leetcode.string;

/**
 * @基本功能:字符串匹配
 * @program:summary
 * @author:peicc
 * @create:2019-09-11 11:01:48
 **/
public class Match {
    /***
     * @函数功能：暴力匹配
     * @param s:文本串
     * @param p:模式串
     * @return：int
     */
    public static int violentMatch(String s,String p){
        int sLen=s.length();
        int pLen=p.length();
        int i=0;//指向文本串的指针
        int j=0;//指向模式串的指针
        while (i<sLen&&j<pLen){
            if(s.charAt(i)==p.charAt(j)){
                i++;
                j++;
            }else{
                i=i-j+1;
                j=0;
            }
        }
        if(j==pLen){
            return i-j;
        }else{
            return -1;
        }
    }
}
