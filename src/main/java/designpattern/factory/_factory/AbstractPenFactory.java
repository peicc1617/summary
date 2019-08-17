package designpattern.factory._factory;

import designpattern.factory.simplefactory.Pen;

/**
 * @基本功能:工厂接口
 * @program:summary
 * @author:peicc
 * @create:2019-08-15 17:29:26
 **/
public interface AbstractPenFactory {
    Pen createPen();
}
