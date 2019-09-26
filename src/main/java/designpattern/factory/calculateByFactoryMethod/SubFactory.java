package designpattern.factory.calculateByFactoryMethod;


/**
 * @基本功能:减法工厂
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 18:04:36
 **/
public class SubFactory implements Factory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
