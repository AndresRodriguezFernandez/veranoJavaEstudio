package Capitulo7.R4;

public class Principal {
    public static void hacerCantar(PuedeCantar cantor){
        cantor.cantar();
    }
    public static void main(String[] args) {
        Persona tenor = new Persona();
        hacerCantar(tenor);
        Gallo gallo = new Gallo();
        hacerCantar(gallo);
        Canario canario = new Canario();
        hacerCantar(canario);
    }
}
