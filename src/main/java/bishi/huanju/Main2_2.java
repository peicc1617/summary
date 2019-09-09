package bishi.huanju;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-09 18:43:26
 **/
public class Main2_2 {

        private static TreeSet<String> set = new TreeSet();
        private static String swap(String str, int i, int j){
            // toCharArray()变成字符数组后进行交换
            char s[] = str.toCharArray();
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            return String.valueOf(s);
        }
        private static void fullPerm(String str, int i){
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
        public static String next(String str1){
            String str = str1;
            fullPerm(str, 0);
            for (String res : set){
                if(res.compareTo(str1)>0){
                    return res;
                }
            }
            return set.first();
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            set = new TreeSet();
            StringBuilder sb=new StringBuilder();
            String[] arr=sc.nextLine().split(",");
            for (int i = 0; i <arr.length ; i++) {
                sb.append(arr[i]);
            }
            String result=next(sb.toString());
            StringBuilder sb1=new StringBuilder();
            sb1.append(result.charAt(0));
            for (int i = 1; i <result.length() ; i++) {
                sb1.append(",").append(result.charAt(i));
            }
            System.out.println(sb1.toString());

        }
    }
}
