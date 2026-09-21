package com.la.week1.assign1;

public class MilesToKilometers {

    public double convert(double miles) {
        return miles * 1.60934;
    }

    public void displayConversion(double miles) {
        double kilometers = convert(miles);
        System.out.printf("%.2f miles = %.2f kilometers%n", miles, kilometers);
    }
}