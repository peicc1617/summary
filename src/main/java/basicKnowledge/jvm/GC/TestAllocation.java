package basicKnowledge.jvm.GC;
/*
*VM args:-Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
* -Xms:Java堆最小内存
* -Xmx:Java堆最大内存
* -Xmn:新生代内存大小
* -XX:+PrintGCDetails 发生垃圾回收时打印日志
* -XX:SurvivorRatio=8 Eden区与survivor的比例
 */
public class TestAllocation {
    private static int _1MB=1024*1024;

    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1=new byte[2*_1MB];
        allocation2=new byte[2*_1MB];
        allocation3=new byte[2*_1MB];
        allocation4=new byte[4*_1MB];

    }
}
