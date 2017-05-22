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
public class Cargaelectrica extends Sensor{
    private int nivelelectrico;

    public Cargaelectrica( int nivelelectrico) {
        super();
        this.nivelelectrico=nivelelectrico;
    }

    

    @Override
    public void listarInformacion()  {
        System.out.println( "Cargaelectrica{" + "nivelelectrico=" + nivelelectrico + '}');
    }
    
    public int getNivelelectrico() {
        return nivelelectrico;
    }

    public void setNivelelectrico(int nivelelectrico) {
        this.nivelelectrico = nivelelectrico;
    }
    
}
