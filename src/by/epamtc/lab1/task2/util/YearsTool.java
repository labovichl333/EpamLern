package by.epamtc.lab1.task2.util;

public class YearsTool {

    public static boolean isLeapYear(int year){
        if(year<0){
            //выбросить своё исключение
        }
        boolean answer=false;
        if((year%4==0 && year%100!=0) || (year%100==0 && year%400==0)){
            answer=true;
        }
        return  answer;
    }

    public static int calculateNumberDaysInMonth(int month,int year) {
        int days;
        if(month<1 || month>12 || year<=0){
            //здесь нужно выбросить своё исключение
        }
        switch (month){
            case 2 :
                days=28;
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                days=30;
                break;
            default:
                days=31;
        }
        if(month==2 && isLeapYear(year)){
            days=29;
        }
        return days;
    }
}
