package by.epamtc.lab1.task3.run;

import by.epamtc.lab1.scanner.DataScanner;
import by.epamtc.lab1.task3.util.AreaTool;


public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите площадь описанного квадрата:");
        double areaOut;
        double radius;
        double areaIn;
        double difference;
        do{
             areaOut= DataScanner.scanConsoleDouble();
             if(areaOut<=0){
                 System.out.println("Площадь описанного квадрата должна быть больше 0.\nВведите другое число");
             }
        }while (areaOut<=0);

        radius= AreaTool.calculateCircleRadiusInscribedInSquare(areaOut);
        areaIn=AreaTool.calculateSquareAreaInscribedInCircle(radius);

        System.out.println("Площадь квадрата вписанного в окружность:"+areaIn);

        difference=AreaTool.calculateDifference(areaOut,areaIn);
        System.out.println("Площадь описанного квадрата больше в: "+difference+" раз(а)");
    }
}
