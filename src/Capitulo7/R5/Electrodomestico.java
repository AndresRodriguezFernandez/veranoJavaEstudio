package Capitulo7.R5;

public class Electrodomestico {
    protected double precioBase;
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
    public Electrodomestico(double precioBase, int peso){
        this.precioBase=precioBase;
        this.peso=peso;
        this.color=COLOR;
        this.consumoEnergetico=CONSUMO;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
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

    /*Mi metodo
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

     */
    //El metodo del libro
    private void comprobarConsumoEnergetico(char letra){
        if (letra >= 65 && letra <= 70){
            this.consumoEnergetico=letra;
        }else {
            this.consumoEnergetico=CONSUMO;
        }
    }

    private void comprobarColor(String color){
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean colorValido = false;
        for (int i = 0; i < colores.length && !colorValido; i++){
            if (color.toLowerCase().equals(colores[i])){
                colorValido=true;
            }
        }
        if (colorValido){
            this.color=color;
        }else {
            this.color=COLOR;
        }
    }

    /*Mi metodo
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
        } else if (this.peso > 20 && this.peso < 49) {
            this.precioBase += 50;
        } else if (this.peso > 50 && this.peso < 79) {
            this.peso += 80;
        }else {
            this.peso += 100;
        }
    }*/

    //Metodo del libro
    public double precioFinal(){
        double plus = 0;
        switch (consumoEnergetico){
            case 'A':
                plus+=100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus+=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
        }

        if (this.peso < 19){
            plus+=10;
        } else if (this.peso > 20 && this.peso < 49) {
            plus+=50;
        } else if (this.peso > 50 && this.peso < 79) {
            plus+=80;
        }else if (this.peso > 80){
            plus+=100;
        }
        return precioBase+plus;
    }
}
