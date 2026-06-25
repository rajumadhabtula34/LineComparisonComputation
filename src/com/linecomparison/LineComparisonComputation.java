package com.linecomparison;

public class LineComparisonComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation");

        int x1 = 2;
        int y1 = 3;
        int x2 = 6;
        int y2 = 7;

        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Length of the Line = " + length);
    }
}