package basicKnowledge.tree;

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
    public void preOrderTravelse(BiTreeNode root){
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
}
