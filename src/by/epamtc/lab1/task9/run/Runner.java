package by.epamtc.lab1.task9.run;

import by.epamtc.lab1.scanner.DataScanner;
import by.epamtc.lab1.task9.util.CircleTool;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите радиус:");
        double radius;
        double area;
        double length;

        do{
            radius= DataScanner.scanConsoleDouble();
            if(radius<=0){
                System.out.println("Вы ввели не положительное число.\nВведите другое число");
            }
        }while (radius<=0);

        area= CircleTool.calculateCircleArea(radius);
        length=CircleTool.calculateCircleLength(radius);

        System.out.println("Площадь: "+area+" Длина: "+length);
    }
}
