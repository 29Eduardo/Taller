package Practica3;

public class Estudiante extends Persona {
    private String carrera;
    private String semestre;

    public Estudiante(String nombre, int edad, String carrera, String semestre) {
        super(nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    @Override
    public void mostraDatos() {
        System.out.println("----Datos Estudiante----");
        super.mostraDatos();
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }
}
