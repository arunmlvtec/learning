package com.java.learning.logical;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * Coupon Numbers
 * a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
 * need to generate distinct coupon number? This program simulates this random
 * process.
 * b. I/P -> N Distinct Coupon Number
 * c. Logic -> repeatedly choose a random number and check whether it's a new one.
 * d. O/P -> total random number needed to have all distinct numbers.
 * e. Functions => Write Class Static Functions to generate random number and to
 * process distinct coupons.
 *
 * @author Arun
 *
 */

public class CouponNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the count of Coupon Numbers: ");
        int countCouponNumbers = scanner.nextInt();
        long totalAttempts = generateCouponNumbers(countCouponNumbers);
        System.out.println("Total Attempts needed to generate "+countCouponNumbers+", is: "+ totalAttempts);
    }

    static long generateCouponNumbers(int countCouponNumbers) {
        Set<Integer> distinctCouponNumbers = new HashSet<>();
        Random random = new Random();
        long totalCount = 0;
        int setCount = 0;
        while (setCount < countCouponNumbers){
            Integer couponNumber = random.nextInt(Integer.MAX_VALUE);
            if (!distinctCouponNumbers.contains(couponNumber)) {
                setCount += 1;
                distinctCouponNumbers.add(couponNumber);
            }
            totalCount += 1;
        }
        return totalCount;
    }
}
