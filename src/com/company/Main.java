package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координату x первой точки: ");
        double x1 = in.nextDouble();
        System.out.println("Введите координату y первой точки: ");
        double x2 = in.nextDouble();
        System.out.println("Введите координату x второй точки: ");
        double x3 = in.nextDouble();
        System.out.println("Введите координату y второй точки: ");
        double x4 = in.nextDouble();

        point point = new point(x1,x2,x3,x4);

        System.out.println("Расстояние между точками = "+point.PointDistanceCalculator());

    }
}