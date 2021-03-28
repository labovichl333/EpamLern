package by.epamtc.lab1.task6.run;

import by.epamtc.lab1.scanner.DataScanner;
import by.epamtc.lab1.task2.util.YearsTool;
import by.epamtc.lab1.task6.util.TimeTool;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите число секунд:");
        int seconds;
        int sec=-1;
        int min=-1;
        int hour=-1;

        do{
            seconds= DataScanner.scanConsoleInt();
            if(seconds<=0){
                System.out.println("Вы ввели не натуральное число.\nВведите другое число");
            }
        }while (seconds<=0);

        try {
            sec= TimeTool.convertToFullSeconds(seconds);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

        try {
            min=TimeTool.convertToFullMinutess(seconds);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        try {
            hour=TimeTool.convertToFullHours(seconds);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

        System.out.println("Прошло "+hour+" часов "+min+" минут "+sec+" секунд");
    }
}
