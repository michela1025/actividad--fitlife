/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitlife;

/**
 *
 * @author Aprendiz
 */
public class Estadisticas {
    private int id ; 
    private String nombre; 
    private String descripcion;
    private String categoria;
    private int historial ; 
    private float  porcentaje;  
    
    
  // constructor 
    
    
    public Estadisticas (int id,String nombre,String descripcion, String categoria,int historial ,float  porcentaje){
    
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.historial = historial;
        this.porcentaje = porcentaje;
    }
    // metodos 
    public void Bringar_graficas (){
    System.out.println("mostrando las grafias de"+ nombre);
    }
    
    public void Brindar_informe (){
    System.out.println("mostrando informe de"+ nombre+ "categoria: "+ categoria+ "historial "+ historial + "y su porcentaje es:" + porcentaje+ "%");
    }
    
    public void Brindar_consejo(){
    System.out.println("deberias subir el porcentaje "+porcentaje);
    }
    
    public void Brindar_porcentaje(){
    System.out.println("el porcentaje es: "+ porcentaje );
    }
    
    public void Mostrar_resumen(){
    System.out.println("el resumen de: "+ nombre+ "presenta"+ "descripcion: "+ descripcion+ "categoria"+categoria+"historial"+ historial+"porcentaje"+porcentaje );
    }
            }
