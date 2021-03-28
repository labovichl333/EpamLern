package by.epamtc.lab1.task2.run;

import by.epamtc.lab1.scanner.DataScanner;
import by.epamtc.lab1.task2.util.YearsTool;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите год:");
        int year;
        int month;
        int days=0;
        do{
            year= DataScanner.scanConsoleInt();
            if(year<=0){
                System.out.println("Год должен быть больше 0.\nВведите другй год");
            }
        }while (year<=0);

        System.out.println("Введите номер месяца:");
        do{
            month= DataScanner.scanConsoleInt();
            if(month<=0 || month>12){
                System.out.println("Номер месяца должен быть в диапазоне от 1 до 12.\nВведите другой номер месяца");
            }
        }while (month<=0 || month>12);

        try {
            days= YearsTool.calculateNumberDaysInMonth(month,year);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        System.out.println("Количество дней : "+days);
        if(YearsTool.isLeapYear(year)){
            System.out.println("Год високосный");
        }else {
            System.out.println("Год не високосный");
        }
    }
}
