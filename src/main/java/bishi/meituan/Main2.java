package bishi.meituan;

import java.util.Scanner;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-16 14:54:18
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        ReviewEncourage reviewEncourage=new ReviewEncourage(n);
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
            }
        });
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        for (int i = 1; i <=n ; i++) {
            if (i%2!=0) {
                System.out.print("A");
            }else{
                if (flag){
                    System.out.print("B");
                    flag=false;
                }else{
                    System.out.print("C");
                    flag=true;
                }
            }
        }
    }
    static class ReviewEncourage {
        int n;
        PrizePool prizePool;
        public ReviewEncourage(int n) {
            this.n=n;
            this.prizePool=new PrizePool();
            if (n%2!=0) {

            }else{

            }
        }      // 构造函数,n为中奖用户数
        public void bonus(PrizePool prizePool) {
           prizePool.send("A");
        }  // 仅能打印A，表示发放积分

        public void coupon(PrizePool prizePool) {
            prizePool.send("B");
        }  // 仅能打印B，表示发放优惠券

        public void contribution(PrizePool prizePool) {
            prizePool.send("C");
        }  // 仅能打印C，表示发放贡


      static  class PrizePool {

         public void send(String input) {

             System.out.print(input);

         }
     }

    }



}
