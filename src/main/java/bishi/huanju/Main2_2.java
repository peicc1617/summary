package bishi.huanju;

import java.util.TreeSet;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-09 18:43:26
 **/
public class Main2_2 {

        private TreeSet<String> set = new TreeSet();
        private String swap(String str, int i, int j){
            // toCharArray()变成字符数组后进行交换
            char s[] = str.toCharArray();
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            return String.valueOf(s);
        }
        private void fullPerm(String str, int i){
            //排到最后一位就加入TreeSet
            if (i == str.length()){
                set.add(str);
                return;
            }
            else {
                for (int j = i; j < str.length(); j++){
                    str = swap(str, i, j);
                    fullPerm(str, i + 1);
                    str =swap(str, i, j);
                }
                return;
            }
        }
        public int next(int num){
            String str = String.valueOf(num);
            fullPerm(str, 0);
            int ans = -1;
            for (String res : set){
                if (Integer.parseInt(res) > num){
                    ans = Integer.parseInt(res);
                    break;
                }
            }
            return ans;
        }
}
