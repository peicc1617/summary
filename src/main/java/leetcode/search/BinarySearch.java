package leetcode.search;

/**
 * @基本功能:二分查找
 * @program:summary
 * @author:peicc
 * @create:2019-07-30 12:43:43
 **/
public class BinarySearch {
    //非递归二分查找
    public static boolean searchByNoRE(int[] array,int target){
        int left=0;
        int right=array.length-1;
        int mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(target>array[mid]){
                left=mid+1;
            }
            if(target<array[mid]){
                right=mid-1;
            }
            if(target==array[mid]){
                return true;
            }
        }
        return false;
    }
    //递归二分查找
    public static boolean searchByRE(int[] array,int target,int left,int right){
        if(left>right){
          return false;
        }
        if(target>array[right]||target<array[left]){
            return false;
        }
        int mid=(left+right)/2;
        if(target>array[mid]){
            return searchByRE(array,target,mid+1,right);
        }else if(target<array[mid]){
            return searchByRE(array,target,left,mid-1);
        }else{
            return true;
        }
    }
    public static int binarySearch(int[] dataset,int data,int beginIndex,int endIndex){
        int midIndex = (beginIndex+endIndex)/2;  //取中间索引
        //如果查找的数小于第一位数  或者  查找的数大于最后一位数  或者  起始索引大于结束索引 都说明所查找的数不存在
        if(data <dataset[beginIndex]||data>dataset[endIndex]||beginIndex>endIndex){
            return -1;
        }
        //如果查找的数小于中间索引对应的值说明找的数在左半边，递归调用该查找方法，结束索引为中间索引向左移动一位
        if(data <dataset[midIndex]){
            return binarySearch(dataset,data,beginIndex,midIndex-1);
            //如果查找的数大于于中间索引对应的值说明找的数在右半边，递归调用该查找方法，起始索引为中间索引向右移动一位
        }else if(data>dataset[midIndex]){
            return binarySearch(dataset,data,midIndex+1,endIndex);
            //如果所查找的数正好等于中间索引对应的值，那么就将该索引返回
        }else {
            return midIndex;
        }
    }


    public static void main(String[] args) {
        int array[]=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println("-------非递归求解-------------");
        System.out.println(searchByNoRE(array,6));
        System.out.println(searchByNoRE(array,15));
        System.out.println(searchByNoRE(array,1));
        System.out.println(searchByNoRE(array,9));
        System.out.println("-------------递归求解-------------");
        System.out.println(searchByRE(array,6,0,array.length-1));
        System.out.println(searchByRE(array,15,0,array.length-1));
        System.out.println(searchByRE(array,1,0,array.length-1));
        System.out.println(searchByRE(array,9,0,array.length-1));
        System.out.println("***********others*****************");
        System.out.println(binarySearch(array,9,0,array.length-1));
    }
}
