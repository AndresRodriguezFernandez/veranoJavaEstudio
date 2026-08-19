package ProgramacionClase.Unidad3.AlquilerCoches;

public class Motor {
    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }
}
