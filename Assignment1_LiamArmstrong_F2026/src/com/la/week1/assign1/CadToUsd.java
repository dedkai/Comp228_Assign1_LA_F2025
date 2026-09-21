package com.la.week1.assign1;

public class CadToUsd {

    public double convert(double canadianDollars) {
        return canadianDollars * 0.71;
    }

    public void displayConversion(double canadianDollars) {
        double usDollars = convert(canadianDollars);
        System.out.printf("%.2f CAD = %.2f USD%n", canadianDollars, usDollars);
    }
}