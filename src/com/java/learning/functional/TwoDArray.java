package com.java.learning.functional;

public class TwoDArray {
    public void printArray(int [][] array) {
        for (int[] anArray : array) {
            for (int anAnArray : anArray) {
                System.out.println(anAnArray);
            }
        }
    }

    public void printArray(double [][] array) {
        for (double[] anArray : array) {
            for (double anAnArray : anArray) {
                System.out.println(anAnArray);
            }
        }
    }

    public void printArray(Boolean [][] array) {
        for (Boolean[] anArray : array) {
            for (Boolean anAnArray : anArray) {
                System.out.println(anAnArray);
            }
        }
    }
}
