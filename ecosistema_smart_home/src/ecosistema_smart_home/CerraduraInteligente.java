/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosistema_smart_home;

/**
 *
 * @author Jonathan
 */
public class CerraduraInteligente extends Dispositivo implements Conexiones {
    
    public CerraduraInteligente(String marca){
        super(marca);
    }//fin constructor
    
    @Override
    void encender(){
        System.out.println("Dispositivo magnetico activado");
    }
    
    @Override
    public void conectarRed(){
        System.out.println("Conexion via Bluetooth");
    }
    
}
