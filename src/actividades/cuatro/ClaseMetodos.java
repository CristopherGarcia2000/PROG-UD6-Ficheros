package actividades.cuatro;

import java.io.*;
import java.util.ArrayList;

public class ClaseMetodos implements Serializable {


    public static void guardarMesa(ArrayList<Mesa> mesas)  {
        try {
            FileOutputStream archivo = new FileOutputStream("src/ficheros/actividad4.txt");
            BufferedOutputStream archivoBufer = new BufferedOutputStream(archivo);
            ObjectOutputStream archivoObjeto = new ObjectOutputStream(archivoBufer);
            for (int i = 0; i < mesas.size(); i++) {
                archivoObjeto.writeObject(mesas.get(i).toString());
            }
            archivoObjeto.flush();
            archivoObjeto.close();
        } catch (IOException e) {
            System.out.println("Escritura Finalizada");
        }

    }
    public static void verMesas() throws IOException, ClassNotFoundException {
        try {
            FileInputStream archivo = new FileInputStream("src/ficheros/actividad4.txt");
            BufferedInputStream archivoBufer = new BufferedInputStream(archivo);
            ObjectInputStream archivoObjeto = new ObjectInputStream(archivoBufer);
            String texto = (String) archivoObjeto.readObject();
            while (true){
                System.out.println(texto);
                texto =(String) archivoObjeto.readObject();
            }
        } catch (EOFException e){
            System.out.println("Fin del fichero");
        }


    }
}
