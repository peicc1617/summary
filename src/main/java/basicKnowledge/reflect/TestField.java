package basicKnowledge.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-29 20:51:05
 **/
public class TestField {
    public static void main(String[] args) {
        Class c= Book.class;
        Field[] fields=c.getDeclaredFields();
        System.out.println("属性");
        for (Field field:fields) {
            System.out.println(field.getName());
        }
        Method[] methods=c.getDeclaredMethods();
        System.out.println("方法");
        for (Method method:methods) {
            System.out.println(method.getName());
        }
        System.out.println("注解");
        Annotation[] annotations=c.getAnnotations();
        for (Annotation annotation:annotations) {
            System.out.println(annotation);
        }


    }
}
