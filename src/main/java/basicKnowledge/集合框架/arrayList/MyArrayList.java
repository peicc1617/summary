package basicKnowledge.集合框架.arrayList;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-18 14:34:39
 **/
//ArrayList的简单实现
public class MyArrayList<AnyType> implements Iterable<AnyType> {
    private Object[] elementData;
    private static final int DEFAULT_CAPACITY=10;
    private int size;
    //无参构造函数
    public MyArrayList(){

    }
    //带List类型参数的构造函数
    public MyArrayList(MyArrayList<AnyType> list){

    }
    //指定初始容量
    public MyArrayList(int initCapacity){
        if(initCapacity>0){
            this.elementData=new Object[initCapacity];
        }else if(initCapacity==0){
            this.elementData=new Object[]{};
        }else{
            throw new IllegalArgumentException("不合法的数组初始容量");
        }
    }
    public int size(){
        return size;
    }
    //增加元素
    public boolean add(AnyType e){
        if(elementData.length==size()){
            //数组扩容
            int oldCapacity=size();
            ensureCapacity(oldCapacity+(oldCapacity>>>1));//扩容为原来的1.5倍.需要注意：<<、>>、>>>的优先级低于+、-
        }
        elementData[size()]=e;//将元素增加至尾部
        size++;//元素数量+1
        return true;
    }
    //查询元素
    public AnyType get(int index){
        return (AnyType) elementData[index];
    }
    //修改元素
    public AnyType set(int index,AnyType newVal){
        AnyType oldValue=(AnyType) elementData[index];
        elementData[index]=newVal;
        return oldValue;
    }
    //删除元素
    public AnyType remove(int index){
        AnyType removeElement=(AnyType) elementData[index];
        //index后面的元素都向前移动一位
        for (int i = index; i <size()-1 ; i++) {
            elementData[i]=elementData[i+1];
        }
        return removeElement;
    }
    //数组扩容
    private void ensureCapacity(int newCapacity){
        if(newCapacity<size()){
            return;
        }
        Object[] newArray=new Object[newCapacity];
        for (int i = 0; i <size(); i++) {
            newArray[i]=elementData[i];
        }
        elementData=newArray;//新数组的引用赋值给旧数组
    }
    //forEach
    public void forEach(Consumer action){
        for(int i=0;i<size();i++){
            action.accept(elementData[i]);
        }
    }
    //实现Iterrable接口的iterator函数

    @Override
    public Iterator<AnyType> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<AnyType>{
        private int current=0;
        @Override
        public boolean hasNext() {
            return current<size();
        }

        @Override
        public AnyType next() {
            if(!hasNext()){
                throw new NoSuchElementException("没有元素");
            }
            return (AnyType) elementData[current++];
        }
    }

    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList(10);
        for(int i=0;i<15;i++){
            myArrayList.add(i);
        }
        System.out.println("当前元素数量为"+myArrayList.size());
        System.out.println("查询元素"+myArrayList.get(0));
        System.out.println("*************forEach循环遍历************");
        myArrayList.forEach(e->{
            System.out.println(e);
        });
        System.out.println("************迭代器循环遍历**********");
        Iterator iterator =myArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println("迭代"+iterator.next());
        }
    }
}
