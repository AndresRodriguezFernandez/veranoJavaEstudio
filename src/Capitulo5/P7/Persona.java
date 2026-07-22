package Capitulo5.P7;

public class Persona {
    private final char sexoHombre = 'M';
    private String nombre = "";
    private int edad = 0;
    private String dni;
    private char sexo = sexoHombre;
    private double peso;
    private double altura;

    public Persona(){}

    public Persona(String nombre, int edad, char sexo) {
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
    }

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }


    public boolean esMayorDeEdad(){
        if (this.edad > 18){
            return true;
        }else {
            return false;
        }
    }
}
