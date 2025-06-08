package com.example;
import java.util.*;

class Ops {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int divd(int a, int b) {
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Ops ops = new Ops(); // create object

        System.out.println("Addition: " + ops.add(a, b));
        System.out.println("Subtraction: " + ops.subtract(a, b));
        System.out.println("Multiplication: " + ops.mult(a, b));
        if (b != 0) {
            System.out.println("Division: " + ops.divd(a, b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        sc.close();
    }
}
