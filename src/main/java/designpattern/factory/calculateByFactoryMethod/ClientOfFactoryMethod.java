package designpattern.factory.calculateByFactoryMethod;

/**
 * @基本功能:工厂方法的客户端
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 18:01:26
 **/
public class ClientOfFactoryMethod {
    public static void main(String[] args) {
        //先创建工厂
       Factory addFactory=new AddFactory();
       //根据工厂创建产品
       Operation operationAdd=addFactory.createOperation();
       //使用产品
       operationAdd.setNumA(1);
       operationAdd.setNumB(2);
       System.out.println(operationAdd.getResult());

    }
}
