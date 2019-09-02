package basicKnowledge.jvm.cmd;

import java.util.ArrayList;
import java.util.List;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-01 16:37:09
 **/
public class JConsole {
    public static void fillHeap(int num) throws InterruptedException {
        List<JConsole> list=new ArrayList<JConsole>();
        for (int i = 0; i <num ; i++) {
            Thread.sleep(50);
            list.add(new JConsole());
        }
        System.gc();
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }
}
