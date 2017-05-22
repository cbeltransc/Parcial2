/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacial2poo;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Pacial2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Datos dato=new Datos(); 
       
        Scanner teclado=new Scanner(System.in);
        int b=0;
        String a=null;  
       
       
        System.out.println("Inserte los datos a continuacion");
        System.out.println("Ciudad: ");
        a=teclado.next();
        System.out.println("Numero de estaciones:");
        b=teclado.nextInt();
        String c[]=new String [b];
        String d[]=new String [b];
        String e[]=new String [b];
        String f=null;
        int g=0;
        int h[]=null;
        int k[]=null;
        int l[]=null;
        for (int i = 0; i < b; i++) {
            System.out.println("Inserte el nombre de la estacion");
            c[i]=teclado.next();
            System.out.println("Inserte la ubicacion");
            d[i]=teclado.next();
            System.out.println("Inserte la fecha");
            e[i]=teclado.next();
            System.out.println("Cuantos datos ofrece esta estación");
            g=teclado.nextInt();
            h=new int[g];
            k=new int[g];
            l=new int [g];
            for (int j = 0; j < g; j++) {
                System.out.println("Ingrese la cantidad de lluvia en milimetros:");
                h[j]=teclado.nextInt();
                System.out.println("Ingrese la temperatura");
                k[j]=teclado.nextInt();
                System.out.println("Ingrese nivel de carga electrica: 1 – Tormenta Eléctrica, 2 – Rayos 3 – Truenos, 4 - Normal");
                l[j]=teclado.nextInt();
                
                
            }
        } 
        
        Ciudad c1=new Ciudad(a);       
        Estacion e1=new Estacion(c[0]);
        e1.setUbicacion(d[0]);
        e1.setFecha(d[0]);
        Estacion e2=new Estacion(c[1]);
        e2.setUbicacion(d[1]);
        e2.setFecha(d[1]);
        c1.addEstacion(e1);
        c1.addEstacion(e2);
        Sensor s1=new Agua(h[0]);
        Sensor s2=new Temperatura(k[0]);
        Sensor s3=new Cargaelectrica(l[0]);
        Sensor s4=new Agua(h[1]);
        Sensor s5=new Temperatura(k[1]);
        Sensor s6=new Cargaelectrica(l[1]);
        e1.addSensor(s1);
        e1.addSensor(s2);
        e1.addSensor(s3);
        e2.addSensor(s4);
        e2.addSensor(s5);
        e2.addSensor(s6);
        try{
        dato.escribir();
        }catch(FileNotFoundException ex){
            System.out.println("Archivo no encontrado.");
        }
    
}
}
