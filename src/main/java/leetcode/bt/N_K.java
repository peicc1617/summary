package leetcode.bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @基本功能:(回溯法)给你两个整数 n和k，从1-n中选择k个数字的组合。比如n=4，那么从1,2,3,4中选取两个数字的组合，包括图上所述的四种。
 * @program:summary
 * @author:peicc
 * @create:2019-08-02 19:05:12
 **/
public class N_K {
    static ArrayList<List> result=new ArrayList<List>();
    public static ArrayList<List> combine(int n,int k){
        List<Integer> list=new ArrayList<Integer>();
        backTracking(n,k,1,list,result);
        return result;
    }
    public static void backTracking(int n,int k,int start,List<Integer> list,List<List> result){
        if(k==0){
            result.add(new ArrayList(list));
        }else{
            for(int i=start;i<=n;i++){
                list.add(i);
                backTracking(n,k-1,i+1,list,result);
                list.remove(list.size()-1);//回溯
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            System.out.println(combine(n,k));
        }
    }
}
