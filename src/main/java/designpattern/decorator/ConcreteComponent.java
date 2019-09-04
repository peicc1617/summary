package designpattern.decorator;

/**
 * @基本功能:要被装饰的具体对象
 * @program:summary
 * @author:peicc
 * @create:2019-09-04 09:19:38
 **/
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
