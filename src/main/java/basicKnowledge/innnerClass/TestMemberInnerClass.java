package basicKnowledge.innnerClass;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-22 14:55:11
 **/
public class TestMemberInnerClass {
}
class Outter{
    private Inner inner=null;
    public Outter(){
        System.out.println("外部类构造函数");
    }
    public Inner getInstance(){
        if(inner==null){
            inner=new Inner();
        }
        return inner;
    }
    class Inner{
        public Inner(){

        }
    }
}