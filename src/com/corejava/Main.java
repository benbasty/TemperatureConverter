package com.corejava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        while(true) {
            menu();
            int initialConversion = scanner.nextInt();
            if (initialConversion == 1) {
                System.out.print("Enter the amount of temperature Fahrenheit you want to convert ? ");
                double tempFarenheit = scanner.nextDouble();
                double tempCelcius = (tempFarenheit - 32) * 5/9;
                double Kelvin = (tempFarenheit - 32) * 5/9 + 273.15;
                System.out.println(tempFarenheit + " Degree Fahrenheit" + " = " + tempCelcius + " Degree Celsius");
                System.out.println(tempFarenheit + " Degree Fahrenheit" + " = " + Kelvin + " Kelvin");
                System.out.println();
            } else if (initialConversion == 2) {
                System.out.print("Enter the amount of temperature Celsius you want to convert ? ");
                double tempCelsius = scanner.nextDouble();
                double tempFarenheit = (tempCelsius * 9/5) + 32;
                double Kelvin = tempCelsius + 273.15;
                System.out.println(tempCelsius + " Degree Celsius" + " = " + tempFarenheit + " Degree Farenheit");
                System.out.println(tempCelsius + " Degree celsius" + " = " + Kelvin + " Kelvin");
                System.out.println();
            } else if (initialConversion == 3) {
                System.out.print("Enter the amount of temperature Kelvin you want to convert ? ");
                double Kelvin = scanner.nextDouble();
                double tempFarenheit = (Kelvin - 273.15) * 9/5 + 32;
                double tempCelsius = Kelvin - 273.15;
                System.out.println(Kelvin + " Kelvin" + " = " + tempFarenheit + " Degree Farenheit");
                System.out.println(Kelvin + " Kelvin" + " = " + tempCelsius + " Degree Celsius");
                System.out.println();
            } else if (initialConversion == 0) {
                System.out.println("Bye");
                break;
            } else {
                System.out.println("Please choose the numbers as indicated in the menu");
                System.out.println();
            }

        }
    }

    public static void menu() {
        System.out.println("Choose the initial converter or 0 to exit");
        System.out.println("\t1. Degree Farenheit (1)");
        System.out.println("\t2. Degree Celsius (2)");
        System.out.println("\t3. Degree Kelvin (3)");
        System.out.println("\t0. Exit");
        System.out.print("> ");
    }
}
