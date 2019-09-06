package basicKnowledge.sort;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-18 17:20:28
 **/
//冒泡排序
//两两比较并交换，每趟排序后最大值会排在右边。共需n-1趟排序
public class BubbleSort {
    public static void bubbleSort(int []array){
        int length=array.length;
        for(int i=0;i<length-1;i++){//排序趟数
            for(int j=0;j<length-i-1;j++){//每趟排序两两比较
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{10,6,7,8,9,1,2,5,3,4};
        bubbleSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
