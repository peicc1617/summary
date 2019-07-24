package basicKnowledge.集合框架.queue;

/**
 * @基本功能:利用数组实现一个循环队列
 * @program:summary
 * @author:peicc
 * @create:2019-07-24 10:11:06
 **/
public class MyArrayQueue<E> {
    private int size;//队列元素个数
    private int length;//数组实际长度
    private int font;//指向队头
    private int rear;//指向队尾
    private Object[] element;//存储队列元素
    private final int DEFAULT_SIZE=10;
    //无参构造函数
    MyArrayQueue(){
        this.element=new Object[DEFAULT_SIZE];
        this.font=0;
        this.rear=0;
        this.length=DEFAULT_SIZE;
    }
    //MyArrayQueue类型的构造函数,实现队列初始化
    MyArrayQueue(MyArrayQueue<? extends E> c){
        //自己去实现
    }
    //返回元素的个数
    public int getSize(){
        return (rear-font+length)%length;
    }
    //入队
    public boolean enQueue(E e){
        //首先判断队列是否已满
        if((rear+1)%length==font){
            return false;
        }
        element[rear]=e;//元素置于队尾
        rear=(rear+1)%length;//rear后移一位,若到末尾则转移到数组头部
        return true;
    }
    //出队，获取并移除队列头部元素
    public E deQueue(){
        //首先判断队列是否为空
        if(font==rear){
            return null;
        }
        E ele=(E)element[font];
        font=(font+1)%length;//rear后移一位,若到末尾则转移到数组头部
        return ele;
    }
    //获取队列头部元素，但不删除
    public E getFirst(){
        if(font==rear){
            return null;
        }
        return (E)element[font];
    }
    //队列是否为空
    public boolean isEmpty(){
        return font==rear?true:false;
    }

    public static void main(String[] args) {
        MyArrayQueue<Integer> myArrayQueue=new MyArrayQueue<Integer>();
        for(int i=0;i<10;i++){
            myArrayQueue.enQueue(i);
        }
        System.out.println();
        System.out.println("队列元素的个数为："+myArrayQueue.getSize());
        System.out.println("********打印输出********");
        while(!myArrayQueue.isEmpty()){
            System.out.print(myArrayQueue.deQueue()+" ");
        }
    }


}
