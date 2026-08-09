package Capitulo8.R4;

import java.io.*;
import java.util.StringTokenizer;

public class Cuenta {
    public int cuentaPalabras(String archivo){
        int cont = 0;
        try {
            File file = new File(archivo);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null) {
                StringTokenizer str = new StringTokenizer(linea);
                cont+=str.countTokens();
            }
            return cont;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cont;
    }
}
