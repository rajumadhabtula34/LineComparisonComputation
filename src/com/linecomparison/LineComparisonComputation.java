package com.linecomparison;

public class LineComparisonComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation");

        Line line1 = new Line(
                new Point(2, 3),
                new Point(6, 7));

        Line line2 = new Line(
                new Point(1, 2),
                new Point(5, 8));

        Double length1 = line1.calculateLength();
        Double length2 = line2.calculateLength();

        System.out.println("Line 1 Length = " + length1);
        System.out.println("Line 2 Length = " + length2);

        if (length1.equals(length2)) {
            System.out.println("Both lines are equal.");
        } else {
            System.out.println("Both lines are not equal.");
        }

        int result = length1.compareTo(length2);

        if (result > 0) {
            System.out.println("Line 1 is greater than Line 2.");
        } else if (result < 0) {
            System.out.println("Line 1 is less than Line 2.");
        } else {
            System.out.println("Both lines are equal.");
        }
    }
}