package leetcode.sort;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.*;

/**
 * @基本功能:根据字符出现频率排序
 * @program:summary
 * @author:peicc
 * @create:2019-08-22 09:28:40
 **/
public class SortByFrequency {
    public static String sortByFrequency(String str){
        StringBuilder sb=new StringBuilder();
        String[] temp=str.split(" ");
        LinkedHashMap<String,Integer> map=new LinkedHashMap();
        for(int i=0;i<temp.length;i++){
            if (map.containsKey(temp[i])){
                map.put(temp[i],map.get(temp[i])+1);
            }else{
                map.put(temp[i],1);
            }
        }
        ArrayList<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //降序排序，升序的话o1-o2
                return o2.getValue()-o1.getValue();
            }
        });
        for (Map.Entry<String,Integer> map1:list) {
            for (int i = 0; i <map1.getValue() ; i++) {
                sb.append(map1.getKey()+" ");
            }
        }
        return  sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result=sortByFrequency(str);
        System.out.println(result);
    }
}
