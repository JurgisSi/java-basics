package com.company;

import java.net.HttpURLConnection;

public class Conditionals {

    public static void main(String[] args) {
        ifClause();
        switchClause();
        enhancedSwitchClause();
    }

    private static void ifClause() {
        int number = 7;

        if ((number % 3 == 0) && (number % 5 == 0)) {
            System.out.println("Foo Bar");
        } else if (number % 3 == 0) {
            System.out.println("Foo");
        } else if (number % 5 == 0) {
            System.out.println(("Bar"));
        } else {
            System.out.println(number);
        }
    }

    private static void switchClause() {
        int responseCode = HttpURLConnection.HTTP_BAD_REQUEST;
        switch (responseCode) {
            case HttpURLConnection.HTTP_OK:
                System.out.println("Ok");
                break;
            case HttpURLConnection.HTTP_CREATED:
                System.out.println("Created");
                break;
            case HttpURLConnection.HTTP_BAD_REQUEST:
                System.out.println("Client error");
                break;
            case HttpURLConnection.HTTP_INTERNAL_ERROR:
                System.out.println("Server error");
                break;
            default:
                System.out.println("Unknown");
        }
    }

    private static void enhancedSwitchClause() {
        int responseCode = HttpURLConnection.HTTP_INTERNAL_ERROR;
        switch (responseCode) {
            case HttpURLConnection.HTTP_OK -> System.out.println("Ok");
            case HttpURLConnection.HTTP_CREATED -> System.out.println("Created");
            case HttpURLConnection.HTTP_BAD_REQUEST -> System.out.println("Client error");
            case HttpURLConnection.HTTP_INTERNAL_ERROR -> System.out.println("Server error");
            default -> System.out.println("Unknown");
        }
    }
}
