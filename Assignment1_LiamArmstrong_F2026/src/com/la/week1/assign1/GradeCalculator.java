package com.la.week1.assign1;

public class GradeCalculator {

    public char calculateGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void displayGrade(String courseName, double score) {
        char grade = calculateGrade(score);
        System.out.printf("%s: %.2f - Grade %c%n", courseName, score, grade);
    }
}