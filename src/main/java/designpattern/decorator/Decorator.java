package designpattern.decorator;

/**
 * @基本功能:装饰类
 * @program:summary
 * @author:peicc
 * @create:2019-09-04 09:20:50
 **/
public abstract class Decorator implements Component {
    public designpattern.decorator.Component component;
    public void setComponent(designpattern.decorator.Component component){
        this.component=component;
    }

    @Override
    public void operation() {
        if(component!=null){
            component.operation();
        }
    }
}
