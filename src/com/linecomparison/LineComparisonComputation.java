package com.linecomparison;

public class LineComparisonComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation");

        // Line 1
        int x1 = 2;
        int y1 = 3;
        int x2 = 6;
        int y2 = 7;

        // Line 2
        int x3 = 1;
        int y3 = 2;
        int x4 = 5;
        int y4 = 6;

        Double line1Length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        Double line2Length = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

        System.out.println("Line 1 Length = " + line1Length);
        System.out.println("Line 2 Length = " + line2Length);

        if (line1Length.equals(line2Length)) {
            System.out.println("Both lines are equal.");
        } else {
            System.out.println("Both lines are not equal.");
        }
    }
}