package basicKnowledge.string;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-21 20:36:17
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        BigInteger[][] array=new BigInteger[n][m];
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                array[i][j]=scanner.nextBigInteger();
            }
        }
        BigInteger temp;
        BigInteger max=array[0][0];
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                for (int p=0;p<n;p++){
                    if(p==i){
                        continue;
                    }
                    for(int q=0;q<m;q++){
                        if(q==j){
                            continue;
                        }
//                        temp=array[i][j].array[p][q];
                        temp=array[i][j].multiply(array[p][q]);
                        if(temp.compareTo(max)>0){
                            max=temp;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
