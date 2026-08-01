package Capitulo7.R5;

public class Electrodomestico {
    protected int precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;
    //constantes
    private final int PRECIO = 100;
    private final String COLOR = "blanco";
    private final char CONSUMO = 'F';
    private final int PESO = 100;


    public Electrodomestico(){
        this.precioBase = PRECIO;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO;
        this.peso = PESO;
    }
    public Electrodomestico(int precioBase, int peso){
        this.precioBase=precioBase;
        this.peso=peso;
        this.color=COLOR;
        this.consumoEnergetico=CONSUMO;
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(char letra){
        char[] letrasCOnsumo = {'A', 'B', 'C', 'D','E', 'F'};
        boolean letraValida = false;
        for (int i = 0; i < letrasCOnsumo.length; i++) {
            if (letra == letrasCOnsumo[i]){
                letraValida = true;
            }
        }
        if (letraValida){
            this.consumoEnergetico=letra;
        }else {
            this.consumoEnergetico = CONSUMO;
        }
    }

    private void comprobarColor(String color){
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean colorValido = false;
        for (int i = 0; i < colores.length; i++){
            if (color == colores[i]){
                colorValido=true;
            }
        }
        if (colorValido){
            this.color=color;
        }else {
            this.color=COLOR;
        }
    }

    public void precioFinal(){
        if (this.consumoEnergetico == 'A') {
            this.precioBase += 100;
        } else if (this.consumoEnergetico == 'B') {
            this.precioBase += 80;
        } else if (this.consumoEnergetico == 'C') {
            this.precioBase +=60;
        } else if (this.consumoEnergetico == 'D') {
            this.precioBase +=50;
        } else if (this.consumoEnergetico == 'E') {
            this.precioBase += 30;
        } else if (this.consumoEnergetico == 'F') {
            this.precioBase += 10;
        }

        if (this.peso < 19){
            this.precioBase +=10;
        } else if (this.peso > 20 && this.precioBase < 49) {
            this.precioBase += 50;
        } else if (this.precioBase > 50 && this.precioBase < 79) {
            this.precioBase += 80;
        }else {
            this.precioBase += 100;
        }
    }
}
