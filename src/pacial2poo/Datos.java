/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacial2poo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Datos {
    public File archivo;
    private Ciudad ciudad;
   

    public Datos() {
        this.archivo = new File ("reporte.txt");
    }
    
  
   public void escribir() throws FileNotFoundException{
        ArrayList <Estacion> estaciones=ciudad.getEstacion();
        PrintStream salida=new PrintStream(archivo);
        for(Estacion estacion:estaciones){
        salida.print("Bogotá");
        }
       
       
       
   }  
   
    
    
}
