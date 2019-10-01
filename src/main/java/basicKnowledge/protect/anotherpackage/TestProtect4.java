package basicKnowledge.protect.anotherpackage;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-10-01 21:04:03
 **/
public class TestProtect4 {
    private int province;
    private int cityNo;

    public TestProtect4() {
    }

    public TestProtect4(int province, int cityNo) {
        this.province = province;
        this.cityNo = cityNo;
    }

    public static void main(String[] args) {
        TestProtect4 testProtect4=new TestProtect4();
        try {
            testProtect4.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
