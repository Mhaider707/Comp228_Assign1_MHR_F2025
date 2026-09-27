package com.mhr.week1.assigment1;

import java.util.Scanner;

public class MilesToKilometers {

    public void convertMilesToKilometers() {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter distance in miles: ");
            double miles = scanner.nextDouble();

            double kilometers = miles * 1.60934;

            System.out.println("Distance in kilometers: " + kilometers);
        }
    }
}