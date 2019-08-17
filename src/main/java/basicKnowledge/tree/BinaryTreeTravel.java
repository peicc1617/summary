package basicKnowledge.tree;

import java.util.Arrays;
import java.util.Stack;

/**
 * @基本功能:二叉树的遍历
 * @program:summary
 * @author:peicc
 * @create:2019-07-24 21:23:58
 **/
public class BinaryTreeTravel {
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
    //根据前序和中序遍历结果重建二叉树
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
    /***********************二叉树的非递归遍历************************************/
    //前序遍历
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
    //中序遍历
    public static void inOrderTraverseByNoRe(BiTreeNode root){
        if(root==null){
            System.out.println("二叉树为空");
            return;
        }
        Stack stack=new Stack();
        BiTreeNode temp=root;
        while(!stack.isEmpty()||temp!=null){
            if(temp!=null){
                stack.push(temp.left);
                temp=temp.left;
            }else{
                temp=(BiTreeNode) stack.pop();
                System.out.print(temp.element+" ");
                temp=temp.right;
            }
        }
    }
    //后续遍历
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

    public static void main(String[] args) {
        int[] pre=new int[]{1,2,4,7,3,5,6,8};
        int[] in=new int[]{4,7,2,1,5,3,8,6};
        BiTreeNode root=reconstructBiTree(pre,in);
        preOrderTraverse(root);
        System.out.println("-------------非递归遍历-------------");
        preOrderTraverseByNoRe(root);
    }
}
