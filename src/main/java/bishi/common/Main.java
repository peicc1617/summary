package bishi.common;


import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class Main {
    /***
     * @函数功能：
     * @param: args
     * @return：void
     */
    public static void main(String[] args) {
        ByteBuffer bb=ByteBuffer.wrap(new byte[12]);
        bb.asCharBuffer().put("abcdef");
        System.out.println(Arrays.toString(bb.array()));
        bb.rewind();
        System.out.println(Arrays.toString(bb.array()));
        bb.rewind();
        bb.order(ByteOrder.BIG_ENDIAN);
        System.out.println(ByteOrder.nativeOrder());
        System.out.println(Arrays.toString(bb.array()));
        bb.order(ByteOrder.LITTLE_ENDIAN);
        bb.order(ByteOrder.BIG_ENDIAN);
        System.out.println(ByteOrder.nativeOrder());
        System.out.println(ByteOrder.nativeOrder());
        System.out.println(Arrays.toString(bb.array()));
    }

}