package designpattern.chainOfResponsibility;

import java.util.Scanner;

/**
 * @基本功能:客户端
 * @program:summary
 * @author:peicc
 * @create:2019-09-04 20:03:19
 **/
public class Client {
    public static void main(String[] args) {
        Handler hA=new ConcreteHandlerA();
        Handler hB=new ConcreteHandlerB();
        Handler hC=new ConcreteHandlerC();
        hA.setSuccessor(hB);
        hB.setSuccessor(hC);
        //模拟请求
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int request=sc.nextInt();
            hA.handleRequest(request);
        }

    }
}
