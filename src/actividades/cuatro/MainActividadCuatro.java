package actividades.cuatro;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import static actividades.cuatro.ClaseMetodos.guardarMesa;
import static actividades.cuatro.ClaseMetodos.verMesas;

public class MainActividadCuatro implements Serializable  {
    public static void main(String[] args)  throws IOException, ClassNotFoundException  {
        int numPatas;
        String color;
        int opcion = -1;
        ArrayList<Mesa> mesas = new ArrayList<>();
        Scanner teclao = new Scanner(System.in);


        while (opcion != 3){
            System.out.println("Seleccione una opción: \n" +
                    "1.-Introducir mesa \n" +
                    "2.-Ver mesas\n"+
                    "3.-Salir");
            opcion = teclao.nextInt();
            teclao.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Introduzca el número de patas");
                    numPatas = teclao.nextInt();
                    teclao.nextLine();
                    System.out.println("Introduzca el color");
                    color = teclao.nextLine();
                    Mesa mesa = new Mesa(color,numPatas);
                    mesas.add(mesa);
                    guardarMesa(mesas);
                    break;
                case 2:
                    verMesas();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduzca un valor válido.");
            }
        }
    }
}
