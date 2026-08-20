package ProgramacionClase.Unidad3.CuentasBancarias;

import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    static Cuenta c1 = new Cuenta("Marta", 123456, 1234, 0);
    static Cuenta c2 = new Cuenta("Julio", 234214, 5678, 0);
    static Cuenta[] cuentas = {c1, c2};

    public static Cuenta identificarClave(Scanner sc) {
        Cuenta c = null;
        do {
            System.out.println("Por favor, introduzca la clave de identificación: ");
            int clave = sc.nextInt();
            for (int i = 0; i < cuentas.length; i++) {
                if (cuentas[i].getClave() == clave) {
                    c = cuentas[i];
                }
            }if (c ==null) {
                System.out.println("Clave errónea");
            }
        }while (c == null);
        return c;
    }

    public static void visualizarMenu(){
        System.out.println("1. Ingresar dinero."
        +"\n2. Realizar transferencia."
        +"\n3. Reintegrar o retirar dinero."
        +"\n4. Cambiar clave."
        +"\n5. Conocer saldo."
        +"\n6. Salir.");
    }

    public static int meterOpcion(Scanner sc) {
        int op;
        do {
            System.out.print("Introduzca una opción: ");
            op = sc.nextInt();
        }while (op < 6 && op > 0);
        return op;
    }

    public static double validarCantidad(Scanner sc) {
        double cantidad;
        do {
            System.out.println("Introduce una cantidad de dinero: ");
            cantidad = sc.nextDouble();
        }while (cantidad < 0);
        return cantidad;
    }

    public static void transferir(Cuenta c1, Cuenta c2) {
        double cantidad = validarCantidad(sc);
        c1.reintegrar(cantidad);
        c2.ingresar(cantidad);
        System.out.println("Transferencia completada.");
    }

    public static void elegirOperacion(int opcion, Cuenta c) {
        switch (opcion) {
            case 1:
                double cantidad = validarCantidad(sc);
                c.ingresar(cantidad);
                break;
            case 2:
                transferir(c1, c2);
                break;
            case 3:
                double cantidad2 = validarCantidad(sc);
                c.reintegrar(cantidad2);
                break;
            case 4:
                c.cambiarClave(sc);
                break;
            case 5:
                System.out.println("Saldo disponible: " + c.getSaldo());
                break;
            default:break;
        }
    }

    public static void main(String[] args) {
        Cuenta CActual = identificarClave(sc);
        int op;
        do {
            visualizarMenu();
            op = meterOpcion(sc);
            elegirOperacion(op, CActual);
        }while (op != 6);
    }
}
