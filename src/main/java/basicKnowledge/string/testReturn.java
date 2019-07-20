package basicKnowledge.string;

public class testReturn {
    public static void main(String[] args) {
        System.out.println(
                test()
        );
    }
    public static int test(){
        int i=0;
        try {
            i++;
            throw new Exception("");
        }catch (Exception e){
            return i++;
        }finally {
            i++;
        }

    }
}
