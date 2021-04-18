package by.epamtc.lab1.task10.util;

public class Priter {
    public static void printTable(TableComponement[] table){
        if(table==null){
            //здесь нужно выбросить своё исключение
        }
        for (int i = 0; i <table.length; i++) {
            System.out.printf("%3f | %3f\n",table[i].getVaiue(),table[i].getResult());
        }
    }
}
