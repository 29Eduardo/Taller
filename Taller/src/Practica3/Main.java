package Practica3;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Docente doc1 = new Docente("Pedro",30,"6");
        Estudiante estu1 = new Estudiante("Eduardo",21,"Desarrollo de Software","Tercero");
        doc1.mostraDatos();
        estu1.mostraDatos();

        // Ingresar Cedula y direccion
        System.out.println("Ingrese la cedula del estudiante: ");
        String cedula = sc.nextLine();
        System.out.println("Ingrese la direcion del estudiante: ");
        String direccion = sc.nextLine();

        System.out.println("Ingrese la cedula del Docente: ");
        String cedula1 = sc.nextLine();
        System.out.println("Ingrese la direccion del Docente: ");
        String direccion1 = sc.nextLine();

        doc1.setCedula(cedula1);
        doc1.setDireccion(direccion1);
        doc1.mostraDatos();

        estu1.setCedula(cedula);
        estu1.setDireccion(direccion);
        estu1.mostraDatos();


    }
}
