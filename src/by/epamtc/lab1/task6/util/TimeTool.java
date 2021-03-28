package by.epamtc.lab1.task6.util;

public class TimeTool {
    public static final int SECONDS_IN_MINUTE=60;
    public static final int SECONDS_IN_HOUR=3600;

    public static int convertToFullHours(int seconds) throws IllegalArgumentException{
        if(seconds<0){
            throw new IllegalArgumentException("Некоррекные входные данные");
        }
        int fullHours=seconds/SECONDS_IN_HOUR;
        return fullHours;
    }

    public static int convertToFullMinutess(int seconds) throws IllegalArgumentException{
        if(seconds<0){
            throw new IllegalArgumentException("Некоррекные входные данные");
        }
        int fullMinutes=(seconds-convertToFullHours(seconds)*SECONDS_IN_HOUR)/SECONDS_IN_MINUTE;
        return fullMinutes;
    }

    public static int convertToFullSeconds(int seconds) throws IllegalArgumentException{
        if(seconds<0){
            throw new IllegalArgumentException("Некоррекные входные данные");
        }
        int fullSeconds=seconds-convertToFullHours(seconds)*SECONDS_IN_HOUR-convertToFullMinutess(seconds)*SECONDS_IN_MINUTE;
        return fullSeconds;
    }
}
