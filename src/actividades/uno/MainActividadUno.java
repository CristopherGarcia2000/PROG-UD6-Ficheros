package actividades.uno;

import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainActividadUno {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        String texto = "";
        while (texto.length() < 30){
            System.out.println("Introduzca un texto de 30 caracteres o más");
            texto = console.nextLine();
            if (texto.length() < 30){
                System.out.println("Te faltan "+(30-texto.length())+"palabras");
            }
        }
        texto = texto.toUpperCase().replace(" ","_");

        try {
            FileWriter escritorDeTexto = new FileWriter("src/ficheros/actividad1.txt");
            /*for (int i = 0; i < texto.length(); i++) {
                escritorDeTexto.write(texto.charAt(i));
            }*/
            escritorDeTexto.write(texto);
            escritorDeTexto.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
