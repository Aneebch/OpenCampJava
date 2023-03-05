package Strings;

public class TryCatchMain {

    public static void main(String[] args) {
        try {
            int result = 5 / 5;
        } catch (ArithmeticException e){
            e.printStackTrace();
        } finally {
            System.out.println("Resources ended.");
        }


        System.out.println("fin");
    }
}
