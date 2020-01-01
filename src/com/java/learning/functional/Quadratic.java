package com.java.learning.functional;


import java.util.Scanner;

/**
 * Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
 * Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
 * can be found using a formula (Note: Take a, b and c as input values)
 * delta = b*b - 4*a*c
 * Root 1 of x = (-b + sqrt(delta))/(2*a)
 * Root 2 of x = (-b - sqrt(delta))/(2*a)
 *
 * @author Arun
 *
 */
public class Quadratic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for 1st constant a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value for 2nd constant b: ");
        int b = scanner.nextInt();
        System.out.print("Enter value for 3rd constant c: ");
        int c = scanner.nextInt();
        Quadratic q = new Quadratic();
        q.printRoots(a, b, c);
    }

    private void printRoots(int a, int b, int c) {
        double delta = ((b*b * 1.0) - (4 * a * c * 1.0));
        double firstQuadraticRoot = (((-1.0 * b) + Math.pow(delta, 0.5)) / (2.0 * a));
        double secondQuadraticRoot = (((-1.0 * b) - Math.pow(delta, 0.5)) / (2.0 * a));
        System.out.println("First Quadratic root is: "+ firstQuadraticRoot);
        System.out.println("Second Quadratic root is: "+ secondQuadraticRoot);
    }
}
