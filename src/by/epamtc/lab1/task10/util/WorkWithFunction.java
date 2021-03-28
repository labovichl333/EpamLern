package by.epamtc.lab1.task10.util;

public class WorkWithFunction {
    public static Table[] calculateFunction(double start,double end,double step) throws IllegalArgumentException{
        if(start-end<=0 || step<=0){
            throw new IllegalArgumentException("Некоррекные входные данные");
        }
        int sizeOfArray=(int)Math.ceil((end-start)/step);
        if(Math.ceil((end-start)/step)==(end-start)/step){
            sizeOfArray++;
        }
        Table[] answer=new Table[sizeOfArray];
        int counter=0;
        for (double i = start; i <=end; i+=step,counter++) {
            answer[counter]=new Table(i,Math.tan(i));
        }
        return answer;
    }
    public static void printTable(Table[] table){
        for (int i = 0; i <table.length; i++) {
            System.out.printf("%3f | %3f\n",table[i].getVaiue(),table[i].getResult());
        }
    }
}
