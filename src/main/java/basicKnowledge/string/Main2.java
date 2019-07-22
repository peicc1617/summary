package basicKnowledge.string;

import java.util.Scanner;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-21 21:04:02
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            int temp=scanner.nextInt();
            if(temp<0){
                array[i]=0;
            }else{
                array[i]=temp;
            }
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
}
