package basicKnowledge.集合框架.linkedHashMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-27 09:29:21
 **/
public class TestLinkedHashSet {
    public static void main(String[] args) {
        HashSet set=new HashSet();
        set.add("bbb");
        set.add("aaa");
        set.add("ccc");
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
