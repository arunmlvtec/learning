package com.java.learning.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Sum of three Integer adds to ZERO
 * a. Desc -> A program with cubic running time. Read in N integers and counts the
 * number of triples that sum to exactly 0.
 * b. I/P -> N number of integer, and N integer input array
 * c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
 * d. O/P -> One Output is number of distinct triplets as well as the second output is to
 * print the distinct triplets.
 *
 * @author Arun
 *
 */

public class AddsToZero {
    private void printNumsThatAddsToZero(int[] inputArray) {
        List<ArrayList<Integer>> distinctPairs = new ArrayList<>();
        int totalPairs = 0;
        for(int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length - 1; j++) {
                for (int k = j + 1; k < inputArray.length - 2; k++) {
                    if ((inputArray[i] + inputArray[j] + inputArray[k]) == 0) {
                        totalPairs += 1;
                        distinctPairs.add(new ArrayList<>(Arrays.asList(inputArray[i], inputArray[j], inputArray[k])));
                    }
                }
            }
        }
        System.out.println("Total Distinct pairs are: "+totalPairs);
        for(ArrayList<Integer> values: distinctPairs) {
            for(Integer value: values) {
                System.out.print(value+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AddsToZero addsToZero = new AddsToZero();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int arrayLength = scanner.nextInt();
        int[] inputArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            inputArray[i] = scanner.nextInt();
        }
        addsToZero.printNumsThatAddsToZero(inputArray);
    }
}
