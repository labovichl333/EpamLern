package by.epamtc.lab1.task3.util;

public class AreaTool {
    public static double calculateCircleRadiusInscribedInSquare(double area ){
        if(area<=0){
            //здесь нужно выбросить своё исключение
        }
        double radius=Math.sqrt(area)/2;
        return radius;
    }
    public static double calculateSquareAreaInscribedInCircle(double radius ) {
        if(radius<=0){
            //здесь нужно выбросить своё исключение

        }
        double area=2*radius*radius;
        return area;
    }
    public static double calculateDifference(double var1,double var2){
        double difference=var1/var2;
        return difference;
    }

}
