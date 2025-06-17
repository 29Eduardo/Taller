package Practica3;

abstract class Persona{
    protected String nombre;
    protected int edad;
    protected String cedula;
    protected String direccion;

    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    public String setCedula(String cedula) {
        this.cedula = cedula;
        return cedula;
    }
    public String setDireccion(String direccion) {
        this.direccion= direccion;
        return direccion;
    }

    public void mostraDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Cedula: " + cedula);
        System.out.println("Direccion: " + direccion);

    }
}
