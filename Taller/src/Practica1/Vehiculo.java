package Practica1;

public class Vehiculo {
    private String placa;
    private String kilometaje;

    Vehiculo(String placa, String kilometaje) {
        this.placa = placa;
        this.kilometaje = "0 Km";
    }
    public String setKilometraje(String kilometaje) {
        this.kilometaje = kilometaje;
        return kilometaje;
    }

    public String mostrarVehiculo() {
        System.out.println("Datos del vehiculo: ");
        System.out.println("Placa: " + placa);
        System.out.println("Kilometaje: " + kilometaje);
        return "";
    }


}
