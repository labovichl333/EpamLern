package by.epamtc.lab1.task8.run;

import by.epamtc.lab1.scanner.DataScanner;
import by.epamtc.lab1.task8.util.FunctionСalculator;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Введите X");
        double x= DataScanner.scanConsoleDouble();
        double result;

        if(x>=3){
            result= FunctionСalculator.calculateFirstScript(x);
        }else {
            result= FunctionСalculator.calculateSecondScript(x);
        }
        System.out.println("Результат функции: "+result);
    }
}
