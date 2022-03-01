package com.swedbank.basics;

public class Loops {

    public static void main(String[] args) {
        System.out.println("For loop:");
        forLoop();

        System.out.println("\nWhile loop:");
        whileLoop();

        System.out.println("\nDo while loop:");
        doWhileLoop();
    }

    private static void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    private static void whileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i++);
        }
    }

    private static void doWhileLoop() {
        int i = 0;
        do {
            System.out.println(i++);
        } while (i < 10);
    }
}
