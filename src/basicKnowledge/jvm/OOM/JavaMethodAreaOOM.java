package basicKnowledge.jvm.OOM;

/**
 * VM args:-XX:permSize=10M -XX:MaxPermSize=10M
 * @program:summary
 * @author:peicc
 * @create:2019-07-11 20:04:36
 **/
//基本思路是运行时产生大量的类去填满方法区
public class JavaMethodAreaOOM {
    static class OOMObject{

    }

    public static void main(String[] args) {
        while (true){
//            Enhancer
        }
    }
}
