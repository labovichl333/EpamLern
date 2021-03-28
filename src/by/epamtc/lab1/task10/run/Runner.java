package by.epamtc.lab1.task10.run;

import by.epamtc.lab1.scanner.DataScanner;
import by.epamtc.lab1.task10.util.Table;
import by.epamtc.lab1.task10.util.WorkWithFunction;
import by.epamtc.lab1.task2.util.YearsTool;

public class Runner {
    public static void main(String[] args) {
        double start;
        double end;
        double step;
        Table[] table=null;
        System.out.println("Введите начало диапазона:");
        start= DataScanner.scanConsoleDouble();

        System.out.println("Введите конец диапазона:");
        do{
            end= DataScanner.scanConsoleDouble();
            if(end<=start){
                System.out.println("Конец диапазона должен быть больне начала.\nВведите другое число");
            }
        }while (end<=start);

        System.out.println("Введите шаг:");
        do{
            step= DataScanner.scanConsoleDouble();
            if(step<=0){
                System.out.println("Шаг должен быть больше 0.\nВведите другое число");
            }
        }while (step<=0);

        try {
            table=WorkWithFunction.calculateFunction(start,end,step);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        WorkWithFunction.printTable(table);
    }
}
