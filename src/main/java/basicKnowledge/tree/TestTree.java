package basicKnowledge.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-07-24 16:47:00
 **/
public class TestTree {
    static ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();;
    static ArrayList<Integer> temp = new ArrayList<Integer>();
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        BinarySearchTree.BinaryNode root;
        root=tree.insert(1,null);
        root=tree.insert(2,root);
        root=tree.insert(3,root);
        print(root);
        FindPath(root,1);
        System.out.println();

    }
    public static void  print( BinarySearchTree.BinaryNode root){
        if (root==null) {
            return;
        }
        System.out.println(root.element);
        print(root.left);
        print(root.right);

    }
    public static  ArrayList<ArrayList<Integer>> FindPath(BinarySearchTree.BinaryNode root, int target) {
        if(root==null) return result;;
        temp.add((Integer) root.element);
        target -= (Integer) root.element;
        if(target == 0&& root.left == null && root.right == null){
            result.add(new ArrayList<Integer>(temp));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        temp.remove(temp.size()-1);
        return result;
    }
}
