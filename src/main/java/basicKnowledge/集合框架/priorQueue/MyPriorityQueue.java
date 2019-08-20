package basicKnowledge.集合框架.priorQueue;

import basicKnowledge.集合框架.queue.MyListQueue;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Any;
import jdk.nashorn.internal.runtime.regexp.joni.ast.AnyCharNode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/**
 * @基本功能:手写一个优先队列（实现一个二叉堆）
 * @program:summary
 * @author:peicc
 * @create:2019-08-19 12:53:46
 **/
public class MyPriorityQueue<AnyType> {
    private static final int DEFAULT_INIT_CAPACITY=11;//默认的初始化容量
    private Object[] queue;//存储优先队列的元素
    private int size;//堆中当前元素的数量
    private Comparator<? super AnyType> comparator;//比较器
    /************构造函数****************/
    //无参构造函数
    MyPriorityQueue(){
        this(DEFAULT_INIT_CAPACITY,null);
    }
    //Collection集合参数
    MyPriorityQueue(Collection<? extends AnyType> c){

    }
    //带比较器的构造函数
    MyPriorityQueue(Comparator<? super AnyType> comparator){
        this(DEFAULT_INIT_CAPACITY,comparator);
    }
    //初始化队列容量
    MyPriorityQueue(int capacity){
        this(capacity,null);
    }
    //带比较器和初始化容量的构造参数
    MyPriorityQueue(int num,Comparator<? super AnyType> comparator){
        if(num<1){
            throw new IllegalArgumentException("初始化容量不能小于1");
        }
        this.queue=new Object[num];
        this.comparator=comparator;
    }
    public boolean add(AnyType e){
        if(e==null){
            throw new NullPointerException("元素不能为空");
        }
        int i=size;//获取当前队列元素个数
        if(i>=queue.length){
            //扩容
            grow(i+1);
        }
        size=size+1;
        if(i==0){
            queue[0]=e;
        }else{
            siftUp(i,e);
        }
        return true;
    }
    //扩容
    private void grow(int minCapacity){
        int oldCapacity=queue.length;
        int newCapacity=oldCapacity+((oldCapacity<64)?(oldCapacity+2):(oldCapacity>>1));
        queue= Arrays.copyOf(queue,newCapacity);//数组拷贝
    }
    //向上调整
    private void siftUp(int i,AnyType e){
        if(comparator==null){
            siftUpComparable(i,e);
        }else{
            siftUpUsingComparator(i,e);
        }
    }
    //不使用指定比较器
    //调整使其满足最小堆
    private void siftUpComparable(int k, AnyType x) {
        Comparable<? super AnyType> key=(Comparable<? super AnyType>) x;
        while(k>0){
            int parent=(k-1)>>>1;//父节点索引位置
            Object e=queue[parent];
            if(key.compareTo((AnyType) e)>=0){
                break;
            }
            queue[k]=queue[parent];//父节点下移
            k=parent;
        }
        queue[k]=key;
    }
    //使用指定比较器
    private void siftUpUsingComparator(int k, AnyType x) {

    }
    //出列最小元素:不删除
    public AnyType peek(){
        return (size==0)?null:(AnyType) queue[0];
    }
    //出列并删除最小元素
    public AnyType poll(){
        if(size==0){
            return null;
        }
        int tail=--size;//获取队尾元素索引
        AnyType result=(AnyType) queue[0];//返回结果
        AnyType x=(AnyType)queue[tail];
        queue[tail]=null;
        if(tail!=0){
            siftDown(0,x);
        }
        return result;
    }
    //向下调整
    private void siftDown(int k,AnyType x){
        if (comparator != null)
            siftDownUsingComparator(k, x);
        else
            siftDownComparable(k, x);
    }
    private void siftDownComparable(int k, AnyType x) {
        Comparable<? super AnyType> key=(Comparable<? super AnyType>)x;
        int half=size>>>1;//循环直到最后一个非叶子结点
        while(k<half){
            int child=(k<<1)+1;//左孩子节点索引
            int right=child+1;//右孩子节点索引
            Object temp=queue[child];
            if(right<size&&((Comparable<? super AnyType> )temp).compareTo((AnyType)queue[right])>0){
                temp=queue[child=right];
            }
            if(key.compareTo((AnyType) temp)<=0){//队尾元素小于孩子结点，直接返回
                break;
            }
            queue[k]=temp;//孩子结点上移
            k=child;
        }
        queue[k]=key;
    }
    private void siftDownUsingComparator(int k, AnyType x) {

    }
    public int size(){
        return size;
    }

}
