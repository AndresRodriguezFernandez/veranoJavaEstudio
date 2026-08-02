package Capitulo7.R5;

public class Televisoin extends Electrodomestico{
    protected int resolucion;
    protected boolean sincronizadorTDT;

    private final int RESOLUCION = 20;
    private final boolean SINCRONIZADORTDT = false;

    Televisoin(){
        super();
        this.resolucion=RESOLUCION;
        this.sincronizadorTDT=SINCRONIZADORTDT;
    }

    public Televisoin(double precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion=RESOLUCION;
        this.sincronizadorTDT=SINCRONIZADORTDT;
    }

    public Televisoin(double precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sincronizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sincronizadorTDT = sincronizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSincronizadorTDT() {
        return sincronizadorTDT;
    }

    public double precioFinal(){
        double precio = super.precioFinal();
        if (this.resolucion > 40){
            precio = precioBase + (30*precioBase/100);
        }
        if (sincronizadorTDT){
            precio+=50;
        }
        return precio;
    }
}
