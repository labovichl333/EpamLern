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
        String str0="Точки А и В находятся на одинаковом расстоянии от начала координат";
        String str1="Точка А ближе к началу координат";
        String str2="Точка В ближе к началу координат";
        String massage=CoordinatesTool.crateMassegeAboutDistanseToStart(dist1,dist2,str0,str1,str2);
        System.out.println(massage);
    }
}
