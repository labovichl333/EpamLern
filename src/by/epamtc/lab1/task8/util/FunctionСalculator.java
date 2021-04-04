package by.epamtc.lab1.task8.util;

public class FunctionСalculator {

    public static double calculateFirstScript(double x){
        double result=-Math.pow(x,2)+3*x+9;
        return result;
    }
    public static double calculateSecondScript(double x){
        double result=1/(Math.pow(x,3)-6);
        return result;
    }
    public static double calculateScript(double x){
        double result;
        if(x>=3){
            result= FunctionСalculator.calculateFirstScript(x);
        }else {
            result= FunctionСalculator.calculateSecondScript(x);
        }
        return result;
    }
}
