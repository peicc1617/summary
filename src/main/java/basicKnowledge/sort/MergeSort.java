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
        int[] SR={-1,50,10,90,30,70,40,80,60,20};
        int[] TR1=new int[SR.length];
        mergeSort(SR,TR1,1,9);
        for (int i = 1; i<=9; i++) {
            System.out.println(TR1[i]);
        }

    }
    //归并排序
    public static void mergeSort(int SR[],int[] TR1,int s,int t){
        int[] TR2=new int[SR.length];
        int m;
        if(s==t){
            TR1[s]=SR[s];
        }else{
            m=(s+t)/2;
            mergeSort(SR,TR2,s,m);
            mergeSort(SR,TR2,m+1,t);
            merge(TR2,TR1,s,m,t);
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
        if(i<=m){
            for(;i<=m;){
                TR[k++]=SR[i++];
            }
        }
        if(j<=n){
            for(;j<=n;){
                TR[k++]=SR[j++];
            }
        }
    }
}
