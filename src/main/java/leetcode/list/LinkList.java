package leetcode.list;

/**
 * @基本功能:手写一个单链表
 * @program:summary
 * @author:peicc
 * @create:2019-08-17 11:45:53
 **/
public class LinkList {
    ListNode head;//头结点
    ListNode last;//尾结点
    private int size;
    /*链表节点*/
    class ListNode{
        int val;//值域
        ListNode  next;//指针域
        //构造函数
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    /*------------------主要API-------------------*/
    /***
     * @函数功能：返回链表元素的大小
     * @param :
     * @return：int
     */
    public int getSize() {
        return size;
    }

    /***
     * @函数功能：向链表中添加元素
     * @param val:
     * @return：void
     */
    public void add(int val){
        if(head==null){//链表为空
            head=new ListNode(val);//添加的结点为当前链表的头结点
            last=head;
        }else{
            last.next=new ListNode(val);//否则，将链表添加到末尾结点
            last=last.next;//current指向新添加的结点
        }
        size++;
    }
    /***
     * @函数功能：指定位置前插入元素
     * @param val:待插入的元素
     * @param index:插入位置
     * @return：void
     */
    public void insert(int val,int index){
        if (size==0&&index==0){//原始链表为空
            //构造一个新节点
            ListNode newNode=new ListNode(val);
            head=newNode;
            last=newNode;
            size++;
            return;
        }else if (index<0||index>=size) {
            throw new ArrayIndexOutOfBoundsException("待插入元素的位置不合法");
        }
        ListNode cur=head;
        ListNode pre=null;//保存上一个被访问的结点
        // 找到待插入元素的位置
        for (int i = 0; i <index ; i++) {
            pre=cur;
            cur=cur.next;
        }
        //根据待插入元素构造一个新的结点
        ListNode newNode=new ListNode(val);
        newNode.next=cur;
        if (pre==null) {//在头结点前插入
            head=newNode;
        }else{
            pre.next=newNode;
        }
        size++;
    }
    /***
     * @函数功能：删除指定位置的结点
     * @param index:
     * @return：int
     */
    public int remove(int index){
        if (index<0||index>=size){
            throw new ArrayIndexOutOfBoundsException("删除元素位置不合法");
        }
        ListNode pre=null;
        ListNode cur=head;
        for (int i = 0; i <index ; i++) {// 找到待删除结点
            pre=cur;
            cur=cur.next;
        }
        int res=cur.val;
        ListNode next=cur.next;// 待删除元素的下一个节点
        if (pre==null) {//待删除结点为头结点
            cur.next=null;
            head=next;
        }else{
            pre.next=next;
        }
        size--;//元素数量减1
        return res;
    }
    /***
     * @函数功能：遍历链表
     * @param head:
     * @return：void
     */
    public void print(ListNode head){
        if (head==null){
            System.out.println("NULL");
            return;
        }
        ListNode cur=head;
        System.out.print(cur.val);
        cur=cur.next;
        while(cur!=null){
            System.out.print("->"+cur.val);
            cur=cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkList linkList=new LinkList();
        System.out.println(linkList.getSize());
        linkList.insert(1,0);
        System.out.println(linkList.getSize());
        linkList.insert(2,0);
        System.out.println(linkList.getSize());
        linkList.print(linkList.head);
        linkList.remove(1);
        linkList.print(linkList.head);
        linkList.remove(0);
        linkList.print(linkList.head);
    }
}
