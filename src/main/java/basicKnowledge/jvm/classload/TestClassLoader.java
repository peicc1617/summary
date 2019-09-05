package basicKnowledge.jvm.classload;
import java.io.IOException;
import java.io.InputStream;

/**
 * @基本功能:自定义类加载器
 * @program:summary
 * @author:peicc
 * @create:2019-08-13 10:57:04
 **/
public class TestClassLoader {
    public static void main(java.lang.String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader myLoader=new ClassLoader() {
            @Override
            public Class<?> loadClass(java.lang.String name) throws ClassNotFoundException {
                java.lang.String fileName=name.substring(name.lastIndexOf(".")+1)+".class";
                InputStream is=getClass().getResourceAsStream(fileName);
                if(is==null){
                    return super.loadClass(name);
                }
                try {
                    byte[] b=new byte[is.available()];
                    is.read(b);
                    return defineClass(name,b,0,b.length);
                }
                catch (IOException e) {
                   throw new ClassNotFoundException(name);
                }
            }
        };
        //利用自定义的类加载器加载该类
        Class clas=myLoader.loadClass("basicKnowledge.jvm.classload.TestClassLoader");
        //通过该类实例化对象
        Object obj=clas.newInstance();
        //输出该对象所属的类
        System.out.println(obj.getClass());
        //判断该对象是否由basicKnowledge.jvm.classload.TestClassLoader类实例化而来
        System.out.println(obj instanceof TestClassLoader);
        //输出该对象所属的类的类加载器
        System.out.println(obj.getClass().getClassLoader());
        //输出basicKnowledge.jvm.classload.TestClassLoader类的类加载器
        System.out.println(basicKnowledge.jvm.classload.TestClassLoader.class.getClassLoader());
    }
}
