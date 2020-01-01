package com.java.learning.functional;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * 2D Array
 * a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
 * standard input and printing them out to standard output.
 * b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
 * c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
 * d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
 * OutputStreamWriter to print the output to the screen.
 * @author Arun
 *
 */

public class TwoDArray<T> {
    public void printArray(T [][] array) {
        PrintWriter pw = new PrintWriter(System.out, true);
        for (T[] anArray : array) {
            for (T anAnArray : anArray) {
                pw.print(anAnArray+"\t");
            }
            pw.println();
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