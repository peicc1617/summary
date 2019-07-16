package basicKnowledge.深浅拷贝;

import java.util.HashMap;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-16 18:41:34
 **/
public class MapCloneTest {
    public static void main(String[] args) {
        Student zhangsan=new Student("zhangsan","男",25);
        HashMap<Integer,Student> map=new HashMap<Integer, Student>();
        map.put(1,zhangsan);
        HashMap<Integer,Student> cloneMap=(HashMap<Integer, Student>) map.clone();
        System.out.println("************不做改变*************");
        System.out.println("未改变之前,     map的值:"+map.toString());
        System.out.println("未改变之前,cloneMap的值:"+cloneMap.toString());
        System.out.println("map和cloneMap是否指向同一内存地址:"+(map==cloneMap));
        System.out.println("map和cloneMap中存储的student是否指向同一内存地址:"+(map.get(1)==cloneMap.get(1)));
        //对cloneMap中的值进行改变，看是否能影响到map
        Student cloneLisi = (Student) cloneMap.get(1);
        cloneLisi.setSex("女");
        System.out.println("*************************对map中的值做出修改****************************");
        System.out.println("改变之后,cloneMap的值:"+cloneMap.toString());
        System.out.println("改变之后,     map的值:"+map.toString());

        System.out.println("*************************对map新增**********************************");
        Student lisi = new Student("lisi","男",18);
        map.put(2, lisi);
        System.out.println("改变之后,cloneMap的值:"+cloneMap.toString());
        System.out.println("改变之后,     map的值:"+map.toString());
    }
}
/*
 *从HashMap的克隆方法可以看出这样的几点
1.HashMap的clone方法生成新的对象，新的对象有自己独立的存储空间。

2.虽然HashMap的clone方法生成了新的对象，但新的HashMap和原来的HashMap所存储的引用类型都是指向的同一存储空间。

3.新生成的HashMap中的数组属性table是开辟了新的空间的，只是table中的存储的值所指向的内存空间和原来的是一样的。这和我理解的浅拷贝的有点不一样。我理解的浅拷贝认为是对象中的引用属性指向的是同一内存地址，但HashMap中的table数组却不是指向同一地址，而是table里面的值指向同一地址。
 */
