package by.epamtc.lab1.task1.util;

public class MathTool {
    public static int square(int num){
        int answer=num*num;
        return answer;
    }
    public static int lastDigit(int num){
        int lastDigit=num%10;
        return lastDigit;
    }
}
