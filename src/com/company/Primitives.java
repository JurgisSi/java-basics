package com.company;

public class Primitives {

    public static void main(String[] args) {

	    byte shoeSize = 50;                 // min: -128;                       max: 127
        short age = 5;                      // min: -32,768;                    max: 32,767
        int length = 890;                   // min: -2,147,483,648              max: 2,147,483,647
        long milliseconds = 845462168165L;  // min: -9,223,372,036,854,775,808  max: 9,223,372,036,854,775,807
        float weight = 80.69f;
        double height = 185.36;
        char grade = 'F';
        boolean on = true;                  // true / false



        System.out.println("Shoe size: " + shoeSize);
        System.out.println("Age: " + age);
        System.out.println("Length: " + length);
        System.out.println("Milliseconds: " + milliseconds);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is on: " + on);
    }
}
