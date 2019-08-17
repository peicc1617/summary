package leetcode.list;

/**
 * @基本功能:反转链表
 * @program:summary
 * @author:peicc
 * @create:2019-08-17 12:00:59
 **/
public class ListReverse {
    public static void main(String[] args) {
        LinkList myLinkList=new LinkList();
        for (int i = 0; i <10 ; i++) {
            myLinkList.add(i);
        }
        System.out.println("原链表元素为：");
        myLinkList.print(myLinkList.head);
        System.out.println("递归反转后：");
        LinkList.ListNode newHead=reverseList(myLinkList.head);
        myLinkList.print(newHead);
        System.out.println("遍历翻转后：");
        LinkList.ListNode newHead1=reverseListByTraverse(newHead);
        myLinkList.print(newHead1);

    }
    //反转链表:递归
    public static LinkList.ListNode reverseList(LinkList.ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        LinkList.ListNode next=head.next;
        LinkList.ListNode temp=reverseList(next);
        next.next=head;
        head.next=null;
        return temp;

    }
    //反转链表：遍历
    public static LinkList.ListNode reverseListByTraverse(LinkList.ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        LinkList.ListNode current=head;
        LinkList.ListNode next=null;
        LinkList.ListNode newHead=null;
        while(current!=null){
            next=current.next;
            current.next=newHead;//将当前结点保存为头结点，所以其后继元素为之前的头结点
            newHead=current;//将当前结点设为头结点
            current=next;
        }
        return newHead;
    }

}
