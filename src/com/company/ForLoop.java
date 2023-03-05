package com.company;

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if(i == 6)
                continue;
            System.out.println(i + " Hello world");
        }
        System.out.println("fin");
    }
}
