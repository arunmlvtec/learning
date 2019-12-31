package com.java.learning.functional;

import java.util.Scanner;

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
