package basicKnowledge.集合框架.linkedList;

import basicKnowledge.集合框架.arrayList.MyArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-22 15:43:31
 **/
public class MyLinkedList<E> implements Iterable{
    //链表元素数量
    public int size;
    //链表修改次数
    private int modCount;
    //链表第一个元素
    Node<E> first;
    //链表最后一个元素
    Node<E> last;
    /*结点结构:静态内部类*/
    private static class Node<E>{
        E item;
        Node<E> next;
        Node<E> prev;
        Node(Node<E> prev,E element,Node<E> next){
            this.item=element;
            this.next=next;
            this.prev=prev;
        }
    }
    /*构造函数*/
    //无参构造函数
    public MyLinkedList(){
    }
    //Collection类型参数的构造函数，可以利用参数列表对该列表进行初始化
    public MyLinkedList(Collection<? extends E> c){

    }
    /*主要API*/
    /*
     *links e as first element
     */
    private void linkFirst(E e){
        Node<E> nextElement=first;//获取链表第一个元素,作为新节点的后继元素
        Node<E> newNode=new Node<E>(null,e,nextElement);
        first=newNode;
        if(nextElement==null){//如果原链表为空
            last=newNode;
        }else{
            nextElement.prev=newNode;
        }
        size++;//链表数量加1
        modCount++;//修改次数加1
    }
    /*
     *links e as last element
     */
    private void linkLast(E e){
        Node<E> prevElement=last;//获取链表最后一个元素,作为新节点的前驱元素
        Node<E> newNode=new Node<E>(prevElement,e,null);
        last=newNode;
        if(prevElement==null){//如果原链表为空
            first=newNode;
        }else{
            prevElement.next=newNode;
        }
        size++;//链表数量加1
        modCount++;//修改次数加1
    }
    /*返回指定位置的结点*/
    private Node<E> node(int index){
        if(index<(size>>1)){
            Node<E> node=first;
            for(int i=0;i<index;i++){
                node=node.next;
            }
            return node;
        }else{
            Node<E> node=last;
            for(int i=size-1;i>index;i--){
                node=node.prev;
            }
            return node;
        }
    }
    /**
     * @Param: [index]
     * @return:
     * @Date: 2019/7/22
     */
    public Node<E> get(int index){
        return node(index);
    }
  /** 
   * @Param: [index, value] 
   * @return: E 
   * @Date: 2019/7/22 
   */ 
    public E set(int index,E value){
        Node<E> x=node(index);
        E oldValue=x.item;
        x.item=value;
        return oldValue;
    }
   /**
    * @功能：给定借点钱插入元素
    * @Param: [e, node]
    * @return: void
    * @Date: 2019/7/22
    */
    private void linkBefore(E e,Node<E> node){
        //获取当前结点的前驱结点
        Node<E> prev=node.prev;
        //根据插入元素构造新节点
        Node<E> newNode=new Node<E>(prev,e,node);
        //当前结点为新节点的后继结点
        node.prev=newNode;
        if(prev==null){
            first=newNode;
        }else{
            prev.next=newNode;
        }
        size++;
        modCount++;
    }
    /**
     * @功能：指定位置插入元素
     * @Param: [index, e]
     * @return: void
     * @Date: 2019/7/22
     */
    public void add(int index,E e){
        if(index==size){
            linkLast(e);
        }else{
            linkBefore(e,node(index));
        }
    }
    /**
     * @功能：链表末尾增加元素
     * @Param: [e]
     * @return: void
     * @Date: 2019/7/22
     */
    public void add(E e){
        linkLast(e);
    }
    /**
     * @功能：删除给定结点
     * @Param: [x]
     * @return: E
     * @Date: 2019/7/22
     */
    private E unlink(Node<E> x){
        E val=x.item;
        Node<E> prev=x.prev;
        Node<E> next=x.next;
        if(prev==null){//说明该结点是头结点
            first=next;//头结点后移一位
        }else{
            prev.next=next;
            x.prev=null;
        }
        if(next==null){
            last=prev;
        }else{
            next.prev=prev;
            x.next=null;
        }
        x.item=null;
        size--;
        modCount++;
        return val;
    }
    /**
     * @功能：删除指定位置的结点
     * @Param: [index]
     * @return: E
     * @Date: 2019/7/22
     */
    public E remove(int index){
        return unlink(node(index));
    }
    /**
     * @功能：删除给定元素
     * @Param: [o]
     * @return: boolean
     * @Date: 2019/7/22
     */
    public boolean remove(Object o){
        if(o==null){
            for(Node<E> x=first;x!=null;x=x.next){
                if(x.item==null){
                    unlink(x);
                    return true;
                }
            }
        }else{
            for (Node<E> x=first; x!=null; x=x.next) {
                if(x.item.equals(o)){
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }
    private class LinkedListIterator implements ListIterator<E>{
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public E previous() {
            return null;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(E e) {

        }

        @Override
        public void add(E e) {

        }
    }
}
