
package clase_habito;


public class Habito {
    private int id;
    private String categoria;
    private String nombre_habito;
    private String fecha_creacion;
    private String descripcion;
    private String recordatorios;


// constructores
    
    // Marcacion habito
public Habito (int id, String nombre_habito, String categoria, String fecha_creacion, String descripcion, String recordatorios) {
    this.id = id;
    this.nombre_habito = nombre_habito;
    this.categoria = categoria;
    this.fecha_creacion = fecha_creacion;
    this.descripcion = descripcion;
    this.recordatorios = recordatorios;
}

public void Marcar_habito () {
    System.out.println ("El habito " + nombre_habito + " Numero: " + id + " fue marcado como realizado");
    System.out.println ("El habito esta activo desde " + fecha_creacion);
}
public void Brinda_recordatorio () {
     System.out.println ("Recordatorio de " + nombre_habito + " Categoria: " + categoria + ", " + recordatorios);
}
public void Brindar_puntos () {
    int puntos;
    switch (categoria.toLowerCase()) {
        case "Salud":
            puntos = 15;
            break;
        case "Sueno":
            puntos = 20;
            break;
        default:
            puntos = 10;
            break;
    }
    System.out.println ("Has ganado " + puntos + " puntos por cumplir el habito " + nombre_habito);
}
}