/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosistema_smart_home;

/**
 *
 * @author jonathan
 */
public class FocoInteligente extends Dispositivo implements Conexiones {
    
   public FocoInteligente(String marca) {
       super(marca);
   }
   
   @Override
   void encender(){
       System.out.println("Foco encendido al 100%");
   }
    
   
   @Override
   public void conectarRed(){
       System.out.println("Conenctando al router vvia Wi-Fi");
   }
}//fin foco inteligente
