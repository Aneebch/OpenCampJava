package Strings;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the name");
        String name = scanner.nextLine();
        System.out.println("Introduce the number");
        int number = scanner.nextInt();

        System.out.println("Introduced name is " + name);
        System.out.println("Introduced number is " + number);
        System.out.println("Hola Mundo");
    }
}
