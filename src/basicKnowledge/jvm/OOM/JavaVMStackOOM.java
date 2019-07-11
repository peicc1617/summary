package basicKnowledge.jvm.OOM;

/**
 * VM Args:Xss2M
 * @program:summary
 * @author:peicc
 * @create:2019-07-11 19:25:55
 **/
//虚拟机栈产生SOF异常
//创建多线程来产生OOM异常：操作系统分配给每个进程的内存是有限的。例如32位的操作系统的限制为2GB,
//虚拟机体用了参数来控制Java堆和方法区这两部分内存的最大值。剩余的内存为2GB-Xmx(Java堆最大容量)，
//再减去MaxPermSize(最大方法区容量)，被虚拟机栈和本地方法栈瓜分。每个线程分配的栈容量越大，可以
//建立的线程数量就越少，建立线程时就容易把剩下的内存耗尽
public class JavaVMStackOOM {
    private void donstop(){
        while(true){

        }
    }
    public void stackLeakByThread(){
        while (true){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    donstop();
                }
            });
            thread.start();
        }
    }
    //执行有风险，请注意保存相关文件
    public static void main(String[] args) {
        JavaVMStackOOM oom=new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
