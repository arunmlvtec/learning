package com.java.learning.functional;

import java.util.Scanner;

public class TwoDArray<T> {
    public void printArray(T [][] array) {
        for (T[] anArray : array) {
            for (T anAnArray : anArray) {
                System.out.println(anAnArray);
            }
        }
    }

    public void populate2DArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scan.nextInt();
        System.out.println("Enter the number of columns");
        int cols = scan.nextInt();
        System.out.println("Enter Elements of this array");
        Scanner inputArrayScan = new Scanner(System.in);

    }
}