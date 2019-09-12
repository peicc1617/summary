package bishi.kedaxunfei;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-12 10:27:06
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(getResult(str));
    }
    public static String getResult(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char temp=str.charAt(i);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }
        StringBuilder sb=new StringBuilder();
        Iterator iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Character,Integer> entry=(Map.Entry<Character,Integer>)iterator.next();
            char key=entry.getKey();
            int value=entry.getValue();
            sb.append(value).append(key);
        }
        return  sb.toString();

    }
}
