package leetcode.string;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-07-29 19:41:51
 **/
public class ClassA {
    String arrtribute;

    public String getArrtribute() {
        return arrtribute;
    }

    public void setArrtribute(String arrtribute) {
        this.arrtribute = arrtribute;
    }
    public ClassA(String arrtribute){
        this.arrtribute=arrtribute;
    }

    public static void main(String[] args) {
        String a="aaa";
        ClassA ca=new ClassA("aaa");
        String b=a;
        a="bbb";
        System.out.println(ca.arrtribute);
        ca.arrtribute="bbb";
        System.out.println(b);
        System.out.println(ca.arrtribute);
    }
}
