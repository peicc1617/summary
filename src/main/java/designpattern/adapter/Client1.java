package designpattern.adapter;

/**
 * @基本功能:客户端
 * @program:summary
 * @author:peicc
 * @create:2019-09-04 15:10:24
 **/
public class Client1 {
    public static void main(String[] args) {
        Target1 target1=new Adapter1();
        target1.request();
    }
}
