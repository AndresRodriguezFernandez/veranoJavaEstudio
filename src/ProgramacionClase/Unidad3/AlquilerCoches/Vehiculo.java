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

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado){
        this.reservado=reservado;
    }

    public int getPlazas() {
        return plazas;
    }

    @Override
    public String toString() {
        return "Características del vehículo:"
                +"\nMatrícula: " + this.matricula
                +"\nPlazas: "+ this.plazas
                +"\nMotor: " +this.motor.getTipo()
                +"\nPotencia: " +this.motor.getPotencia() + "CV";
    }
}
