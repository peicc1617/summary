package basicKnowledge.jvm.GC;
//测试对象年龄
public class TestTenuringThreshold {
    private static int _1MB=1024*1024;

    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1=new byte[_1MB/4];
        allocation2=new byte[4*_1MB];
        allocation3=new byte[4*_1MB];//第一次GC
        allocation3=null;
        allocation3=new byte[4*_1MB];//第二次GC


    }
}
