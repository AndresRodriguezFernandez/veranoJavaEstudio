package Capitulo5.R9;

import java.text.DecimalFormat;

public class Prueba {
    public static void main(String[] args) {
        rebajas re = new rebajas();
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("El descuento es de un :" + df.format(re.descubrePorcentaje(100,50)) + "%");
        System.out.println("El descuento es de un :" + df.format(re.descubrePorcentaje(145,79)) + "%");
        System.out.println("El descuento es de un :" + df.format(re.descubrePorcentaje(200,50)) + "%");

    }
}
