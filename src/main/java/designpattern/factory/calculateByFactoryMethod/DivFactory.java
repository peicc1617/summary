package designpattern.factory.calculateByFactoryMethod;


/**
 * @基本功能:除法工厂
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 18:05:40
 **/
public class DivFactory implements Factory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
