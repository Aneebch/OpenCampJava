package com.company;

public class ForIFLoop {

    public static void main(String[] args) {
        int limit = 20;
        System.out.println("Show Even numbers until 20");

        for (int counter = 0; counter <= 20; counter ++){
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
        }
    }
}
