package bishi.souhu;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-25 21:57:39
 **/
public class Main4 {
    public static volatile boolean isNum = true ;
    public static Object obj = new Object();
    //打印数字 每次打印两个数字
    class PrintNums extends Thread{
        private int[] nums ;
        public PrintNums (int[] nums)
        {
            this.nums = nums;
        }
        @Override
        public void run() {
            synchronized (obj){
                for(int i = 0 ;i<nums.length;){
                    if(isNum){
                        System.out.print(nums[i]+""+nums[i+1]);//这里已知数组长度为偶数个才能这么用
                        isNum= false ;
                        obj.notify();//唤醒其他线程
                        i = i + 2 ;//注意i的增长在这里
                    }else {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

    }
    //打印字母 每次打印一个字母
    class PrintLetters extends Thread {
        private char[] letters;

        public PrintLetters(char[] letters) {
            this.letters = letters;
        }

        @Override
        public void run() {
            synchronized (obj) {
                for (int i = 0; i < letters.length;) {
                    if (isNum  == false) {
                        System.out.print(letters[i]);
                        isNum = true;
                        obj.notify();
                        i = i + 1;//注意i的增长在这里
                    } else {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static void main(String args[]){
       Main4 a = new Main4();
        a.test();
    }

    private void test() {
        //生成数组
        int[] nums = new int[52];
        for(int i = 0 ; i<52;i++){
            nums[i] = i+1;
        }
        char[] letters = new char[26];
        for(int i = 0 ;i < 26;i++){
            letters[i] = (char)('a'+i);
        }
        //开启两个线程
        new PrintNums(nums).start();
        new PrintLetters(letters).start();
    }
}
