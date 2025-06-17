package Practica2;

public class Departamento extends Inmobiliaria {
    protected String numero;

    public Departamento(String tipo,int precio,String lugar,String numero) {
        super(tipo,precio,lugar);
        this.numero = numero;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("----Datos del departamento----");
        super.mostrarInfo();
        System.out.println("Numero de Departamento: " + numero);

    }
}
