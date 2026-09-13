package ProgramacionClase.Unidad6y7.Beatles;

import java.io.*;
import java.util.ArrayList;

public class Principal {
    public static void pasarVectorAFichero() {
        String[] nombres = {"John", "Paul", "Ringo", "George"};

        try {
            FileWriter fw = new FileWriter("src/ProgramacionClase/Unidad6y7/Beatles/nombres.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < nombres.length; i++) {
                bw.write(nombres[i]);
                bw.newLine();
            }
            bw.close();
        }catch (IOException e) {
            System.out.println("Error"+e.getMessage());
        }
    }

    public static void anadirApellidosFichero() {
        try {
            File apellidos = new File("src/ProgramacionClase/Unidad6y7/Beatles/apellidos.txt");
            FileWriter fw = new FileWriter("src/ProgramacionClase/Unidad6y7/Beatles/nombres.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            FileReader fr = new FileReader(apellidos);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            br.close();
            bw.close();
        }catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static String[] pasarFicheroAVector() {
        ArrayList<String> nombresApellidosLista = new ArrayList<>();
        String[] nombreApellido = new String[4];
        try {
            File fichero = new File("src/ProgramacionClase/Unidad6y7/Beatles/nombres.txt");
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            while ((linea = br.readLine()) != null) {
                nombresApellidosLista.add(linea);
            }

            for (int j = 0; j < nombreApellido.length; j++) {
                nombreApellido[j] = nombresApellidosLista.get(j) + " " + nombresApellidosLista.get(j+4);
            }

            br.close();
        }catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return nombreApellido;
    }

    public static void visualizar(String[] nombresApellidos) {
        if (nombresApellidos != null) {
            for (int i = 0; i < nombresApellidos.length; i++) {
                System.out.println(nombresApellidos[i]);
            }
        }else {
            System.out.println("El vector está vacío.");
        }
    }

    public static void main(String[] args) {
        pasarVectorAFichero();
        anadirApellidosFichero();
        String[] vector = pasarFicheroAVector();
        visualizar(vector);
    }
}
