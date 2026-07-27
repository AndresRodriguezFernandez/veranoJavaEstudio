package Capitulo6;

import java.util.ArrayList;
import java.util.List;

public class R3 {
    public static void main(String[] args) {
        List<String> milista = new ArrayList<>();

        milista.add("Elemento1");
        milista.add("Elemento2");
        milista.add("Elemento3");
        milista.add("Elemento4");
        System.out.println(milista);//imprimimos la lista

        //Le damos los mismos valores de la lista al array
        String[] milistaVector = new String[milista.size()];

        //Metodo para convertir una lista a un array en java facilmente.
        milista.toArray(milistaVector);

        for (String s : milistaVector) {
            System.out.println(s);
        }
    }
}
