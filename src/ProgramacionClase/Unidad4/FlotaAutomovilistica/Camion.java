package ProgramacionClase.Unidad4.FlotaAutomovilistica;

public class Camion extends Vehiculo{
    private double peso;
    private Motor motor;

    public Camion(String matricula, int nRuedas, double precio, String color, double peso, Motor motor) {
        super(matricula, nRuedas, precio, color);
        this.peso = peso;
        this.motor = motor;
    }

    @Override
    public double establecer_precio() {
        double plus = super.establecer_precio();
        if (this.motor == Motor.DIESEL) {
            plus+= 5*super.establecer_precio()/100;
        } else if (this.motor == Motor.GASOLINA) {
            plus+= 2*super.establecer_precio()/100;
        }
        return plus;
    }

    @Override
    public String toString() {
        String tipoMotor = "";
        if (this.motor == Motor.DIESEL){
            tipoMotor = "Diésel";
        }else if (this.motor == Motor.GASOLINA){
            tipoMotor = "Gasolina";
        }
        return super.toString() + establecer_precio() + " euros." + "\nPeso: " + this.peso + " t. Motor de: " + tipoMotor + " Impuesto por litro de combustible: " + this.motor.getImpuesto();
    }
}
