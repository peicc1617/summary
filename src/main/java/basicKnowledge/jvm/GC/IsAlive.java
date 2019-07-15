package basicKnowledge.jvm.GC;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-15 16:50:15
 **/
//引用计数法判断对象是否存活
public class IsAlive {
    private Object instance=null;
    private static final int  _1MB=1024*1024;
    private byte[]bigsize=new byte[2*_1MB];
    public static void main(String[] args) {
        IsAlive objectA=new IsAlive();
        IsAlive objectB=new IsAlive();
        objectA.instance=objectB;//相互引用
        objectB.instance=objectA;//相互引用
        objectA=null;
        objectB=null;
        System.gc();
    }
}
