package com.swedbank.basics;

import java.time.Year;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        primitiveArray();
        objectArray();
    }

    private static void primitiveArray() {
        double[] prices = new double[5];
        print(prices);
        prices[0] = 1.25;
        prices[3] = 7.05;
        print(prices);
    }

    private static void objectArray() {
        Year[] years = new Year[7];
        print(years);
        years[1] = Year.of(2022);
        years[2] = Year.of(1999);
        years[6] = Year.of(2001);
        print(years);
    }

    private static void print(double[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static <T> void print(T[] array) {
        System.out.println(Arrays.toString(array));
    }
}
