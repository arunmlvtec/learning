package com.java.learning.functional;

import java.util.Scanner;

public class TwoDArray<T> {
    public void printArray(T [][] array) {
        for (T[] anArray : array) {
            for (T anAnArray : anArray) {
                System.out.print(anAnArray+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TwoDArray twoDArray = new TwoDArray();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scan.nextInt();
        System.out.println("Enter the number of columns");
        int cols = scan.nextInt();
        System.out.println("Enter Elements of this array");
        Scanner inputArrayScan = new Scanner(System.in);
        if (inputArrayScan.hasNextBoolean()) {
            Boolean[][] inputArray = new Boolean[rows][cols];
            for (int i = 0; i < inputArray.length; i++) {
                for (int j = 0; j < inputArray[i].length; j++) {
                    inputArray[i][j] = inputArrayScan.nextBoolean();
                }
            }
            twoDArray.printArray(inputArray);
        }
        else if (inputArrayScan.hasNextInt()) {
            Integer[][] inputArray = new Integer[rows][cols];
            for (int i = 0; i < inputArray.length; i++) {
                for (int j = 0; j < inputArray[i].length; j++) {
                    inputArray[i][j] = inputArrayScan.nextInt();
                }
            }

            twoDArray.printArray(inputArray);
        }
        else if (inputArrayScan.hasNextDouble()) {
            Double[][] inputArray = new Double[rows][cols];
            for (int i = 0; i < inputArray.length; i++) {
                for (int j = 0; j < inputArray[i].length; j++) {
                    inputArray[i][j] = inputArrayScan.nextDouble();
                }
            }

            twoDArray.printArray(inputArray);
        }
        else {
            System.out.println("Invalid input!");
        }
    }
}