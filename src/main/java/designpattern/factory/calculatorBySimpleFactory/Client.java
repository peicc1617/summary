package designpattern.factory.calculatorBySimpleFactory;

/**
 * @基本功能:客户端
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 15:34:50
 **/
public class Client {
    public static void main(String[] args) {
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.createOperation("+");
        operation.setNumA(1);
        operation.setNumB(2);
        System.out.println(operation.getResult());
    }
}
