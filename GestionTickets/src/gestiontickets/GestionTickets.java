/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiontickets;

/**
 *
 * @author Jonathan
 */
public class GestionTickets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TareaBase tarea1 = new TareaBase("TB-01", "Prueba 1", true);
        tarea1.marcaResuelto();
        
        System.out.println("\nPrioridad: "+tarea1.calcularPrioridad());
        
        System.out.println("\n");
        System.out.println("SIGUE EL HIJO de TAREA BASE");
        System.out.println("");
        
        Bugs bugs1 = new Bugs("B-01","Prueba 1B", true,"Produccion");
        bugs1.marcaResuelto();
        System.out.println("\nPrioridad: "+bugs1.calcularPrioridad());
        
        System.out.println("\n");
        System.out.println("SIGUE EL NIETO de TAREA BASE");
        System.out.println("SIGUE EL HIJO de BUGS");
        System.out.println("");
        BugSeguridad bs = new BugSeguridad("BS-01","Prueba 1BS",true,"Produccion","CVE - 1",true);
        
    }//fin main
    
}//fin class
