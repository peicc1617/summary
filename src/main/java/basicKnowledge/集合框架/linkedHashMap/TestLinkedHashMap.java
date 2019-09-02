package basicKnowledge.集合框架.linkedHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-27 09:12:17
 **/
public class TestLinkedHashMap {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        LinkedHashMap map1=new LinkedHashMap();
        for (int i = 0; i < 5; i++) {
            map.put(i*10+1,i);
            map1.put(i*10+1,i);
        }
        Iterator iterator=map.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Iterator iterator1=map.values().iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        Iterator iterator2=map.entrySet().iterator();
        while (iterator2.hasNext()){
            Map.Entry entry=(Map.Entry)iterator2.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        Iterator iterator3=map1.entrySet().iterator();
        while(iterator3.hasNext()){
            Map.Entry entry=(Map.Entry)iterator3.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
