package Constructores;

public class Logros {
    private int cantidad;
    private String nombre;
    private String descripcion;
    private String categoria;;

    //constructores completo
    public Logros(int cantidad, String nombre, String descripcion, String categoria) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    //contructor de tres parametros
    public Logros(int cantidad, String nombre, String descripcion) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = "no definida";
    }

    //contructor de dos parametros
    public Logros(int cantidad, String nombre) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.descripcion = "no definida";
        this.categoria = "no definida";
    }

    //contructor de dos parametros
    public Logros(int cantidad) {
        this.cantidad = cantidad;
        this.nombre = "no determinado";
        this.descripcion = "no definida";
        this.categoria = "no definida";
    }

    //metodo para confirmar la información los logros
    public void Mostrarinformacion() {
        System.out.println("La cantidad de logros que tienes es: " + cantidad);
        System.out.println("El nombre del usuario es: " + nombre);
        System.out.println("La descripcion del logro es: " + descripcion);
        System.out.println("La categoria de tu logro es: " + categoria);
    }
}