package basicKnowledge.search;

/**
 * @基本功能:二分查找与插值查找
 * @program:summary
 * @author:peicc
 * @create:2019-08-20 10:55:07
 **/
public class BinarySearch {
    //非递归二分查找
    public static boolean searchByNoRE(int[] array,int target){
        int left=0;
        int right=array.length-1;
        int mid=0;
        while(left<=right){
            mid=(left+right)/2;
//            mid=left+(right-left)*(target-array[left])/(array[right]-array[left]);//此时为插值查找
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
    //插值查找
    public static boolean searchByInsert(int[] array,int target){
        int left=0;
        int right=array.length-1;
        int mid=0;
        while(left<=right){
            mid=left+(right-left)*(target-array[left])/(array[right]-array[left]);//此时为插值查找
            if(mid<array.length){
                if(target>array[mid]){
                    left=mid+1;
                }
                if(target<array[mid]){
                    right=mid-1;
                }
                if(target==array[mid]){
                    return true;
                }
            }else{
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int array[]=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println("-------非递归求解-------------");
        System.out.println(searchByNoRE(array,6));
        System.out.println(searchByNoRE(array,15));
        System.out.println(searchByNoRE(array,1));
        System.out.println(searchByNoRE(array,9));
        System.out.println("-------插值求解-------------");
        System.out.println(searchByInsert(array,6));
        System.out.println(searchByInsert(array,15));
        System.out.println(searchByInsert(array,1));
        System.out.println(searchByInsert(array,9));
        System.out.println("-------------递归求解-------------");
        System.out.println(searchByRE(array,6,0,array.length-1));
        System.out.println(searchByRE(array,15,0,array.length-1));
        System.out.println(searchByRE(array,1,0,array.length-1));
        System.out.println(searchByRE(array,9,0,array.length-1));
    }
}
