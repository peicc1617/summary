package basicKnowledge.sort;

/**
 * @基本功能:桶排序
 * @program:summary
 * @author:peicc
 * @create:2019-09-06 18:14:45
 **/
public class barrelSort {
    /**
     * @功能：
     * @Param: [arr, n] n待排序元素的最大范围
     * @return: void
     * @Date: 2019/9/6
     */
    public static void barrelSort(int[] arr,int n){
        int[] book=new int[n+1];
        for (int i = 0; i <arr.length ; i++) {
            book[arr[i]]++;
        }
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <book[i] ; j++) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{10,6,7,8,9,1,2,5,3,4};
        barrelSort(arr,10);
    }
}
