package 常见题型;

import basicKnowledge.集合框架.HashMapTest;

import java.util.HashMap;
import java.util.Scanner;
//
public class Test0816 {
    public static boolean isSiblingString(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        if(len1!=len2){
            return false;
        }
        boolean result=true;
        HashMap<String,Integer> map1=new HashMap<String,Integer>();
        HashMap<String,Integer> map2=new HashMap<String,Integer>();
        for(int i=0;i<str1.length();i++){
            String temp=str1.substring(i,i+1);
            if(!map1.containsKey(temp)){
                map1.put(temp,0);
            }else{
                map1.put(temp,map1.get(temp)+1);
            }
        }
        for(int i=0;i<str2.length();i++){
            String temp=str2.substring(i,i+1);
            if(!map2.containsKey(temp)){
                map2.put(temp,0);
            }else{
                map2.put(temp,map2.get(temp)+1);
            }
        }
        for (int i=0;i<len1;i++){
            String temp=str2.substring(i,i+1);
            if(map1.get(temp)!=map2.get(temp)){
                result=false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.next();
            String str2=sc.next();
            boolean result=isSiblingString(str1,str2);
            System.out.println(result);
        }
    }
}
