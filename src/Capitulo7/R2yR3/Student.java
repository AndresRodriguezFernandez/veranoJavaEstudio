package Capitulo7.R2yR3;

public class Student extends Person{
    void message(){
        System.out.println("Esta es una clase estudiante");
    }

    void display(){
        message();
        super.message();
    }

    Student(){
        super();
        System.out.println("Constructor de la clase Student");
    }
}
