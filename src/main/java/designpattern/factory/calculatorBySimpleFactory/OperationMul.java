package designpattern.factory.calculatorBySimpleFactory;

/**
 * @基本功能:乘法运算
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 15:49:59
 **/
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getNumA()*getNumB();
    }
}
