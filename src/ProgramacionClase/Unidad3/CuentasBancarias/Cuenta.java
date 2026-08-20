package ProgramacionClase.Unidad3.CuentasBancarias;

import java.util.Scanner;

public class Cuenta {
    private String nombre;
    private int numCuenta;
    private int clave;
    private double saldo;

    public Cuenta(String nombre, int numCuenta, int clave, double saldo) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.clave = clave;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getClave() {
        return clave;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double cantidad) {
        this.saldo+=cantidad;
    }

    public void reintegrar(double cantidad) {
        this.saldo-=cantidad;
    }

    public void cambiarClave(Scanner sc) {
        int claveActual;
        do {
            System.out.println("Introduce la clave actual: ");
             claveActual= sc.nextInt();
             if (claveActual != this.clave) {
                 System.out.println("Clave errónea.");
             }
        }while (claveActual != this.clave);
        System.out.println("Identificación de seguridad completada.");
        System.out.print("\nIntroduzca su nueva clave: ");
        this.clave = sc.nextInt();
    }


}
