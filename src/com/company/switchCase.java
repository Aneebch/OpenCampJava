package com.company;

public class switchCase {

    public static void main(String[] args) {

        String weather = "sunny";

        switch (weather) {
            case "sunny":
                System.out.println("Its sunny");
                break;
            case "cloudy":
                System.out.println("its cloudy");
                break;
            default:
                System.out.println("We don't know the weather!!");
        }
    }
}
