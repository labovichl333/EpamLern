package by.epamtc.lab1.task3.util;

public class AreaTool {
    public static double calculateCircleRadiusInscribedInSquare(double area )throws  IllegalArgumentException{
        if(area<=0){
            throw new IllegalArgumentException("Некоррекные входные данные");
        }
        double radius=Math.sqrt(area)/2;
        return radius;
    }
    public static double calculateSquareAreaInscribedInCircle(double radius ) throws IllegalArgumentException{
        if(radius<=0){
            throw new IllegalArgumentException("Некоррекные входные данные");
        }
        double area=2*radius*radius;
        return area;
    }

}
