import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N,T;
        HashMap map1=new HashMap();
        TreeMap map2=new TreeMap();
        HashMap map3=new HashMap();
        Scanner scanner=new Scanner(System.in);
        while(true){
            N=scanner.nextInt();//零食的种类
            T=scanner.nextInt();
            for(int i=0;i<N;i++){
                map1.put(i,scanner.nextInt());//存储价位
                map2.put(i,scanner.nextInt());//存储满意度
                map3.put(i,scanner.nextInt());//存储数量
            }
            Iterator iterator=map2.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry entry=(Map.Entry)iterator.next();
                int key=(Integer) entry.getKey();
                int value=(Integer) entry.getValue();
            }

        }

    }
}
