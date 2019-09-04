package designpattern.adapter;

/**
 * @基本功能:适配器，把源接口转换成目标接口
 * @program:summary
 * @author:peicc
 * @create:2019-09-04 11:13:42
 **/
public class Adapter implements Target {
    private Adaptee adaptee=new Adaptee();//关联待适配对象
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
