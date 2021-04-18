package by.epamtc.lab1.task9.util;

public class CircleTool {
    public static double calculateCircleArea(double radius) {
        if(radius<0){
            //здесь нужно выбросить своё исключение
        }
        double area=Math.PI*Math.pow(radius,2);
        return area;
    }

    public static double calculateCircleLength(double radius) {
        if(radius<0){
            //здесь нужно выбросить своё исключение
        }
        double length=2*Math.PI*radius;
        return length;
    }
}
