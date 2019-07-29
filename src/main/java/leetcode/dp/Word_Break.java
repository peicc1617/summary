package leetcode.dp;

import java.util.HashSet;
import java.util.Set;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-07-29 17:16:42
 **/
//arrays[j]:子串（i...j）能否分解为词典单词
//arrays[0] 初始化
//arrays[i]=arrays[j]&&j之后的子串
public class Word_Break {
    public static boolean wordBreak2(String s, Set<String> dict){
        int len = s.length();
        boolean[] arrays = new boolean[len+1];
        arrays[0] = true;
        for (int i = 1; i <= len; ++i){
            for (int j = 0; j < i; ++j){
                if (arrays[j] && dict.contains(s.substring(j, i))){
                    arrays[i] = true;
                    break;
                }
            }
        }
        return arrays[len];
    }

    public static void main(String[] args) {
        String str="leetcode";
        Set<String> set=new HashSet<>();
        set.add("leet");
        set.add("code");
        boolean result=wordBreak2(str,set);
        System.out.println(result);
    }
}
