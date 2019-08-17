package basicKnowledge.集合框架;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-16 09:33:32
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 10);
        map.put(2, 20);

        // Iterating entries using a For Each loop
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

    }
}
