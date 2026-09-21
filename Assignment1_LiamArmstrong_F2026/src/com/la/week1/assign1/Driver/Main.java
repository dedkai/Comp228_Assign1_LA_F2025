package com.la.week1.assign1.Driver;

import java.util.Scanner;

import com.la.week1.assign1.CadToUsd;
import com.la.week1.assign1.GradeCalculator;
import com.la.week1.assign1.LitersToGallons;
import com.la.week1.assign1.MilesToKilometers;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Task A: Grades
        System.out.println("===== Task A: Course Grades =====");
        GradeCalculator gradeCalculator = new GradeCalculator();

        System.out.print("Enter the number of courses: ");
        int numberOfCourses = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= numberOfCourses; i++) {
            System.out.print("Enter course name: ");
            String courseName = input.nextLine();

            System.out.print("Enter score for " + courseName + ": ");
            double score = input.nextDouble();
            input.nextLine();

            gradeCalculator.displayGrade(courseName, score);
        }

        // Task B: Miles to Kilometers
        System.out.println("\n===== Task B: Miles to Kilometers =====");
        MilesToKilometers milesConverter = new MilesToKilometers();

        System.out.print("Enter miles: ");
        double miles = input.nextDouble();

        milesConverter.displayConversion(miles);

        // Task C: Liters to Gallons
        System.out.println("\n===== Task C: Liters to Gallons =====");
        LitersToGallons litersConverter = new LitersToGallons();

        System.out.print("Enter liters: ");
        double liters = input.nextDouble();

        litersConverter.displayConversion(liters);

        // Task D: CAD to USD
        System.out.println("\n===== Task D: CAD to USD =====");
        CadToUsd currencyConverter = new CadToUsd();

        System.out.print("Enter amount in Canadian dollars: ");
        double canadianDollars = input.nextDouble();

        currencyConverter.displayConversion(canadianDollars);

        input.close();
    }
}