package basicKnowledge.sort;

/**
 * @基本功能:快速排序
 * @program:summary
 * @author:peicc
 * @create:2019-07-22 21:41:29
 **/
public class QuickSort {
    public static void quickSort(int[] array,int left,int right){
        int benchMark=array[left];
        int i=left,j=right;
        if(left>right){
            return;
        }
        while(i!=j){
            //j从右向往走寻找比基本小的数
            while(array[j]>benchMark&i<j){
                j--;
            }
            //i从左向右走寻找比基准大的数
            while(array[i]<benchMark&i<j){
                i++;
            }
            if(i<j){//还未相遇
                //交换
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        //将基准放在正确位置
        array[left]=array[i];
        array[i]=benchMark;
        //左半部分快速排序
        quickSort(array,left,i-i);
        //右边部分快速排序
        quickSort(array,i+1,right);
    }

    public static void main(String[] args) {
        int[] array=new int[]{9,5,10,1,6};
        printAll(array);
        quickSort(array,0,array.length-1);
        printAll(array);
    }
    public static void printAll(int[]array){
        System.out.println("***********输出数组*********");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
