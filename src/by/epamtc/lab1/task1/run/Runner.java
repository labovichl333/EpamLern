package by.epamtc.lab1.task1.run;

import by.epamtc.lab1.task1.util.MathTool;
import by.epamtc.lab1.scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int number=DataScanner.scanConsoleInt();
        int answer= MathTool.lastDigit(MathTool.square(number));
        System.out.println("Ответ: "+answer);
    }
}
