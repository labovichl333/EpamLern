package by.epamtc.lab1.task9.run;

import by.epamtc.lab1.scanner.DataScanner;
import by.epamtc.lab1.task2.util.YearsTool;
import by.epamtc.lab1.task9.util.CircleTool;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите радиус:");
        double radius;
        double area=-1;
        double length=-1;

        do{
            radius= DataScanner.scanConsoleDouble();
            if(radius<=0){
                System.out.println("Вы ввели не положительное число.\nВведите другое число");
            }
        }while (radius<=0);

        try {
            area= CircleTool.calculateCircleArea(radius);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

        try {
            length=CircleTool.calculateCircleLength(radius);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

        System.out.println("Площадь: "+area+" Длина: "+length);
    }
}
