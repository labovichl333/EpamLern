package by.epamtc.lab1.task6.run;

import by.epamtc.lab1.scanner.DataScanner;
import by.epamtc.lab1.task2.util.YearsTool;
import by.epamtc.lab1.task6.util.TimeTool;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите число секунд:");
        int seconds;
        int sec;
        int min;
        int hour;

        do{
            seconds= DataScanner.scanConsoleInt();
            if(seconds<=0){
                System.out.println("Вы ввели не натуральное число.\nВведите другое число");
            }
        }while (seconds<=0);

        sec= TimeTool.convertToFullSeconds(seconds);
        min=TimeTool.convertToFullMinutess(seconds);
        hour=TimeTool.convertToFullHours(seconds);

        System.out.println("Прошло "+hour+" часов "+min+" минут "+sec+" секунд");
    }
}
