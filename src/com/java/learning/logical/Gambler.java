package com.java.learning.logical;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class Gambler {
    public static void main (String[] args) {
        Gambler gambler = new Gambler();
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Enter Stake amount: ");
        int stake = scanInput.nextInt();
        System.out.print("Enter Goal amount: ");
        int goal = scanInput.nextInt();
        System.out.print("Enter N for number of iterations: ");
        int N = scanInput.nextInt();
        System.out.print("Enter the bet amount: ");
        int betAmount = scanInput.nextInt();
        List<GamblingResult> results = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            results.add(gambler.play(stake, goal, betAmount));
            System.out.println("Wins = " + results.get(i).getWins()
                    + "\tTotal Bets = " + results.get(i).getTotalBets());
        }
        IntSummaryStatistics totalStats = results.stream().mapToInt(GamblingResult::getTotalBets).summaryStatistics();
        IntSummaryStatistics winStats = results.stream().mapToInt(GamblingResult::getWins).summaryStatistics();
        System.out.println("Total Wins in N iterations: " + winStats.getSum());
        System.out.println("Average Wins in N iterations: " + winStats.getAverage());
        System.out.println("Total Losses in N iterations: " + (totalStats.getSum() - winStats.getSum()));
        System.out.println("Average Losses in N iterations: " + (totalStats.getSum() - winStats.getSum()) * 1.0 / N);
        System.out.println("Percentage Wins in N iterations: " + (winStats.getSum() * 1.0) / (totalStats.getSum()) * 100);
        System.out.println("Percentage Wins in N iterations: " + ((totalStats.getSum() - winStats.getSum()) * 1.0) / (totalStats.getSum()) * 100);
    }

    private GamblingResult play(int stake, int goal, int betAmount) {
        GamblingResult gamblingResult = new GamblingResult();
        while(stake > 0 && stake < goal) {
            double generatedRandomNumber = Math.random();
            if (generatedRandomNumber > 0.49) {
                stake += betAmount;
                gamblingResult.setWins(gamblingResult.getWins() + 1);
            }
            else {
                stake -= betAmount;
            }
            gamblingResult.setTotalBets(gamblingResult.getTotalBets() + 1);
        }
        return gamblingResult;
    }
}
