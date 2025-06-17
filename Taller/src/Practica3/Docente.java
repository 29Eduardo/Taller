package Practica3;

public class Docente extends Persona{
    private String horasCargo;

    public Docente(String nombre, int edad,String horasCargo) {
        super(nombre,edad);
        this.horasCargo = horasCargo;
    }

    @Override
    public void mostraDatos() {
        System.out.println("---Datos de Docente---");
        super.mostraDatos();
        System.out.println("Horas Cargo: "+horasCargo);
    }
}
