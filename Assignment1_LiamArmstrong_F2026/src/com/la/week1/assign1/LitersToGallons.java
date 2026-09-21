package com.la.week1.assign1;

public class LitersToGallons {

    public double convert(double liters) {
        return liters * 0.264172;
    }

    public void displayConversion(double liters) {
        double gallons = convert(liters);
        System.out.printf("%.2f liters = %.2f gallons%n", liters, gallons);
    }
}