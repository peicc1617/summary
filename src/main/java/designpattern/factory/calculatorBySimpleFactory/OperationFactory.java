package designpattern.factory.calculatorBySimpleFactory;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 15:29:27
 **/
public class OperationFactory {
    public Operation createOperation(String operator){
        switch (operator){
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
            case "*":
                return new OperationMul();
            case "/":
                return new OperationDiv();
            default:
                return null;
        }
    }
}
