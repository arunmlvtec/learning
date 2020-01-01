package com.java.learning.functional;

import java.util.Scanner;

/**
 * Write a program WindChill.java that takes two double command-line arguments t
 * and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
 * temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
 * National Weather Service defines the effective temperature (the wind chill) to be:
 *      w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16)
 * Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
 * than 120 or less than 3 (you may assume that the values you get are in that range).
 *
 * @author Arun
 *
 */
public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for temperature: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the value for wind speed: ");
        double windSpeed = scanner.nextDouble();
        double windChill = (35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * (Math.pow(windSpeed, 0.16)));
        System.out.println("Wind Chill for above temperature and Wind Speed is: " + windChill);
    }
}
