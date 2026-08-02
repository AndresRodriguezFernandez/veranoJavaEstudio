package Capitulo7.R5;



public class Principal {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[7];
        double precioLavadoras = 0;
        double precioTv = 0;
        double precioElectrodomesticos = 0;

        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Televisoin();
        electrodomesticos[2] = new Lavadora(500, 80);
        electrodomesticos[3] = new Lavadora(200, "negra", 'B', 60, 8);
        electrodomesticos[4] = new Televisoin(1099, 10);
        electrodomesticos[5] = new Televisoin(200, "negro", 'A', 5, 55, true);
        electrodomesticos[6] = new Lavadora(150, "negro", 'G', 60, 10);

        for (int i = 0; i < electrodomesticos.length; i++) {
            double precio = electrodomesticos[i].precioFinal();
            if (electrodomesticos[i] instanceof Electrodomestico){
                precioElectrodomesticos+=precio;
            }
            if (electrodomesticos[i] instanceof Televisoin){
                precioTv+=precio;
            } else if (electrodomesticos[i] instanceof Lavadora) {
                precioLavadoras+=precio;
            }
        }

        System.out.println("-----Precios de Televisiones------");
        System.out.println(precioLavadoras);

        System.out.println("----Precios de lavadoras-----");
        System.out.println(precioTv);

        System.out.println("-----Precio de electrodomésticos------" + "\n" + precioElectrodomesticos);
    }
}
