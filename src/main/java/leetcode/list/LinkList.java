package leetcode.list;

/**
 * @基本功能:单链表的创建
 * @program:summary
 * @author:peicc
 * @create:2019-08-17 11:45:53
 **/
public class LinkList {
    ListNode head;//头结点
    ListNode last;//当前结点
    /*链表节点*/
    class ListNode{
        int val;//值域
        ListNode  next;//指针域
        //构造函数
        ListNode(int val){
            this.val=val;
        }
    }
    /**************主要API**************/
    //向链表中添加数据
    public void add(int val){
        if(head==null){//链表为空
            head=new ListNode(val);//添加的结点为当前链表的头结点
            last=head;
        }else{
            last.next=new ListNode(val);//否则，将链表添加到末尾结点
            last=last.next;//current指向新添加的结点
        }
    }
    //遍历链表
    public void print(ListNode head){
        ListNode cur=head;
        if(cur!=null){
            System.out.print(cur.val);
        }
        cur=cur.next;
        while(cur!=null){
            System.out.print("->"+cur.val);
            cur=cur.next;
        }
        System.out.println();
    }
}
