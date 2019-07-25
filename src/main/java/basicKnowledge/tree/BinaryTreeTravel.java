package basicKnowledge.tree;

import com.sun.org.apache.bcel.internal.generic.BIPUSH;

import java.util.Arrays;

/**
 * @基本功能:二叉树的遍历
 * @program:summary
 * @author:peicc
 * @create:2019-07-24 21:23:58
 **/
public class BinaryTreeTravel {
    /*二叉树的递归遍历*/
    /**
     * @功能：先序遍历
     * @Param: [root]
     * @return: void
     * @Date: 2019/7/24
     */
    public static void preOrderTravelse(BiTreeNode root){
        if(root==null){
            return;
        }
        //先访问根节点，然后访问左右结点
        System.out.println(root.element);
        preOrderTravelse(root.left);
        preOrderTravelse(root.right);
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

    public static void main(String[] args) {
        int[] pre=new int[]{1,2,4,7,3,5,6,8};
        int[] in=new int[]{4,7,2,1,5,3,8,6};
        BiTreeNode root=reconstructBiTree(pre,in);
        preOrderTravelse(root);
    }
}
