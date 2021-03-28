package by.epamtc.lab1.task3.run;

import by.epamtc.lab1.scanner.DataScanner;
import by.epamtc.lab1.task3.util.AreaTool;


public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите площадь описанного квадрата:");
        double areaOut;
        double radius=-1;
        double areaIn=-1;
        double difference;
        do{
             areaOut= DataScanner.scanConsoleDouble();
             if(areaOut<=0){
                 System.out.println("Площадь описанного квадрата должна быть больше 0.\nВведите другое число");
             }
        }while (areaOut<=0);

        try {
            radius= AreaTool.calculateCircleRadiusInscribedInSquare(areaOut);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

        try {
            areaIn=AreaTool.calculateSquareAreaInscribedInCircle(radius);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }


        System.out.println("Площадь квадрата вписанного в окружность:"+areaIn);
        difference=areaOut/areaIn;
        System.out.println("Площадь описанного квадрата больше в: "+difference+" раз(а)");
    }
}
