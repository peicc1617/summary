package designpattern.factory.calculateByFactoryMethod;


/**
 * @基本功能:乘法工厂
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 18:05:19
 **/
public class MultiFactory implements Factory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
