package Practica2;

public class Casa extends Inmobiliaria{
    private String numeroCuartos;

    Casa(String tipo, int precio, String lugar,String numeroCuartos){
        super(tipo, precio, lugar);
        this.numeroCuartos = numeroCuartos;
    }

    @Override
    public void mostrarInfo() {
        System.out.print("----Datos de la casa-----\n");
        super.mostrarInfo();
        System.out.print("Numero Cuartos: " + numeroCuartos + "\n");
    }
}
