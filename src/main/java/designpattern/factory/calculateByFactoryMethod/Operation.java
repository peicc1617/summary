package designpattern.factory.calculateByFactoryMethod;

/**
 * @基本功能:运算类，四则运算均需继承此类
 * @program:summary
 * @author:peicc
 * @create:2019-09-26 15:23:20
 **/
public abstract class Operation {
    private double numA;
    private double numB;

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }
    public abstract double getResult();
}
