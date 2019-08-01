package basicKnowledge.集合框架.treeset;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Logger;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-01 11:10:16
 **/
public class TestTreeSet {
    public static void main(String[] args) {
        testTreeSetAPIS();
//        testToArray();
    }
    public static void testTreeSetAPIS(){
        TreeSet treeSet=new TreeSet();
        //测试集合的有序性
        treeSet.add("aaa");
        treeSet.add("bbb");
        treeSet.add("eee");
        treeSet.add("ddd");
        treeSet.add("ccc");
        System.out.println("TreeSet:"+treeSet);
        System.out.printf("集合大小为：size:%d\n",treeSet.size());
        System.out.printf("floor bba:%s\n",treeSet.floor("bba"));
        System.out.printf("ceil bba:%s\n",treeSet.ceiling("bba"));
        System.out.printf("lower bba:%s\n",treeSet.lower("bba"));
        System.out.printf("higher bba:%s\n",treeSet.higher("bba"));
        System.out.printf("subSet(aaa, true, ccc, true): %s\n", treeSet.subSet("aaa", true, "ccc", true));
        System.out.printf("subSet(aaa, true, ccc, false): %s\n", treeSet.subSet("aaa", true, "ccc", false));
        System.out.printf("subSet(aaa, false, ccc, true): %s\n", treeSet.subSet("aaa", false, "ccc", true));
        System.out.printf("subSet(aaa, false, ccc, false): %s\n", treeSet.subSet("aaa", false, "ccc", false));
        System.out.printf("headSet(ccc, true): %s\n", treeSet.headSet("ccc", true));
        System.out.printf("headSet(ccc, false): %s\n", treeSet.headSet("ccc", false));
        System.out.printf("tailSet(ccc, true): %s\n", treeSet.tailSet("ccc", true));
        System.out.printf("tailSet(ccc, false): %s\n", treeSet.tailSet("ccc", false));
        System.out.println("remove('ccc')"+treeSet.remove("ccc"));
        System.out.println("remove('cca')"+treeSet.remove("cca"));
        System.out.println("----------转为数组------------");
        String array[]=(String[])treeSet.toArray(new String[5]);
        System.out.println(array.length);
        for(String str:array){
            System.out.printf("for each:%s\n",str);
        }
        System.out.println("---------遍历TreeSet");
        Iterator iterator=treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println("iter:"+iterator.next());
        }
        //删除并返回第一个元素
        System.out.println("--------------删除并返回第一个元素------------");
        String val=(String)treeSet.pollFirst();
        System.out.printf("pollFirst=%s, set=%s\n", val, treeSet);
        //删除并返回最后一个元素
        System.out.println("--------------删除并返回最后一个元素------------");
        val=(String)treeSet.pollLast();
        System.out.printf("pollFirst=%s, set=%s\n", val, treeSet);
    }
    public static void testToArray(){
        TreeSet treeSet=new TreeSet();
        //测试集合的有序性
        treeSet.add("chang");
        treeSet.add("cheng");
        treeSet.add("ge");
        //数组大小等于集合大小
        System.out.println("-------------数组大小等于集合大小------------------");
        String array1[]=(String[])treeSet.toArray(new String[treeSet.size()]);
        System.out.println(array1.length);
        for(String str:array1){
            System.out.printf("for each:%s\n",str);
        }
        //数组大小小于集合大小
        System.out.println("-------------数组大小小于集合大小------------------");
        String array2[]=(String[])treeSet.toArray(new String[0]);
        System.out.println(array2.length);
        for(String str:array2){
            System.out.printf("for each:%s\n",str);
        }
        //数组大小大于集合大小
        System.out.println("-------------数组大小大于集合大小------------------");
        String array3[]=(String[])treeSet.toArray(new String[10]);
        System.out.println(array3.length);
        for(String str:array3){
            System.out.printf("for each:%s\n",str);
        }
        long start=System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            String array4[]=(String[])treeSet.toArray(new String[0]);
        }
        long end=System.currentTimeMillis();
        System.out.println("用时："+(end-start));
        start=System.currentTimeMillis();
        for (int i = 0; i <100000; i++) {
            String array5[]=(String[])treeSet.toArray(new String[treeSet.size()]);
        }
        end=System.currentTimeMillis();
        System.out.println("用时："+(end-start));
    }
}
