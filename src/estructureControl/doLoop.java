package estructureControl;

import java.util.Scanner;

public class doLoop {

    public static void main(String[] args) {

        Scanner keyword = new Scanner(System.in);

        int num;
        boolean incorrect = true;

        do {
            System.out.println("Introduce the number here");
            num = keyword.nextInt();

            if (num >0){
                System.out.println("Number is correct");
            } else {
                System.out.println("Number is not correct");
            }
        } while (incorrect);
    }
}
