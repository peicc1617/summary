package basicKnowledge.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @基本功能:二叉树的遍历
 * @program:summary
 * @author:peicc
 * @create:2019-07-24 21:23:58
 **/
public class BinaryTreeTravel {
    /*******二叉树的结点**********/
    static class BiTreeNode<AnyType>{
        AnyType element;//数据元素
        BiTreeNode<AnyType> left;//左孩子节点
        BiTreeNode<AnyType> right;//右孩子节点
        BiTreeNode(AnyType element, BiTreeNode<AnyType> left, BiTreeNode<AnyType> right){
            this.element=element;
            this.left=left;
            this.right=right;
        }
        BiTreeNode(AnyType element){
            this(element,null,null);
        }
        BiTreeNode(){

        }
    }
    /*********************二叉树的递归遍历****************************/
    /**
     * @功能：先序遍历
     * @Param: [root]
     * @return: void
     * @Date: 2019/7/24
     */
    public static void preOrderTraverse(BiTreeNode root){
        if(root==null){
            return;
        }
        //先访问根节点，然后访问左右结点
        System.out.println(root.element);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }
    /**
     * @功能：中序遍历
     * @Param: [root]
     * @return: void
     * @Date: 2019/7/24
     */
    public void inOrderTraverse(BiTreeNode root){
        if(root==null){
            return;
        }
        //左根右
        inOrderTraverse(root.left);
        System.out.println(root.element);
        inOrderTraverse(root.right);
    }
    /**
     * @功能：后续遍历
     * @Param: [root]
     * @return: void
     * @Date: 2019/7/24
     */
    public void postOrderTraverse(BiTreeNode root){
        if(root==null){
            return;
        }
        //左右根
        postOrderTraverse(root.left);
        postOrderTraverse(root.right);
        System.out.println(root.element);
    }
    /***********************二叉树的非递归遍历************************************/
    /***
     * @函数功能：前序非递归遍历
     * @param: root
     * @return：void
     */
    public static void preOrderTraverseByNoRe(BiTreeNode root){
        if(root==null){
            System.out.println("二叉树为空");
            return;
        }
        Stack stack=new Stack();
        stack.push(root);//根节点入栈
        while(!stack.isEmpty()){
            BiTreeNode temp=(BiTreeNode) stack.pop();
            System.out.print(temp.element+" ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
    }
    /***
     * @函数功能：前序非递归遍历的另一种写法
     * @param: root
     * @return：void
     */
    public static void preOrderTraverseByNoRe1(BiTreeNode root){
        if(root==null){
            System.out.println("二叉树为空");
            return;
        }
        Stack stack=new Stack();
        BiTreeNode temp=root;
        while (!stack.isEmpty()||temp!=null){
            //遍历左子树，边走边打印
            while(temp!=null){
                System.out.println(temp.element);//打印
                stack.push(temp);
                temp=temp.left;
            }
            //temp为空，说明根结点和左子树都访问完了,然后进入右子树，开启新一轮的左子树遍历
            if(!stack.isEmpty()){
                temp=(BiTreeNode) stack.pop();
                temp=temp.right;
            }
        }
    }
    /***
     * @函数功能：中序非递归遍历（中序是最简单的）
     * @param: root
     * @return：void
     */
    public static void inOrderTraverseByNoRe(BiTreeNode root){
        if(root==null){
            System.out.println("二叉树为空");
            return;
        }
        Stack stack=new Stack();
        BiTreeNode temp=root;
        while(!stack.isEmpty()||temp!=null){
            if(temp!=null){//先将树的左孩子结点入栈
                stack.push(temp.left);
                temp=temp.left;
            }else{
                temp=(BiTreeNode) stack.pop();
                System.out.print(temp.element+" ");//访问
                temp=temp.right;//再将树的右孩子结点入栈
            }
        }
    }
    /***
     * @函数功能：中序非递归遍历的另一种写法
     * @param: root
     * @return：void
     */
    public static void inOrderTraverseByNoRe1(BiTreeNode root){
        if(root==null){
            System.out.println("二叉树为空");
            return;
        }
        Stack stack=new Stack();
        BiTreeNode temp=root;
        while(!stack.isEmpty()||temp!=null){
            //先将左子树全部入栈
            while(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            if(!stack.isEmpty()){
                temp=(BiTreeNode) stack.pop();
                System.out.println(temp.element);
                temp=temp.right;//进入右子树，开启新一轮的左子树遍历
            }
        }
    }
    /***
     * @函数功能：后续遍历
     * @param: root
     * @return：void
     */
    public static void postOrderTraverseByNoRe(BiTreeNode root){
        if(root==null){
            System.out.println("二叉树为空");
        }
        Stack stack1=new Stack();
        Stack stack2=new Stack();//用于将元素倒置
        stack1.push(root);
        while(!stack1.isEmpty()){
            BiTreeNode temp=(BiTreeNode) stack1.pop();
            stack2.push(temp);
            if(temp.left!=null){
                stack1.push(temp.left);
            }
            if(temp.right!=null){
                stack1.push(temp.right);
            }
        }
        while(!stack2.isEmpty()){
            System.out.println(((BiTreeNode)stack2.pop()).element+" ");
        }
    }
    /***
     * @函数功能：后续遍历的另一种方法
     * @param: root
     * @return：void
     */
    public static void postOrderTraverseByNoRe2(BiTreeNode root){
        if(root==null){
            System.out.println("二叉树为空");
        }
        Stack stack=new Stack();
        BiTreeNode temp=root;
        BiTreeNode lastNode=null;//记录上一次被访问的结点
        while (!stack.isEmpty()||temp!=null){
            while (temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            temp=(BiTreeNode) stack.peek();
            if(temp.right==null||temp.right==lastNode){//只有当前结点的右孩子节点为空或已被访问过，才可以访问当前结点
                System.out.println(temp.element);
                lastNode=temp;
            }else{
                temp=temp.right;//右孩子节点未被访问，将右孩子结点入栈
            }
        }
    }
    /*****************二叉树的层序遍历*********************/
    /***
     * @函数功能：二叉树的层序遍历
     * @param: root
     * @return：void
     */
    public static void levelOrderTraverse(BiTreeNode root){
        if(root==null){
            return;
        }
        LinkedList<BiTreeNode> queue=new LinkedList();//队列
        queue.offer(root);
        while (!queue.isEmpty()){
            BiTreeNode cur=queue.poll();
            System.out.println(cur.element);
            if(cur.left!=null){
                queue.offer(cur.left);
            }else{
                queue.offer(cur.right);
            }
        }
    }
    /***
     * @函数功能：二叉树层序遍历的另一种方法（可按层输出）
     * @param: root
     * @return：void
     */
    public static void levelOrderTraverse1(BiTreeNode root){
        if(root==null){
            return;
        }
        LinkedList<BiTreeNode> queue=new LinkedList();//队列
        queue.offer(root);
        while (!queue.isEmpty()){
            for (int i = 0; i < queue.size(); i++) {
                BiTreeNode cur=queue.poll();
                System.out.print(cur.element+" ");
                if(cur.left!=null){
                    queue.offer(cur.left);
                }else{
                    queue.offer(cur.right);
                }
            }
            System.out.println();//换行
        }
    }
    /*---------根据前序和中序遍历结果重建二叉树----------------------*/
    public static BiTreeNode reconstructBiTree(int[] pre,int[]in){
        if(pre.length==0||in.length==0){//为空
            return null;
        }
        //创建根节点
        BiTreeNode node=new BiTreeNode(pre[0]);
        //找到中序遍历的根节点
        for(int i=0;i<in.length;i++){
            if(pre[0]==in[i]){
                node.left=reconstructBiTree(Arrays.copyOfRange(pre,1,i+1), Arrays.copyOfRange(in,0,i));
                node.right=reconstructBiTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
                break;
            }
        }
        return node;
    }

    public static void main(String[] args) {
        int[] pre=new int[]{1,2,4,7,3,5,6,8};
        int[] in=new int[]{4,7,2,1,5,3,8,6};
        BiTreeNode root=reconstructBiTree(pre,in);
        preOrderTraverse(root);
        System.out.println("-------------非递归遍历-------------");
        preOrderTraverseByNoRe(root);
        System.out.println("------------利用二叉搜索树的插入方法构建二叉树------------");
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        BinarySearchTree.BinaryNode root1=null;
        for (int i = 1; i <=10 ; i++) {
           root1= binarySearchTree.insert(i,root1);
        }
        System.out.println(root1.element);
    }
}
