package basicKnowledge.io;

import java.io.File;
import java.io.IOException;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-05 14:35:47
 **/
public class Main {
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\","abc.txt");
        file.createNewFile();
        System.out.println(file.getName());
    }
}
