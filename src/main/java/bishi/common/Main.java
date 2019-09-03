package bishi.common;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numNodes=sc.nextInt();
        int sourceNode=sc.nextInt();
        int groups=sc.nextInt();
        ArrayList<ArrayList<Integer>> network=new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <groups ; i++) {
            ArrayList<Integer> list=new ArrayList<>();
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            network.add(list);
        }
        int res=calculateMaxOil(numNodes,sourceNode,network);
        System.out.println(res);
    }
    public static int calculateMaxOil(int numNodes,int sourceNode,ArrayList<ArrayList<Integer>> network){
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i <network.size() ; i++) {
            ArrayList<Integer> list=network.get(i);
            for (int j = 0; j <3 ; j++) {
                int a=list.get(0);
                int b=list.get(1);
                int c=list.get(2);
                if(a==sourceNode){
                    map.put(b,c);
                    set.add(b);
                }else{
                    if(map.containsKey(a)){
                        int temp=map.get(a);
                        if(temp<c){
                            map.put(a,temp);
                        }else{
                            map.put(a,c);
                        }

                    }
                }
            }
        }
        Iterator iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> entry=(Map.Entry<Integer,Integer>)iterator.next();
            int key=entry.getKey();
            int value=entry.getValue();
            if(set.contains(key)){
                res+=value;
            }
        }
        return res;
    }
}
