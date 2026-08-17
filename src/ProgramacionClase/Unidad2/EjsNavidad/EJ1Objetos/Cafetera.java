package ProgramacionClase.Unidad2.EjsNavidad.EJ1Objetos;

import javax.crypto.spec.PSource;

public class Cafetera {
    int capacidadMaxima = 2000;
    int cantidadActual = 0;
    String dia;

    public Cafetera(String dia) {
        this.dia=dia;
    }

    public void llenarCafetera(){
        this.cantidadActual=capacidadMaxima;
        System.out.println("Cafetera llena.");
    }

    public void servir_TazaCafe(int capacidad){
        if (capacidad > cantidadActual) {
            System.out.println("No queda más café. Rellena la máquina primero.");
        }else {
            System.out.println("Sirviendo taza de café de " + capacidad + "ml.");
            this.cantidadActual-=capacidad;
        }

    }

    public void vaciarCafetera(){
        this.cantidadActual=0;
        System.out.println("Tirando sobrante...");
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", cantidadActual=" + cantidadActual +
                ", dia='" + dia + '\'' +
                '}';
    }
}
