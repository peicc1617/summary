package basicKnowledge.string;

import java.util.*;

/**
 * @program:summary
 * @author:peicc
 * @create:2019-07-21 19:31:59
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        LinkedList<Double> list=new LinkedList<Double>();

        for(int i=0;i<n;i++){
            list.add(scanner.nextDouble());
        }
        Collections.sort(list);
        boolean flag=true;
        int length=list.size();
        while(list.size()!=1){
            double a=list.removeFirst();
            double b=list.removeFirst();
            double temp=(a+b)/2;
            list.addFirst(temp);
        }
        double _result=list.getFirst();
        String result=String.format("%.4f",_result);//保留小数点后四位
        System.out.println(result);
    }
}
