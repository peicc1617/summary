package basicKnowledge.jvm.GC;
/*
*VM args: -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:+UseParNewGC -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=2M
 */
public class TestPretenureSizeThreshold {
    private static int _1MB=1024*1024;

    public static void main(String[] args) {
        byte[] allocation1;
        allocation1=new byte[2* _1MB];


    }
}
