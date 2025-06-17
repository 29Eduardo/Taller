package Practica4;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int setEdad(int edad) {
        this.edad = edad;
        return edad;
    }
    public void mostrarDatos() {
        System.out.println("---- Datos de la  Persona ----");
        System.out.println("Nombre: " + nombre);
        if (edad >= 0) {
            System.out.println("Edad: " + edad);
        }else {
            System.out.println("Edad no valido");
        }
    }
}
