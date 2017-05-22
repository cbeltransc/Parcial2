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
public class Temperatura extends Sensor{
    private int temp;

    public Temperatura(int temp) {
        super();
        this.temp=temp;
    }

    @Override
    public void listarInformacion() {
        System.out.println("Temperatura: "+temp);
      }  
    public int getTemp(){
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

   

   
    
}
