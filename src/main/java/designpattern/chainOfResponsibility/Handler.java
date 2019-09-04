package designpattern.chainOfResponsibility;

/**
 * @基本功能:处理请求的接口
 * @program:summary
 * @author:peicc
 * @create:2019-09-04 19:49:07
 **/
public abstract class Handler {
    //下一个处理器的引用
    Handler successor;
    //给下一个处理器赋值
    public void setSuccessor(Handler successor){
        this.successor=successor;
    }
    //请求处理方法
    public abstract void handleRequest(int request);
}
