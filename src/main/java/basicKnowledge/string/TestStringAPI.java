package basicKnowledge.string;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Scanner;

//测试String API
public class TestStringAPI {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        String[] array1=str1.split(" ");
        String[] array2=str2.split(" ");
        Arrays.sort(array1);
        Arrays.sort(array2);
        int count=0;
        int i=0;
        int j=0;
        while((i<array1.length)&&(j<array2.length)){
            if(Integer.parseInt(array2[j])>=Integer.parseInt(array1[i])){
                count++;
                i++;
            }
            j++;
        }
        System.out.println(count);
    }
}
