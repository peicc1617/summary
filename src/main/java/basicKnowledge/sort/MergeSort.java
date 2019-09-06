package basicKnowledge.sort;

import com.sun.scenario.effect.Merge;

/**
 * @基本功能:归并排序（比较占内存，但却效率高且比较稳定的算法）
 * @时间复杂度
 * @最好、最坏、平均：O(nlogn)
 * @空间复杂度：
 * O(n+logn): n记录排序结果所需空间，logn递归调用所需的栈空间
 * @program:summary
 * @author:peicc
 * @create:2019-08-20 10:06:35
 **/
public class MergeSort {
    public static void main(String[] args) {
        int[] SR={50,10,90,30,70,40,80,60,20};
        int[] TR1=new int[SR.length];
        mergeSort(SR,TR1,0,8);
        for (int i = 0; i<9; i++) {
            System.out.println(TR1[i]);
        }

    }
    //归并排序
    /**
     * @功能：
     * @Param: [SR, TR1, s, t] SR：待排序数组
     * @Param SR:待排序数组
     * @Param TR1;排序后的数组
     * @Param s：元素的起始位置
     * @Param t:元素的终止位置
     * @return: void
     * @Date: 2019/9/6
     */
    public static void mergeSort(int SR[],int[] TR1,int s,int t){
        int[] TR2=new int[SR.length];
        int m;
        if(s==t){//只有一个元素
            TR1[s]=SR[s];
        }else{
            //先分再合
            m=(s+t)/2;
            mergeSort(SR,TR2,s,m);//递归，将SR[s,m]归并排序成有序的TR2[s,m]
            mergeSort(SR,TR2,m+1,t);//递归，将SR[m+1,t]归并排序成有序的TR2[m+1,t]
            merge(TR2,TR1,s,m,t);//将TR2[s,m]、TR2[m+1,t]归并到TR1[s,m]中
        }
    }
    //合并两个有序数组
    public static void merge(int[] SR,int[] TR,int i,int m,int n){
        int j=m+1;//第二个有序数组的下标
        int k=i;//合并后有序数组的下标
        for (; i <=m&&j<=n ; k++) {
            if(SR[i]<SR[j]){
                TR[k]=SR[i++];
            }else{
                TR[k]=SR[j++];
            }
        }
        if(i<=m){//说明第一部分没有合并完
            for(;i<=m;){
                TR[k++]=SR[i++];
            }
        }
        if(j<=n){//说明第二部分没有合并完
            for(;j<=n;){
                TR[k++]=SR[j++];
            }
        }
    }
}
