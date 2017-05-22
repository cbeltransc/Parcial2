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
public class Agua extends Sensor{
    private int milimetros;

    public Agua(int milimetros) {
        super();
        this.milimetros=milimetros;
    }

    @Override
    public void listarInformacion() {
        System.out.println( "Agua{" + "milimetros=" + milimetros + '}');
    }
    

    public int getMilimetros() {
        return milimetros;
    }

    public void setMilimetros(int milimetros) {
        this.milimetros = milimetros;
    }
    
}
