package basicKnowledge.tree;

/**
 * @基本功能:二叉树结点
 * @program:summary
 * @author:peicc
 * @create:2019-07-24 21:34:40
 **/
public class BiTreeNode<AnyType> {
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
