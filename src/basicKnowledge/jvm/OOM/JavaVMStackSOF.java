package basicKnowledge.jvm.OOM;

/**
 * VM Args:-Xss128k
 * @program:summary
 * @author:peicc
 * @create:2019-07-11 18:59:32
 **/
//1、如何线程请求的栈深度大于虚拟机所允许的最大深度，将抛出StackOverflowError异常；
//如果虚拟机在扩展栈时无法申请到足够内存，则抛出OOM异常
//2、栈容量参数由-Xss来设定
//3、实验表明，单线程时，无论是减小栈内存容量还是增加方法帧中本地变量表的长度，均抛出的是SOF异常
public class JavaVMStackSOF {
    private int stackLength=1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF sof=new JavaVMStackSOF();
        try{
            sof.stackLeak();
        }catch (Throwable e){
            System.out.println("栈的数量为："+sof.stackLength);
            throw e;
        }

    }
}
