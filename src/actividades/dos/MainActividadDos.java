package actividades.dos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainActividadDos {
    public static void main(String[] args) {
        try {
            FileReader lectorDePalabras = new FileReader("src/ficheros/actividad2.txt");
            int character;

            while ((character = lectorDePalabras.read()) != -1){
                System.out.print((char)character+"_"+character+",");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
