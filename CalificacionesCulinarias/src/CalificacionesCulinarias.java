import java.util.Scanner;
public class CalificacionesCulinarias{
    public static Scanner scann=new Scanner(System.in);
    public static final int numeroChefs=3;

    public static void leerNombresYCalificaciones(String[] nombres, int[] totales, int numeroPlatos, double[] promedios){
        
        for(int i=0; i<nombres.length; i++){
            System.out.print("Nombre del "+(i+1)+" chef: ");
            nombres[i] = scann.nextLine();
            
            int sumaCalificacion =0;
            for(int a=0; a<numeroPlatos; a++){
                System.out.print("Chef "+(i+1)+" -Ingrese la calificacion del "+(a+1)+" plato: ");
                int calificacion = scann.nextInt();
                sumaCalificacion += calificacion;
            }
            scann.nextLine();
            totales[i] = sumaCalificacion;
            promedios[i] = (double) sumaCalificacion / numeroPlatos;
        }
    }
    public static void mostrarEstadisticas (String[] nombres, int[] totales, double[] promedios) {
        System.out.println("\nResultados de las calificaciones:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Chef " + (i+1) + " - " + nombres[i] + " Puntaje Total: " + totales[i] + ", Promedio: " + promedios[i]);
        }
    }
    public static void mostrarGanador(String[] nombres, int[] totales) {
        int puntajeMaximo = totales[0];
        int chefGanador = 0;
        
        for (int i = 1; i < totales.length; i++) {
            if (totales[i] > puntajeMaximo) {
                puntajeMaximo = totales[i];
                chefGanador = i;
            }
        }
        
        System.out.println("El Chef con la puntuación más alta es: El chef numero " +(chefGanador+1) + " - " + nombres[chefGanador]);
    }
    public static void main (String[]args){
        String[] chefs= new String[numeroChefs];
        int[] totales = new int[numeroChefs];
        double[] promedios = new double[numeroChefs];

        System.out.println("Numero de chefs a participar: 3");
        System.out.print("Ingrese la cantidad de platos: ");
        int numeroPlatos=scann.nextInt();

        scann.nextLine();
        leerNombresYCalificaciones(chefs, totales, numeroPlatos, promedios);
        mostrarEstadisticas(chefs, totales, promedios);
        mostrarGanador(chefs, totales);
    }
}