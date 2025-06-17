package Practica1;

public class Main {
    public static void main(String[] args) {
        Vehiculo carro = new Vehiculo("PBM-112","0 Km");
        carro.mostrarVehiculo();

        //Actualizacion de Kilometraje
        carro.setKilometraje("80 Km");
        carro.mostrarVehiculo();

    }
}
