package ProgramacionClase.Unidad3.AlquilerCoches;

public class Vehiculo {
    private String matricula;
    private int plazas;
    private boolean reservado;
    private Motor motor;

    public Vehiculo(String matricula, int plazas, boolean reservado, Motor motor) {
        this.matricula = matricula;
        this.plazas = plazas;
        this.reservado = reservado;
        this.motor = motor;
    }
}
