package basicKnowledge.集合框架;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-16 19:18:53
 **/
public class HashMapTest {
    public static void main(String[] args) {
        HashMapAPITest();
    }
    private static void  HashMapAPITest(){
        Random r=new Random();
        HashMap map=new HashMap();
        map.put("one",r.nextInt(10));
        map.put("two",r.nextInt(10));
        map.put("three",r.nextInt(10));
        map.put("four",r.nextInt(10));
        map.put("five",r.nextInt(10));
        //打印出map
        System.out.println("打印出map:"+map.toString());
        //遍历map
        //方式1：遍历键值对
        System.out.println("*******遍历键值对*********");
        Iterator iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
            System.out.println("键值对为："+entry.getKey()+"-"+entry.getValue());
        }
        //方式2：遍历键集合
        System.out.println("*******遍历键*********");
        Iterator iterator1=map.keySet().iterator();
        while(iterator1.hasNext()){
            String key=(String)iterator1.next();
            System.out.println("键"+key+"对应的值为："+map.get(key));
        }
        //方式3：遍历值集合
        System.out.println("*******遍历值***********");
        Iterator iterator2=map.values().iterator();
        while(iterator2.hasNext()){
            System.out.println("值为："+iterator2.next());
        }
    }
}
