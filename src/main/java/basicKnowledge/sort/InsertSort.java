package basicKnowledge.sort;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-18 16:46:07
 **/
//插入排序
//将未排序的数据插入到已排序的数据系列之中
//时间复杂度O(n2):1+2+3+...+N-1
//最优：O(N):数组有序，每次只需比较不成立即可
//通过交换相邻元素进行排序的任何算法平均都需要O（n2）
public class InsertSort {
    public void inertSort(int []array){
        int length=array.length;
        int insertNum;
        for(int i=1;i<length;i++){//N-1趟排序
            insertNum=array[i];//待插入的元素
            int j=i-1;//已经排好的元素个数
            while(j>=0&&array[j]>insertNum){//从后向前比较，将大于insertNum的数据后移一位
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=insertNum;//将要插入的元素放在要插入的位置
        }
    }
}
