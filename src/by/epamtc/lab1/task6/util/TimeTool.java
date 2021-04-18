package by.epamtc.lab1.task6.util;

public class TimeTool {
    public static final int SECONDS_IN_MINUTE=60;
    public static final int SECONDS_IN_HOUR=3600;

    public static int convertToFullHours(int seconds) {
        if(seconds<0){
            //здесь нужно выбросить своё исключение
        }
        int fullHours=seconds/SECONDS_IN_HOUR;
        return fullHours;
    }

    public static int convertToFullMinutess(int seconds) {
        if(seconds<0){
            //здесь нужно выбросить своё исключение
        }
        int fullMinutes=(seconds-convertToFullHours(seconds)*SECONDS_IN_HOUR)/SECONDS_IN_MINUTE;
        return fullMinutes;
    }

    public static int convertToFullSeconds(int seconds) {
        if(seconds<0){
            //здесь нужно выбросить своё исключение
        }
        int fullSeconds=seconds-convertToFullHours(seconds)*SECONDS_IN_HOUR-convertToFullMinutess(seconds)*SECONDS_IN_MINUTE;
        return fullSeconds;
    }
}
