package by.epamtc.lab1.task5.run;

import by.epamtc.lab1.scanner.DataScanner;
import by.epamtc.lab1.task5.util.MathTool;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число:");
        int num;

        do{
            num= DataScanner.scanConsoleInt();
            if(num<=0){
                System.out.println("Вы ввели не натуральное число.\nВведите другое число");
            }
        }while (num<=0);

        System.out.println(MathTool.isNumberPerfect(num));

    }
}
