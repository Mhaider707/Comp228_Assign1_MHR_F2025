package com.mhr.week1.assigment1;

import java.util.Scanner;

public class LitersToGallons {

    public void convertLitersToGallons() {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter volume in liters: ");
            double liters = scanner.nextDouble();

            double gallons = liters * 0.264172;

            System.out.println("Volume in gallons: " + gallons);
        }
    }
}