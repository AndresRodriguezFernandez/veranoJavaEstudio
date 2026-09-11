package ProgramacionClase.Unidad6y7.Mayusculas;

import java.io.FileReader;
import java.io.IOException;

public class Principal {
    public void convertirMayusculas() {
        try {
            FileReader archivoOrigien = new FileReader("minusculas.txt");

        }catch (IOException e) {
            System.out.println("Error, fichero no encontrado: "+e);
        }

    }
}
