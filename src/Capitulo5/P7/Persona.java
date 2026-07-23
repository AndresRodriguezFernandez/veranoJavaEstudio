package Capitulo5.P7;

public class Persona {
    private final char sexoHombre = 'M';
    private String nombre = "";
    private int edad = 0;
    private String dni;
    private char sexo = sexoHombre;
    private double peso = 0;
    private double altura = 0;

    public Persona(){}

    public Persona(String nombre, int edad, char sexo) {
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public final int calcularIMC(){
        double resultado;
        int retorno = 1;
        resultado = peso/(Math.pow(altura, 2));
        if (resultado < 20){
            retorno = -1;
        } else if (resultado >= 20 && resultado <= 25) {
            retorno = 0;
        } else if (resultado > 25) {
            retorno = 1;
        }
        return retorno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean esMayorDeEdad(){
        if (this.edad > 18){
            return true;
        }else {
            return false;
        }
    }

    private void comprobarSexo(){
        if (!(this.sexo == 'H' || this.sexo == 'M')){
            this.sexo = 'H';
        }
    }

    private int generarNumero(){
        return (int) (Math.random()*100000000);
    }

    private String generarLetra() {
        char letra = (char) (Math.random()*(90-65)+65);
        return String.valueOf(letra).toUpperCase();
    }

    protected void generaDNI(){
        this.dni = (generarNumero() + generarLetra());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "sexoHombre=" + sexoHombre +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
