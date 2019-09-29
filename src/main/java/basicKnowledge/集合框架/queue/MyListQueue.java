package basicKnowledge.集合框架.queue;

/**
 * @基本功能:利用链表实现队列
 * @program:summary
 * @author:peicc
 * @create:2019-07-24 10:59:06
 **/
public class MyListQueue<E> {
    Node<E> font;//指向队头
    Node<E> rear;//指向队尾
    private static class Node<E>{
        E item;
        Node<E> next;//指向下一个节点
        Node(E ele){
            this.item=ele;
            this.next=null;
        }
    }
    //入队
    public void enQueue(E e){
        Node<E> newNode=new Node(e);
        if(font==null){//如果链表为空
            font=newNode;
            rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    //出队
    public E deQueue(){
        if(font==null){
            return null;
        }
        Node<E> node=font;
        node.next=null;//断开连接
        font=font.next;
        return node.item;
    }

    public static void main(String[] args) {
        MyListQueue myListQueue=new MyListQueue();
        for(int i=0;i<100;i++){
            myListQueue.enQueue(i);
        }
        System.out.println("*********** 输出队列元素**********");
        while(myListQueue.font!=null){
            System.out.print(myListQueue.deQueue());
        }
    }
}
