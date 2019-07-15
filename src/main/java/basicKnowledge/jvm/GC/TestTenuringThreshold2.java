package basicKnowledge.jvm.GC;
//如果在survivor空间中相同年龄放入所有对象大小的总和大于survivor空间的一半，大于或等于该年龄
//的对象就可以直接进入老年代，不必要求对象年龄一定达到阈值
public class TestTenuringThreshold2 {
    private static int _1MB=1024*1024;

    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4,allocation5;
        allocation1=new byte[_1MB/4];
//        allocation2=new byte[_1MB/4];
        allocation3=new byte[4*_1MB];
        allocation4=new byte[4*_1MB];//此时发生第一次垃圾回收，GC期间发现allocation3无法放入
                                    //survivor空间，通过分配担保机制提前转移至老年代。此时allocation4
                                    //分配到Eden区
//        allocation4=null;
        allocation5=new byte[4*_1MB];//此时发生第二次GC,GC期间allocation4通过分配担保机制进入老年代
                                    //allocation1通过对象年龄标记进入老年代，allocation5进入Eden区



    }
}
