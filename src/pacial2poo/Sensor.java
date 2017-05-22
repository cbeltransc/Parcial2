/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacial2poo;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public abstract class Sensor implements UIM {
    protected String marca;
    protected String referencia;
    protected Date fecha;

    public Sensor() {
        
    }

    public String getMarca() {
        return marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
   
    
}
