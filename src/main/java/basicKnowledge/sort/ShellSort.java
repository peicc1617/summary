package basicKnowledge.sort;

/**
 * @基本功能：希尔排序
 * @program:summary
 * @author:peicc
 * @create:2019-07-18 20:52:31
 **/
public class ShellSort {
    public static void shellSort(int []array){
        int length=array.length;
        int gap=length/2;
        while(gap>=1){//步长
            for(int num=0;num<gap;num++){//分的组数
                //每一组使用插入排序算法
                for(int i=num+gap;i<length;i=i+gap){//组中的元素
                    int j=i-gap;//j为有序序列的最后一位下标
                    int insertNum=array[i];//待插入的元素
                    while(j>=0&&array[j]>insertNum){
                        array[j+gap]=array[j];
                        j=j-gap;
                    }
                    array[j+gap]=insertNum;
                }

            }
            gap=gap/2;//缩减步长
        }
    }

    public static void main(String[] args) {
        int[] a=new int[]{3,1,5,7,2,4,9,6,12,200,15,5,20};
        shellSort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
