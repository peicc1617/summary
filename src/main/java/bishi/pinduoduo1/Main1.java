package bishi.pinduoduo1;

import java.util.*;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-12-05 18:47:56
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
        for (int i=0;i<2*n;i++) {
            int temp=sc.nextInt();
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }
        ArrayList<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                //降序排序，升序的话o1-o2
                return o1.getValue()-o2.getValue();
            }
        });
        int min=100;
        int max=-100;
        for (Map.Entry<Integer,Integer> map1:list) {
            int key=map1.getKey();
            int value=map1.getValue();
            if (value>=k){
                if(key<min){
                    min=key;
                }
                if (key>max) {
                    max=key;
                }
            }
        }
        if (min==100||max==100){
            System.out.println("error");
        }else{
            System.out.println(min+" "+max);
        }

    }
}
