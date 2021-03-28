package by.epamtc.lab1.scanner;

import java.util.Scanner;

public class DataScanner {
   public static int scanConsoleInt(){
        int number;

        Scanner scanner=new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        number = scanner.nextInt();

        return number;
    }

    public static double scanConsoleDouble(){
        double number;

        Scanner scanner=new Scanner(System.in);

        while (!scanner.hasNextDouble()) {
            scanner.next();
        }
        number = scanner.nextDouble();

        return number;
    }
}
