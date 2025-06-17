package Practica2;

public class Inmobiliaria {
    protected String tipo ;
    protected int precio;
    protected String lugar;

    Inmobiliaria(String tipo, int precio, String lugar) {
        this.tipo = tipo;
        this.precio = precio;
        this.lugar = lugar;
    }

    public void  mostrarInfo(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Precio: " + precio);
        System.out.println("Lugar: " + lugar);
    }


}
