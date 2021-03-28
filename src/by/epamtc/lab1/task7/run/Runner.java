package by.epamtc.lab1.task7.run;

import by.epamtc.lab1.scanner.DataScanner;
import by.epamtc.lab1.task7.util.CoordinatesTool;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите координату X точки А");
        double x1= DataScanner.scanConsoleDouble();
        System.out.println("Введите координату Y точки А");
        double y1= DataScanner.scanConsoleDouble();
        System.out.println("Введите координату X точки B");
        double x2= DataScanner.scanConsoleDouble();
        System.out.println("Введите координату Y точки B");
        double y2= DataScanner.scanConsoleDouble();

        double dist1= CoordinatesTool.calculateDistanceToStart(x1,y1);
        double dist2= CoordinatesTool.calculateDistanceToStart(x2,y2);

        if(dist1>dist2){
            System.out.println("Точка А ближе к началу координат");
        }else if(dist1<dist2){
            System.out.println("Точка В ближе к началу координат");
        }else {
            System.out.println("Точки А и В находятся на одинаковом расстоянии от начала координат");
        }
    }
}
