package bishi.sougou;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        ArrayList<String> rule=new ArrayList<>();
        //读取规则
        for (int i = 0; i <N ; i++) {
            String str=sc.next();
            if(str.charAt(0)=='*'){//*号开头需要处理下
                StringBuilder sb=new StringBuilder("\\S");
                sb.append(str);
                rule.add(sb.toString());
            }else{
                rule.add(str);
            }

        }
        int[] res=new int[M];
        for (int i = 0; i <M ; i++) {
            String str=sc.next();
            for (int j = 0; j <rule.size() ; j++) {//判断是否符合其中一条规则
                Pattern pattern=Pattern.compile(rule.get(j));
                Matcher matcher=pattern.matcher(str);
                if(matcher.matches()){
                    res[i]=1;
                    break;
                }
            }
        }
        //输出
        for (int i = 0; i <M ; i++) {
            if(i==0){
                System.out.print(res[i]);;
            }else{
                System.out.print(" "+res[i]);;
            }
        }
    }
}
