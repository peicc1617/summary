package leetcode.recursive;

import java.util.*;

/**
 * @基本功能:打印输出字符串的全排列
 * @program:summary
 * @author:peicc
 * @create:2019-08-02 18:09:16
 **/
public class PermutationForString {
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> list=new ArrayList<String>();
        if(str!=null){
            PermutationHelper(str.toCharArray(),0,list);
            Collections.sort(list);
        }
        return list;
    }
    //递归函数的功能：得到字符串从i开始的全排列
    /**
     * @功能：基本思路：1、要想求得字符串的全排列，首先确定第一个字符，然后求剩下字符的全排列
     *               2、要想求得剩下字符的全排列，则需要确定剩下字符的第一个字符，然后再求剩下字符除去第一个字符的全排列（跟步骤1完成的功能一样）
     *               3、如何确定第一字符：由于每一个字符都可能成为第一个字符，因此需要第一个字符与剩余字符交换
     * @Param: [chars, i, list]
     * @return: void
     * @Date: 2019/8/2
     */
    public static void PermutationHelper(char[] chars,int i,ArrayList<String> list){
        //递归出口：字符串的最后一位
        if(i==chars.length-1){
            list.add(String.valueOf(chars));
        }else{
            Set<Character> set=new HashSet<Character>();//储存出现的每个字符，用来判断字符是否重复
            for(int j=i;j<chars.length;j++){
                if(!set.contains(chars[j])){
                    set.add(chars[j]);
                    swap(chars,i,j);//确定第一个字符
                    PermutationHelper(chars,i+1,list);//递归得到取得首位后的字符串的各种组合
                    swap(chars,j,i);//交换回来
                }
            }
        }
    }
    //交换函数
    public static void swap(char[] chars,int i,int j){
        char temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        while(true){
//            String str=scanner.nextLine();
//            ArrayList<String> result=new ArrayList<String>();
//            result=Permutation(str);
//            System.out.println(result);
//        }
        /****测试字典排序算法*****/
        String str=scanner.next();
        char[] array=str.toCharArray();
        do {
            System.out.println(array);
        }while(CalcAllpertutation(array,str.length()));

    }
    //方法2：字典序排列
    static boolean CalcAllpertutation(char[] array,int num){
        int i=0;
        //步骤一：找到排列中最后的一个升序的首位位置i
        for(i=num-2;(i>=0)&&(array[i]>array[i+1]);i--){
            ;
        }
        //i<0,说明已经找到所有排列（如12345，终止字符串为54321，）
        if(i<0){
            return false;
        }
        int k=0;
        //步骤二：找到排列中第i位右边最后一个比array[i]大的位置k
        for(k=num-1;(k>i)&&(array[k]<=array[i]);k--){
            ;
        }
        //步骤三：交换i,k
        swap(array,i,k);
        //步骤四：把第i+1位到最后的部分翻转
        reverseString(array,i+1,num-1);
        return true;
    }
    //翻转字符串
    public static void reverseString(char[] array,int from,int to){
        while(from<to){
            char temp=array[from];
            array[from++]=array[to];
            array[to--]=temp;
        }
    }
}
