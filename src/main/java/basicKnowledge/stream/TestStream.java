package basicKnowledge.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @基本功能:测试stream相关函数
 * @program:summary
 * @author:peicc
 * @create:2019-09-27 10:28:21
 **/
public class TestStream {
    public static void main(String[] args) {
        List<String> myList= Arrays.asList("a","b","c","d","e");
        myList.stream()
                .filter(i->i=="a")
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
