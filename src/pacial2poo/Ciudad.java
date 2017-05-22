/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacial2poo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Ciudad implements UIM{
    protected String nombre;
    protected ArrayList <Estacion> estacion;
    
    

    public Ciudad(String nombre) {
        this.nombre = nombre;
      } 
      
    public void addEstacion(Estacion estacion){
        this.estacion.add(estacion);
    }

    @Override
    public void listarInformacion() {
        System.out.println( "Ciudad{" + "nombre=" + nombre + ", estacion=" + estacion + '}');
    }
    

    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estacion> getEstacion() {
        return estacion;
    }

    public void setEstacion(ArrayList<Estacion> estacion) {
        this.estacion = estacion;
    }

   


    
    
    
}
