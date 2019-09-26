package designpattern.factory.calculateByFactoryMethod;


/**
 * @基本功能:除法运算
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 15:50:37
 **/
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        return getNumA()/getNumB();
    }
}
