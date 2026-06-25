package com.linecomparison;

public class Line {

    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Double calculateLength() {

        return Math.sqrt(
                Math.pow(endPoint.x - startPoint.x, 2)
              + Math.pow(endPoint.y - startPoint.y, 2));
    }
}
