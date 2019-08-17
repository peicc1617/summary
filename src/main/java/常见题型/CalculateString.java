package 常见题型;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-12 14:54:23
 **/
public class CalculateString {
    static ScriptEngine jse=new ScriptEngineManager().getEngineByName("JavaScript");

    public static void main(String[] args) throws ScriptException {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            System.out.println(jse.eval(str));
        }

    }
}
