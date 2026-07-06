/*Bucle for-each para recorrer 4 marcas de coches/camiones desde un array*/
package Capitulo3;

public class P14 {
    public static void main(String[] args) {
        String[] marcas = {"Volvo", "DAF", "Scania", "Mercedes"};

        System.out.println("Las marcas almacenadas son: ");
        for (String i: marcas) {
            System.out.println(i);
        }
    }
}
