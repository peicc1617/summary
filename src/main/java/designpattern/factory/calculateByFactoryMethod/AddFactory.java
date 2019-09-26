package designpattern.factory.calculateByFactoryMethod;

/**
 * @基本功能:加法工厂
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 18:04:02
 **/
public class AddFactory implements Factory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
