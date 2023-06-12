package actividades.tres;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainActividadTres {
    public static void main(String[] args) throws IOException {
        File actividad3 = new File("src/ficheros/actividad3.txt");
        FileReader archivoUno = new FileReader("src/ficheros/actividad1.txt");
        FileReader archivoDos = new FileReader("src/ficheros/actividad2.txt");
        FileWriter escritorDeTexto = new FileWriter("src/ficheros/actividad3.txt");
        int character;

        actividad3.createNewFile();
        escritorDeTexto.write("Contenido del fichero uno: ");
        while ((character = archivoUno.read()) != -1) {
            escritorDeTexto.write((char)character );
        }
        escritorDeTexto.write("\n");
        escritorDeTexto.write("Contenido del fichero dos: ");
        while ((character = archivoDos.read()) != -1) {
            escritorDeTexto.write((char)character);
        }
        escritorDeTexto.close();


    }
}
