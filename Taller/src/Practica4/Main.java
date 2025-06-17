package Practica4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la Persona:");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la edad de la Persona:");
        int edad = sc.nextInt();
        sc.nextLine();
        // Edad incorrecta
        System.out.print("Ingrese el nombre de la Persona:");
        String nombre1 = sc.nextLine();
        System.out.print("Ingrese la edad de la Persona:");
        int edad1 = sc.nextInt();
        sc.nextLine();

        Persona persona = new Persona(nombre, edad);
        Persona persona1 = new Persona(nombre1, edad1);
        persona.mostrarDatos();
        persona1.mostrarDatos();


    }
}
