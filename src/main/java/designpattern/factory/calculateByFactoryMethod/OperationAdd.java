package designpattern.factory.calculateByFactoryMethod;

/**
 * @基本功能:加法运算
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 15:26:34
 **/
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumA()+getNumB();
    }
}
