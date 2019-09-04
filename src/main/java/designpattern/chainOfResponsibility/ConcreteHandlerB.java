package designpattern.chainOfResponsibility;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-04 20:01:20
 **/
public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request>5&&request<10){
            System.out.println(this.toString()+"处理器处理");
        }else{
            successor.handleRequest(request);
        }
    }
}
