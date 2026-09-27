package com.mhr.week1.assigment1.Driver;

import java.util.Scanner;

import com.mhr.week1.assigment1.GradeCalculation;
import com.mhr.week1.assigment1.MilesToKilometers;
import com.mhr.week1.assigment1.LitersToGallons;
import com.mhr.week1.assigment1.CADToUSD;

public class DriverMain {

    public static void main(String[] args) {

        GradeCalculation gc = new GradeCalculation();
        MilesToKilometers mk = new MilesToKilometers();
        LitersToGallons lg = new LitersToGallons();
        CADToUSD cu = new CADToUSD();

        System.out.println(
            "Enter the choice for operation 1-GradeCalculation, "
            + "2-MilesToKms, 3-LitersToGallons, 4-CADToUSD");

        try (Scanner sc = new Scanner(System.in)) {

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Doing Grade Calculation.. ");
                    gc.GradeCalc();
                    break;

                case 2:
                    System.out.println("Doing Miles to Kilometers Conversion.. ");
                    mk.convertMilesToKilometers();
                    break;

                case 3:
                    System.out.println("Doing Liters to Gallons Conversion.. ");
                    lg.convertLitersToGallons();
                    break;

                case 4:
                    System.out.println("Doing CAD to USD Conversion.. ");
                    cu.convertCADToUSD();
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}