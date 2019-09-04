package designpattern.adapter;

/**
 * @基本功能:客户端代码
 * @program:summary
 * @author:peicc
 * @create:2019-09-04 11:15:02
 **/
public class Client {
    public static void main(String[] args) {
        Target target=new Adapter();
        target.request();
    }


}
