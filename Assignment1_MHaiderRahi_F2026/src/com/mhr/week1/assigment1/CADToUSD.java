package com.mhr.week1.assigment1;

import java.util.Scanner;

public class CADToUSD {

    public void convertCADToUSD() {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter amount in CAD: ");
            double cad = scanner.nextDouble();

            // Exchange rate: 1 CAD = 0.7070 USD
            double exchangeRate = 0.7070;

            double usd = cad * exchangeRate;

            System.out.printf("Amount in USD: $%.2f%n", usd);
        }
    }
}