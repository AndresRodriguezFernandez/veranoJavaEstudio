package Capitulo5.R3;
/**
 * @author Andrés
 * @version 1.0
 * */
public class Cuenta {
    private String titular;
    private double cantidad;

    //Constrcutores
    public Cuenta (String titular, double cantidad){
        this.titular=titular;
        if (cantidad < 0){
            this.cantidad = 0;
        }else {
            this.cantidad=cantidad;
        }

    }

    public Cuenta(String titular){
        this.titular=titular;
    }

    //Métodos setter
    void setTitular(String titular){
        this.titular=titular;
    }

    void setCantidad(double cantidad){
        this.cantidad=cantidad;
    }

    //Métodos getter
    String getTitular(){
        return titular;
    }

    double getCantidad(){
        return cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    //Métodos adicionales
    public void ingresar(double cantidad){
        if (cantidad > 0){
            this.cantidad+=cantidad;
        }
    }

    public void retirar(double cantidad){
        if (this.cantidad - cantidad < 0){
            this.cantidad = 0;
        }else {
            this.cantidad -= cantidad;
        }
    }
}
