package Capitulo7.R5;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[7];
        int precioLavadoras;
        int precioTv;
        int precioElectrodomesticos = 0;
        ArrayList<Integer> tvs = new ArrayList<>();
        ArrayList<Integer> lavadoras = new ArrayList<>();

        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Televisoin();
        electrodomesticos[2] = new Lavadora(500, 80);
        electrodomesticos[3] = new Lavadora(200, "negra", 'B', 60, 8);
        electrodomesticos[4] = new Televisoin(1099, 10);
        electrodomesticos[5] = new Televisoin(200, "negro", 'A', 5, 55, true);
        electrodomesticos[6] = new Lavadora(150, "negro", 'G', 60, 10);

        for (int i = 0; i < electrodomesticos.length; i++) {
            electrodomesticos[i].precioFinal();
            int precio = electrodomesticos[i].getPrecioBase();
            precioElectrodomesticos += precio;
            if (electrodomesticos[i] instanceof Televisoin){
                tvs.add(precio);
            } else if (electrodomesticos[i] instanceof Lavadora) {
                lavadoras.add(precio);
            }
        }

        System.out.println("-----Precios de Televisiones------");
        Iterator<Integer> itTV = tvs.iterator();
        while (itTV.hasNext()){
            System.out.println(itTV.next());
        }

        System.out.println("----Precios de lavadoras-----");
        Iterator<Integer> itLavadoras = lavadoras.iterator();
        while (itLavadoras.hasNext()){
            System.out.println(itLavadoras.next());
        }

        System.out.println("-----Precio de electrodomésticos------" + "\n" + precioElectrodomesticos);
    }
}
