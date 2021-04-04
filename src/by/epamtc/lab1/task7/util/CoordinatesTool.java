package by.epamtc.lab1.task7.util;

public class CoordinatesTool {

   public static double calculateDistanceToStart(double x,double y){
        double distanse=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return distanse;
    }

    public static String crateMassegeAboutDistanseToStart(double a,double b,String aEqualB ,String aMoreB,String aLessB ) {
        String massage =aEqualB;
        if (a > b) {
            massage =aMoreB;
        } else if (a < b) {
            massage =aLessB;
        }
        return massage;
    }
}
