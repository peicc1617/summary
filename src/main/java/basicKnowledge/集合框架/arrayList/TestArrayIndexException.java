package basicKnowledge.集合框架.arrayList;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-19 15:41:45
 **/
//测试通过异常设置断点
public class TestArrayIndexException {
    public static void main(String[] args) {
        int[] array=new int[10];
        for (int i = 0; i <11 ; i++) {
            array[i]=i;
        }
    }
}
