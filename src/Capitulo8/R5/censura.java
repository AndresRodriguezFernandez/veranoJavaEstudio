package Capitulo8.R5;

import java.io.*;
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

            FileReader frCensura = new FileReader(censura);
            BufferedReader brCensura = new BufferedReader(frCensura);

            FileWriter fw = new FileWriter(salida);


            String s;
            while ( (s= brCensura.readLine()) != null) {
                StringTokenizer str = new StringTokenizer(s, " ");
                lista.put(str.nextToken(), str.nextToken());
            }
            String l;
            while (( l = br.readLine()) != null) {
                StringTokenizer str = new StringTokenizer(l, " ");
                if (lista.containsKey(str.nextToken())){
                    fw.write(lista.get(str.nextToken()));
                }else {
                    fw.write(str.nextToken());
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getCause());
        }


    }
}
