package Capitulo6.P6;

public class Principal {
    static ColaLista cl = new ColaLista();

    public static void crearProductos(){
        int productosAleatorio = (int)(Math.random()*(8-1+1)+1);
        for (int i = 0; i < productosAleatorio; i++) {
            double precioAleatorio = Math.round(Math.random() * (10 - 1) + 1);
            int cantidadAleatorio = (int) (Math.random() * (10 - 1+1) + 1);
            Producto pro = new Producto(cantidadAleatorio, precioAleatorio);
            cl.insertar(pro);
        }
    }

    public static double procesarProdcutos() throws Exception {
        double precioTotal = 0;
        int numProducto = 1;
        System.out.println("Producto   Cant PrecioU   Precio F");
        while (!cl.colaVacia()){
            Producto product = cl.quitar();
            System.out.println("Producto " +numProducto+ ": " + product.getCantidad() + "    " +product.getPrecio() + "€     " + product.precioFinal() + "€");
            precioTotal = precioTotal + product.precioFinal();
            numProducto++;
        }
        return precioTotal;
    }

    public static void mostrarTotal(double sumaTotal){
        System.out.println("--------------------------------");
        System.out.println("Total:                    " + sumaTotal+"€");
    }

    public static void main(String[] args) throws Exception {
        crearProductos();
        mostrarTotal(procesarProdcutos());
    }
}
