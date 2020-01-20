package leetcode.array;

/**
 * @基本功能:寻找数组中重复元素
 * @program:summary
 * @author:peicc
 * @create:2019-12-12 11:10:10
 **/
public class Duplication {
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length<=1){//数组长度小于等于1
            return false;
        }
        for(int i=0;i<length;i++){
            if(numbers[i]!=i){
                int temp=numbers[numbers[i]];
                if(temp==numbers[i]){
                    duplication[0]=temp;
                    return true;
                }else{
                    int temp1=numbers[i];
                    numbers[i]=temp;
                    numbers[temp1]=temp1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{2,1,3,1,4};
        boolean res=duplicate(arr,arr.length,new int[1]);
    }
}
