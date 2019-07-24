package basicKnowledge.tree;



/**
 * @基本功能:二叉搜索树
 * @program:summary
 * @author:peicc
 * @create:2019-07-24 16:52:29
 **/
public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {
    private BinaryNode<AnyType> root;//根节点
    //构造函数
    public BinarySearchTree(){
        root=null;
    }
    /**
     * @功能：二叉搜索树的结点
     * @Date: 2019/7/24
     */
    private static class BinaryNode<AnyType>{
        AnyType element;//数据元素
        BinaryNode<AnyType> left;//左孩子节点
        BinaryNode<AnyType> right;//右孩子节点
        BinaryNode(AnyType element,BinaryNode<AnyType> left,BinaryNode<AnyType> right){
            this.element=element;
            this.left=left;
            this.right=right;
        }
        BinaryNode(AnyType element){
            this(element,null,null);
        }
    }
    /**
     * @功能：判断树是否含有某一元素
     * @Param: [x, root]
     * @return: boolean
     * @Date: 2019/7/24
     */
    private boolean contains(AnyType x,BinaryNode<AnyType> root){
        if(root==null){
            return false;
        }
        int compareResult=x.compareTo(root.element);//比较指定元素与根节点元素的大小
        if(compareResult<0){
            return contains(x,root.left);
        }
        if(compareResult>0){
            return contains(x,root.right);
        }
        return true;
    }
    /**
     * @功能：找到最小的结点
     * @Param: [root]
     * @return: AnyType
     * @Date: 2019/7/24
     */
    private BinaryNode<AnyType> findMin(BinaryNode<AnyType> root){
        if(root==null){
            return null;
        }
        if(root.left==null){
            return root;
        }else{
            return findMin(root.left);
        }
    }
    /**
     * @功能：找到最大的结点
     * @Param: [root]
     * @return: basicKnowledge.tree.BinarySearchTree.BinaryNode<AnyType>
     * @Date: 2019/7/24
     */
    private BinaryNode<AnyType> findMax(BinaryNode<AnyType> root){
        if(root==null){
            return null;
        }
        while(root.right!=null){
            root=root.right;
        }
        return root;
    }
    /**
     * @功能：插入结点
     * @Param: [x, root]
     * @return: basicKnowledge.tree.BinarySearchTree.BinaryNode<AnyType>
     * @Date: 2019/7/24
     */
    private BinaryNode<AnyType> insert(AnyType x,BinaryNode<AnyType> root){
        if(root==null){
            return new BinaryNode<>(x,null,null);
        }
        int compareResult=x.compareTo(root.element);
        if(compareResult<0){
            insert(x,root.left);
        }else if(compareResult>0){
            insert(x,root.right);
        }else{//结点元素值相等
            ;
        }
        return root;
    }
    /**
     * @功能：删除结点，比较麻烦
     * @Param: [x, root]
     * @return: basicKnowledge.tree.BinarySearchTree.BinaryNode<AnyType>
     * @Date: 2019/7/24
     */
    private BinaryNode<AnyType> remove(AnyType x,BinaryNode<AnyType> root){
        if(root==null){
            return null;
        }
        int compareResult=x.compareTo(root.element);
        if(compareResult<0){
            root.left=remove(x,root.left);
        }else if(compareResult>0){
            root.right=remove(x,root.right);
        }else if(root.left!=null&&root.right!=null){//删除的结点有两个子节点
            root.element=findMin(root.right).element;
            root.right=remove(root.element,root.right);
        }else{//删除的结点只有一个孩子
            root=(root.left!=null)?root.left:root.right;
        }
        return root;
    }
}
