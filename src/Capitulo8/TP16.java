package Capitulo8;

import java.io.File;

public class TP16 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Andrés\\Documents\\veranojJavaEstudio");

        if (dir.exists()){
            System.out.println("El directorio " +dir.getName() + " existe");
        }

        if (dir.canRead()){
            System.out.println("Tenemos permisos de lectura en el directorio.");
        }

        if (dir.canWrite()){
            System.out.println("Tenemos permisos de escritura en el directorio.");
        }

        File[] ficheros = dir.listFiles();

        for (File fichero : ficheros) {
            System.out.println(fichero.getName());
        }
    }
}
