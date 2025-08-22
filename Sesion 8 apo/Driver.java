import java.util.Scanner;
public class Driver{
    public static final int MAX=3;
    public static Scanner scann=new Scanner(System.in);

    public static void readKms (String[] nameDrivers, double[] kilometers, int day){
        String nameDay="";
        switch(day){
            case 1: nameDay="Lunes";
                break;
            case 2: nameDay="Martes";
                break;
            case 3: nameDay="Miercoles";
                break;
        }

        for(int i=0; i<nameDrivers.length; i++){
            System.out.println("Ingrese los kilometros de "+ nameDrivers[i]+" para el dia "+ nameDay);
            double km=scann.nextDouble();
            kilometers[i]=km;
        }
    }
    public static double[] calculateTotalKms(double[] m, double[] t){
        double[] total=new double[MAX];
        for(int i=0; i<MAX; i++){
            total[i]=m[i]+t[i];
        }
        return total;
    }
    public static double calculateAverage (double[] m){
        double average=0;
        double total=0;
        for(int i=0; i<MAX; i++){
            total+=m[i];
        }
        average=total/MAX;
        return average;
    }
    public static void main (String[]args){ 
        String[] drivers= {"Juan","Ricardo","Esteban"};

        double[] monday= new double[MAX];
        double[] thrusday= new double[MAX];

        readKms(drivers,monday,1);
        readKms(drivers,thrusday,2);
        double[] totalKms= calculateTotalKms(monday, thrusday);
        double averageKms= calculateAverage(totalKms);
    }
}