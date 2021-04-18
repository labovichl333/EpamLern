package by.epamtc.lab1.task10.util;

public class WorkWithFunction {
    public static TableComponement[] calculateFunction(double start, double end, double step){
        if(start>=end || step<=0){
            //здесь нужно выбросить своё исключение

        }
        int sizeOfArray=(int)Math.ceil((end-start)/step);
        if(Math.ceil((end-start)/step)==(end-start)/step){
            sizeOfArray++;
        }
        TableComponement[] answer=new TableComponement[sizeOfArray];
        int counter=0;
        for (double i = start; i <=end; i+=step,counter++) {
            answer[counter]=new TableComponement(i,Math.tan(i));
        }
        return answer;
    }

}
