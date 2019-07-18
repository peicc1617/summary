package basicKnowledge.sort;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-18 17:20:28
 **/
//冒泡排序
//两两比较并交换，每趟排序后最大值会排在右边
public class BubbleSort {
    public void bubbleSort(int []array){
        int length=array.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
