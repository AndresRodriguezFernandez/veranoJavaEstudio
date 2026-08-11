package Capitulo8.R5;

public class Principal {
    public static void main(String[] args) {
        censura cen = new censura();
        cen.aplicarCensura("src/Capitulo8/R5/Entrada.txt", "src/Capitulo8/R5/Censura.txt", "src/Capitulo8/R5/Salida.txt");
    }
}
