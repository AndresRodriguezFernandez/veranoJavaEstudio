package Capitulo8.R6;

import java.io.*;
import java.util.ArrayList;

//ordena numeros de fichero de manera ascendente en el mismo fichero
public class Ordena {

    public void ordena(String fichero) {
        try {
            File file = new File(fichero);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            ArrayList<Integer> numeros = new ArrayList<>();
            int contadorLineas = 0;
            String linea;//comprobacion 1
            while ((linea = br.readLine()) != null) {
                if (linea.isBlank()){
                    continue;
                }else {
                    numeros.add(Integer.parseInt(linea));
                    contadorLineas++;
                }

            }
            if (contadorLineas < 5) {
                System.out.println("El fichero tiene menos de cinco números");
            }else {

                System.out.println("Se ha creado un array con " + numeros.size() + " posiciones. Comprobación 2");//comprobación 2

                System.out.println("Comprobación 3");
                for (int i = 0; i < numeros.size(); i++){//comprobación 3
                    System.out.print(numeros.get(i) + " ");
                }

                for (int i = 1; i < numeros.size(); i++){//ajuste aqui
                    for (int l = 0 ; l < numeros.size(); l++) {
                        if (numeros.get(l) > numeros.get(i)){
                            int numActual = numeros.get(i);
                            numeros.set(i, numeros.get(l));
                            numeros.set(l, numActual);
                        }
                    }
                }
                System.out.println("Comprobación 4");
                for (int i = 0; i < numeros.size(); i++){//comprobación 4
                    System.out.println(numeros.get(i));
                }

                FileWriter fw = new FileWriter(file);
                for (int i = 0; i < numeros.size(); i++) {
                    fw.write(numeros.get(i).toString());
                    fw.write("\n");
                }
                fw.close();
                br.close();
                fr.close();
            }
        }catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }

    }
}
