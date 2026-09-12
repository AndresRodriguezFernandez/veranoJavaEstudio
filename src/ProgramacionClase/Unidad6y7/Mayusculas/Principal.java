package ProgramacionClase.Unidad6y7.Mayusculas;

import java.io.*;

public class Principal {
    public static void convertirMayusculas() {
        try {
            FileReader archivoOrigien = new FileReader("src/ProgramacionClase/Unidad6y7/Mayusculas/minusculas.txt");
            BufferedReader br = new BufferedReader(archivoOrigien);
            FileWriter fw = new FileWriter("src/ProgramacionClase/Unidad6y7/Mayusculas/mayusculas.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String linea="";
            while ((linea=br.readLine()) != null) {
                bw.write(linea.toUpperCase());
                bw.newLine();
            }
            bw.close();
            br.close();
        }catch (IOException e) {
            System.out.println("Error, fichero no encontrado: "+e);
        }
    }

    public static void visualizar() {
        try{
            FileReader archvioDestino = new FileReader("src/ProgramacionClase/Unidad6y7/Mayusculas/mayusculas.txt");
            BufferedReader br = new BufferedReader(archvioDestino);
            String linea="";
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        }catch (IOException e) {
            System.out.println("Se ha producido un error al abrir el fichero: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        convertirMayusculas();
        visualizar();
    }
}
