package Chapter4;

import java.math.BigInteger;
import java.util.Scanner;

//4.40 (World Population Growth) World population has grown considerably over the centuries.
//        Continued growth could eventually challenge the limits of breathable air, drinkable water, arable
//        cropland and other limited resources. There’s evidence that growth has been slowing in recent years
//        and that world population could peak some time this century, then start to decline.
//        For this exercise, research world population growth issues online. Be sure to investigate various
//        viewpoints. Get estimates for the current world population and its growth rate (the percentage by
//        which it’s likely to increase this year). Write a program that calculates world population growth
//        each year for the next 75 years, using the simplifying assumption that the current growth rate will stay
//        constant. Print the results in a table. The first column should display the year from year 1 to year
//        75. The second column should display the anticipated world population at the end of that year.
//        The third column should display the numerical increase in the world population that would occur
//        that year. Using your results, determine the year in which the population would be double what it
//        is today, if this year’s growth rate were to persist.
public class WorldPopulationGrowth {
    public static Scanner scanner = new Scanner(System.in);
    public static int year;
    public static String population;
    public static double growth;

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE WORLD POPULATION GROWTH APPLICATION");
        System.out.println("PLEASE KINDLY ENTER YOUR CURRENT YEAR");
        year = scanner.nextInt();

        System.out.println("KINDLY ENTER YOUR CURRENT POPULATION");
        population = scanner.next();

        System.out.println("KINDLY ENTER YOUR CURRENT POPULATION GROWTH");
        growth = scanner.nextInt();
        BigInteger value = new BigInteger(population);
        runWorldPopulationGrowth();
    }

    private static void runWorldPopulationGrowth() {
        System.out.printf("%s%15s%11s%n", "YEARS", "POPULATION", "GROWTH");
        for (int i = 0; i < 75; i++) {
            System.out.printf("%d%13s%14.2f%s", year+i, population + i,growth + i*0.18,"%");
            System.out.println();
        }

    }
}
