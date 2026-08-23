package ProgramacionClase.Unidad4.Empleados;

import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    public static void controlarGasto(Empresa emp) {
        if (emp.getTotalPagado() >= 10000) {
            System.out.println("La empresa tiene que recortar gastos.");
        }else {
            char op = elegirOpcion(sc);
            switch (op){
                case 'A':
                    System.out.println("Se prefiere un administrativo.");
                    break;
                case 'V':
                    System.out.println("Se prefiere un vendedor.");
                    break;
            }
        }
    }

    public static char elegirOpcion(Scanner sc) {
        char c;
        do {
            System.out.print("Introduce un carácter por el teclado (V/A): ");
            c = sc.next().toUpperCase().charAt(0);
        }while (c != 'A' && c != 'V');
        return c;
    }

    public static void main(String[] args) {
            Empresa emp = new Empresa("123456S", "Andrés Solutions S.L.");
            Empleado vend = new Vendedor(1234, "Paco", emp, 80000);
            Empleado admin = new Administrativo(55678, "Pablo", emp, 200);
            Empleado[] empleados = {vend, admin};

            for (int i = 0; i < empleados.length; i++) {
                empleados[i].imprimir();
                System.out.println("---------");
            }

            emp.setnEmpleados(empleados);
            emp.setTotalPagado(empleados);
            emp.imprimir();
            controlarGasto(emp);
    }
}
