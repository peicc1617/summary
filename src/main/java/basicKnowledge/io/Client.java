package basicKnowledge.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2020-02-05 13:53:33
 **/
public class Client {
    public static void main(String[] args) {
        System.out.println("客户端");
        ByteBuffer buf=ByteBuffer.allocate(1024);
        SocketChannel socketChannel=null;
        try {
            socketChannel=SocketChannel.open();
            socketChannel.configureBlocking(false);
            socketChannel.connect(new InetSocketAddress("127.1.0.1",8000));
            if (socketChannel.finishConnect()) {
                int i=0;
                int j=20;
                while (j-->0) {
                    TimeUnit.SECONDS.sleep(1);
                    String info = "I'm "+i+++"-th information from client";
                    buf.clear();
                    buf.put(info.getBytes());
                    buf.flip();
                    while (buf.hasRemaining()) {
                        System.out.println(buf);
                        socketChannel.write(buf);
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if (socketChannel!=null) {
                try {
                    socketChannel.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
