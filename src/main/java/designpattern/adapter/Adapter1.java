package designpattern.adapter;

/**
 * @基本功能:适配器
 * @program:summary
 * @author:peicc
 * @create:2019-09-04 15:06:27
 **/
public class Adapter1 extends Adaptee1 implements Target1 {
    @Override
    public void request() {
        super.specificRequest();
    }
}
