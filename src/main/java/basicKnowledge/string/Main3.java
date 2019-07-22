package basicKnowledge.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-21 21:22:07
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        System.out.println(Math.pow(510,5));
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int T=scanner.nextInt();
        LinkedList array[]=new LinkedList[N+1];
        LinkedList list=new LinkedList();
        for(int i=0;i<N+1;i++){
            array[i]=list;
        }
        int L,R,V;
        for(int i=0;i<M;i++){
            int opt=scanner.nextInt();
            if(opt==1){
                L=scanner.nextInt();
                R=scanner.nextInt();
                V=scanner.nextInt();
                for(int j=L;j<=R;j++){
                    array[j].add(V);
                }
            }else if(opt==2){
                L=scanner.nextInt();
                R=scanner.nextInt();
                V=scanner.nextInt();
                for(int j=L;j<=R;j++){
                    if(array[j].contains((Integer)V)){
                        array[j].removeFirst();
                    }
                }
            }else {
                L=scanner.nextInt();
                R=scanner.nextInt();
                int result=0;
                for(int j=L;j<=R;j++){
                    result=result+array[j].size();
                }
                System.out.println(result);
            }
        }
    }
}
