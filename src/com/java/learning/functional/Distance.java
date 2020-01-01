package com.java.learning.functional;

import java.util.Scanner;

/**
 * Write a program Distance.java that takes two integer command-line arguments x
 * and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
 * formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
 * @author Arun
 *
 */
public class Distance {
    void printDistance(int x, int y) {
        System.out.println(Math.pow(((x*x) + (y*y)), 0.5));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Distance distance = new Distance();
        System.out.print("Enter x coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = scanner.nextInt();
        distance.printDistance(x, y);
    }
}
