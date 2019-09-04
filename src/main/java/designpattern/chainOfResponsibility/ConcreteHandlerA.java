package designpattern.chainOfResponsibility;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-04 19:56:31
 **/
public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request<5){//当前处理器处理
            System.out.println(this.toString()+"处理器处理");
        }else{//让下一个处理器处理
            successor.handleRequest(request);
        }
    }
}
