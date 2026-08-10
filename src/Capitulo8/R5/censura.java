package Capitulo8.R5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class censura {
    public void aplicarCensura(String fichero1, String fCensura, String fSalida) {
        File fichero = new File(fichero1);
        File censura = new File(fCensura);
        File salida = new File(fSalida);
        HashMap<String, String> lista = new HashMap<>();
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            FileReader frCensura = new FileReader(fCensura);
            BufferedReader brCensura = new BufferedReader(frCensura);
            FileWriter fw = new FileWriter(salida);
            StringTokenizer str = new StringTokenizer(brCensura.readLine(), " ");
            while (brCensura.readLine() != null) {
                lista.put(str.nextToken(), str.nextToken());
            }
            while (br.readLine() != null) {
                if (lista.containsKey(str.nextToken())){

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
