/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecosistema_smart_home;

/**
 *
 * @author jonathan
 */
public class Ecosistema_smart_home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dispositivo miCasa[] = {
                                    new FocoInteligente("Philips") ,
                                    new CerraduraInteligente("Yale")
                               };
        
        miCasa[0].encender();
        miCasa[0].MostrarMarca();
        ((Conexiones)miCasa[1]).conectarRed();
        
        System.out.println("---------------------------");
        miCasa[1].encender();
        miCasa[1].MostrarMarca();
        ((Conexiones)miCasa[1]).conectarRed();
        
    }//fin main
    
}//fin class
