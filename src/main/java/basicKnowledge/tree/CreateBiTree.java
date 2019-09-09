//package basicKnowledge.tree;
//
//import java.util.Scanner;
//
///**
// * @基本功能:根数输入数据创建二叉树
// * @program:summary
// * @author:peicc
// * @create:2019-07-25 10:53:24
// **/
//public class CreateBiTree {
//    /**
//     * @功能：根据输入字符创建二叉树
//     * @Param: [T]
//     * @return: basicKnowledge.tree.BiTreeNode
//     * @Date: 2019/7/25
//     */
//    public static BiTreeNode createBiTree(BiTreeNode T){
//        Scanner scanner=new Scanner(System.in);
//        String str=scanner.next();
//            char[] c=str.toCharArray();
//            if(c[0]=='#'){
//                T= null;
//            }else{
//                T.element=c[0];//生成结点
//                T.left=new BiTreeNode();
//                T.right=new BiTreeNode();
//                createBiTree(T.left);
//                createBiTree(T.right);
//            }
//            return T;
//    }
//    /**
//     * @功能：根据字符串创建二叉树
//     * @Param: [root, str, index]
//     * @return: int
//     * @Date: 2019/7/25
//     */
//    public static int createBiTreeByString(BiTreeNode root, String str, int index){
//        if('#'==str.charAt(index)){
//            return index+1;
//        }
//        root.element=str.charAt(index);
//        root.left=new BiTreeNode();
//        int index1=createBiTreeByString(root.left,str,index+1);
//        root.right=new BiTreeNode();
//        int index2=createBiTreeByString(root.right,str,index1);
//        return index2;
//    }
//    public static BiTreeNode createBiTreeWrong(BiTreeNode T){
//        Scanner scanner=new Scanner(System.in);
//        String str=scanner.next();
//        char[] c=str.toCharArray();
//        if(c[0]=='#'){
//            T=null;
//        }else{
//            T=new BiTreeNode(c[0]);//生成结点
//            createBiTreeWrong(T.left);
//            createBiTreeWrong(T.right);
//        }
//        return T;
//    }
//
//    public static void main(String[] args) {
//        BinaryTreeTravel binaryTreeTravel=new BinaryTreeTravel();
////        BiTreeNode t=new BiTreeNode();
////        createBiTreeByString(t,"AB#D##C##",0);
////        t=createBiTree(t);
////        binaryTreeTravel.preOrderTravelse(t);
//        BiTreeNode t1=new BiTreeNode();
//        createBiTree(t1);
//        binaryTreeTravel.preOrderTraverse(t1);
////        BiTreeNode t2=new BiTreeNode();
////        t2=createBiTreeWrong(t2);
////        binaryTreeTravel.preOrderTravelse(t2);
//    }
//}
//
