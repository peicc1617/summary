package designpattern.factory.calculatorBySimpleFactory;

/**
 * @基本功能:减法运算
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 15:28:33
 **/
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumA()-getNumB();
    }
}
