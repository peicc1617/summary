package leetcode.search;

/**
 * @基本功能:在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断
 * 数组中是否含有该整数。
 * @program:summary
 * @author:peicc
 * @create:2019-07-29 12:21:10
 **/
public class SearchInTwoDimensionArray {
    //选取数组的左下角元素与目标值进行查找，向右递增，向下递减
    public boolean find(int[][] array,int target){
        boolean flag=false;
        int rows=array.length;//数组行数
        int cols=array[0].length;//数组列数
        for(int i=rows-1,j=0;i>=0&&j<cols;){
            if(array[i][j]==target){
                flag=true;
            }
            if(array[i][j]>target){
                j--;
                continue;
            }
            if(array[i][j]<target){
                i++;
                continue;
            }
        }
        return  flag;
    }
}
