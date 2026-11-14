/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubfutbol;

/**
 *
 * @author Jonathan
 */
public class ClubFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        jugadorCampo jonathan = new jugadorCampo("liga esnola",4);
        
        jonathan.setSalarioMensual(-5000);
        System.out.println("");
        
        jonathan.setSalarioMensual(15000);
        
        jonathan.setPosicionTactica("Delantero estrella");
        
                
        jonathan.disputarPartido();
        
        
    }//fin main
    
}//  fin class
