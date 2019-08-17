
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N,A,X;
        while(true){
            N=scanner.nextInt();//bug总数
            A=scanner.nextInt();//效率
            X=scanner.nextInt();//杯数
            int max=X*60;//最多提升多久
            int sum=0;
            double[] array=new double[N];
            for(int i=0;i<N;i++){
                if(sum<max){
                    array[i]=scanner.nextDouble()/A;//分钟数
                    sum+=array[i];
                }else{
                    array[i]=scanner.nextDouble();//分钟数
                }

            }

            double result=0;
            for(int i=0;i<N;i++){
                result+=array[i];
            }
            result= Math.ceil(result);
            if(result<=480){
                System.out.println((int)result);
            }else{
                System.out.println(0);
            }
        }


    }
}
