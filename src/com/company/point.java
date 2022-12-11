package com.company;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class point {
    public double pointX1;
    public double pointY1;
    public double pointX2;
    public double pointY2;
    public double distance;


    public point(double pointX1, double pointY1, double pointX2, double pointY2){

        Scanner in = new Scanner(System.in);
        this.pointX1 = pointX1;
        this.pointY1 = pointY1;
        this.pointX2 = pointX2;
        this.pointY2 = pointY2;

    }
    public double PointDistanceCalculator() {
        distance = sqrt((pointX2-pointX1)*(pointX2-pointX1) + (pointY2-pointY1)*(pointY2-pointY1));
        return distance;
    }

}
