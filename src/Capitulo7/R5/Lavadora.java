package Capitulo7.R5;

public class Lavadora extends Electrodomestico{
    protected int carga;

    private final int CARGA = 5;

    Lavadora(){
        super();
        this.carga=CARGA;
    }

    Lavadora(int precio, int peso){
        super(precio, peso);
        this.carga=CARGA;
    }

    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void precioFinal(){
        super.precioFinal();
        if (getPeso() > 30){
            precioBase += 50;
        }
    }
}
