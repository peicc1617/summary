package bishi.meituan;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-16 14:54:50
 **/
public class Main3_1 {
    public static int age;
    public static void main(String[] args) {
        Main3_1.age++;
        Main3_1 main3_1=new Main3_1();
        main3_1.up();;
        Main3_1 main3_11=new Main3_1();
        main3_11.age=10;
        System.out.println(age+","+main3_1.age);

    }
    public void up(){
        age++;
    }
}
