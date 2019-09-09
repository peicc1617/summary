package bishi.common;

import java.util.*;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-03 11:10:44
 **/
public class zhongxing1 {
    public static void main(String args[]){
        int[] nums;
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
        }
        List<Integer>res=saraly(nums);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+"  ");
        }


    }
    public static List<Integer> saraly( int nums[]){
        if(nums==null||nums.length==0)
            return null;
        int length=nums.length;
        //新建一个计数数组，count[i][0]表示薪资，count[i][1]表示薪水出现次数。
        int[][] counts=new int[length][2];
        //用一个key来记录counts这个数组实际使用多少
        int key=0;
        for(int i=0;i<length;i++){
            //遍历，如果数组中已经存在，就把次数加一，否则的话就往数组后面加
            for(int j=0;j<=key;j++){
                if(nums[i]==counts[j][0]){
                    counts[j][1]++;
                    break;
                }
                if(j==key){
                    counts[j][0]=nums[i];
                    counts[j][1]=1;
                    key++;
                    break;
                }
            }
        }
        Arrays.sort(counts, new Comparator<int[]>(){
            @Override
            public int compare( int[] o1, int[] o2 ) {
                //因为相当于次数的降序，所以用的o2[1]-o1[1]
                return o2[1]-o1[1];
            }
        });
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<key;i++){
            for(int j=0;j<counts[i][1];j++){
                list.add(counts[i][0]);
            }
        }
        return list;
    }
}
