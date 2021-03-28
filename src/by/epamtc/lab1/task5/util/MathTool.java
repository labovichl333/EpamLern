package by.epamtc.lab1.task5.util;

public class MathTool {
    public static boolean isNumberPerfect(int number){
        boolean flag=false;
        int sum=0;
        for (int i = 1; i <number; i++) {
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number){
            flag=true;
        }
        return flag;
    }
}
