package by.epamtc.lab1.task4.util;

public class MathTool {
    public static boolean ishaveEvenNumbers(int minCountOfEvenNumbers,int ... numbers){
        if(minCountOfEvenNumbers<0){
            //здесь нужно выбросить своё исключение
        }
        boolean flag =false;
        int counter=0;
        for (int i = 0; i <numbers.length; i++) {
            if(numbers[i]>=0 && numbers[i]%2==0){
                counter++;
                if(counter==minCountOfEvenNumbers){
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
}
