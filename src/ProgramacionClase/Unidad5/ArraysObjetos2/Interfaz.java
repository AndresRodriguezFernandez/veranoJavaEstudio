package ProgramacionClase.Unidad5.ArraysObjetos2;

import java.util.Scanner;

public class Interfaz {
        public static Almacen decirCapacidad(Scanner sc) {
            int cap;
            do {
                System.out.print("Introduce la capacidad del almacén: ");
                cap = sc.nextInt();
                sc.nextLine();
            }while (cap < 0);
            return new Almacen(cap);
        }

        public static String decirIdentificador(Scanner sc) {
            System.out.print("Introduce el identificador del producto a buscar: ");
            return sc.nextLine();
        }

        public static String decirRespuesta(Scanner sc) {
            String respuesta = null;
            do {
                System.out.println("¿Deseas buscar otro producto? (Si/No):");
                respuesta = sc.nextLine().trim().toLowerCase();
            }while (!respuesta.equals("si") && !respuesta.equals("no"));
            return respuesta;
        }

        public static void controlarFinal(Scanner sc, Almacen al) {
            String respuesta = null;
            do {
                respuesta = decirRespuesta(sc);
                if (respuesta.equals("si")) {
                    al.visualizar(al.buscarProducto(decirIdentificador(sc)));
                }else {
                    System.out.println("Proceso terminado.");
                }
            }while (respuesta.equals("si"));

        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Almacen al1 = decirCapacidad(sc);
        al1.llenarAlmacen(sc);
        al1.visualizar(al1.buscarProducto(decirIdentificador(sc)));
        controlarFinal(sc, al1);
    }
}
