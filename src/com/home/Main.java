package com.home;

import jdk.jfr.Percentage;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Principal: 100000
        //Annual Interest Rate : 3,92
        // Period ( Years) : 30
        // Mortgage : $472.81
        final byte Percent = 100;
        final byte Months_In_Year = 12;

        Scanner tarayici = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        float principal = tarayici.nextFloat();

        System.out.print("Annual Interest Rate : ");
        float annual_Interest_Rate = tarayici.nextFloat();
        float monthly_Interest_Rate = annual_Interest_Rate/ Percent/Months_In_Year;

        System.out.print("Period : ");
        int years = tarayici.nextInt();
        int numberOfPayments = years * Months_In_Year;


        double Mortgage = principal *monthly_Interest_Rate* Math.pow(1 + monthly_Interest_Rate, numberOfPayments)
                         / (Math.pow(1 + monthly_Interest_Rate, numberOfPayments) - 1 );

        System.out.println("Mortgage: " + Mortgage);











    }
}
