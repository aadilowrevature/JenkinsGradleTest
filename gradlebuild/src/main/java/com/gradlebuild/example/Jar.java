package com.gradlebuild.example;

import org.junit.runner.JUnitCore;

import java.util.Scanner;

public class Jar {
    public static void main(String[] args) {
        multiply();
    }

    private static void multiply() {
        int a = 0;
        int b = 0;
        int c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Multiply two numbers");
        System.out.println("A*B");
        System.out.println("Enter a number?");

        a = Integer.parseInt(scanner.nextLine());


        System.out.println("Enter a number?");


        b = Integer.parseInt(scanner.nextLine());

        c = a * b;
        System.out.println("____________________________");
        System.out.println("Result: " + a + " * " + b + " = " + c);
        System.out.println("____________________________");
    }
}
