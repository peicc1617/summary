package basicKnowledge.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-08-05 14:35:47
 **/
public class Main {
    public static void main(String[] args) throws IOException {
//        testIO();
        testNIO();
    }
    public static void testIO(){
        InputStream in = null;
        try{
            in = new BufferedInputStream(new FileInputStream("F:\\111.txt"));
            byte[] buf = new byte[1024];
            int bytesRead = in.read(buf);
            while(bytesRead != -1) {
                for(int i=0;i<bytesRead;i++)
                    System.out.print((char)buf[i]);
                    bytesRead = in.read(buf);
                }
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                if(in != null){
                    in.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void testNIO(){
        RandomAccessFile aFile=null;
        try{
            aFile=new RandomAccessFile("F:\\111.txt","rw");
            FileChannel fileChannel=aFile.getChannel();
            ByteBuffer buf=ByteBuffer.allocate(1024);
            int byteRead=fileChannel.read(buf);
            System.out.println(byteRead);
            while (byteRead!=-1) {
                buf.flip();
                while (buf.hasRemaining()) {
                    System.out.println((char)buf.get());
                }
                buf.compact();
                buf.mark();
                byteRead=fileChannel.read(buf);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (aFile!=null) {
                try {
                    aFile.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
