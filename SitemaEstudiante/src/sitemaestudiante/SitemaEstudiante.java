/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sitemaestudiante;

import java.util.HashSet;

/**
 *
 * @author Sergio
 */
public class SitemaEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante Oscar = new Estudiante();
        Estudiante Daniel = new Estudiante(15,1.9);
        
        System.out.println("------------------");
        Oscar.MostrarDatos();
        System.out.println("------------------");
        Daniel.MostrarDatos();
        System.out.println("------------------");
        
        Daniel.nombre = "Daniel";
        Oscar.nombre = "Oscar";
        
        Daniel.setEdad(90);
        Oscar.setEdad(25);
        System.out.println("");
        
        Daniel.MostrarDatos();
        Oscar.MostrarDatos();
        
        Daniel.setEdad(50);
        Daniel.MostrarDatos();
        Oscar.setEdad(20);
        Oscar.MostrarDatos();
        
        
        Daniel.SETTER_Descuento(0.90);
        System.out.println("%.2f\n" + Daniel.getDescuento());
        Daniel.SETTER_Descuento(0);
        }
}
