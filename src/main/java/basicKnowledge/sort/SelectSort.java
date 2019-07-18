package basicKnowledge.sort;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-18 21:55:29
 **/
//选择排序
//1.遍历整个序列，将最小的数放在最前面
//2.遍历剩下的序列，将最小的数放在最前面
//3.重复第二步
//常用于取序列中最大最小的几个数
public class SelectSort {
    public void selectSort(int[] array){
        int length=array.length;
        for(int i=0;i<length;i++){
            int min=array[i];
            int position=i;
            for(int j=i+1;j<length;j++){
                if(min<array[j]){
                    min=array[j];
                    position=j;
                }
            }
            //比较完之后交换位置
            array[position]=array[i];
            array[i]=min;
        }
    }
}
