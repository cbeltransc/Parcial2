/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacial2poo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Estacion implements UIM{
    protected String nombre;
    protected String ubicacion;
    protected String fecha;
    protected ArrayList <Sensor> sensor;

    public Estacion(String nombre) {
        this.nombre = nombre;
        this.sensor=new ArrayList <>();
    }
     
    public void addSensor(Sensor sensor){
        this.sensor.add(sensor);
    }
    
    
    public double promedio(){
        return 5;
    }

    @Override
    public void listarInformacion() {
        System.out.println("Estacion{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", fecha=" + fecha + ", sensor=" + sensor + '}');
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getFecha() {
        return fecha;
    }

  

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   
    
    
    
}
