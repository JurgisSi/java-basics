package com.company;

public class Loops {

    public static void main(String[] args) {
        forLoop();
        whileLoop();
        doWhileLoop();
    }

    private static void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " for");
        }
    }

    private static void whileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i++ + " while");
        }
    }

    private static void doWhileLoop() {
        int i = 0;
        do {
            System.out.println(i++ + " do while");
        } while (i < 10);
    }
}
