package estructureControl;

import java.util.Scanner;

public class MultipleFive {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num;

        System.out.println("Introduce the Number here:");
        num = keyboard.nextInt();

        if (num % 5 == 0){
            System.out.println("Number is Multiple of 5");
        } else {
            System.out.println("Number is not Multiple of 5");
        }


    }
}
