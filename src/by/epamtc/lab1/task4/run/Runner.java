package by.epamtc.lab1.task4.run;

import by.epamtc.lab1.scanner.DataScanner;
import by.epamtc.lab1.task4.util.MathTool;

public class Runner {
    public static void main(String[] args) {
        int a,b,c,d;
        System.out.println("Введите число A:");
        a= DataScanner.scanConsoleInt();
        System.out.println("Введите число B:");
        b= DataScanner.scanConsoleInt();
        System.out.println("Введите число C:");
        c= DataScanner.scanConsoleInt();
        System.out.println("Введите число D:");
        d= DataScanner.scanConsoleInt();
        if(MathTool.ishaveEvenNumbers(2,a,b,c,d)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
