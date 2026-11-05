package ecosistema_smart_home;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jonathan
 */
public abstract class Dispositivo {
    //atributos
    String marca;
    
    //constructor
    public Dispositivo(String marca){
        this.marca = marca;
    }
    
    //metodos
    abstract void encender();
    
    public void MostrarMarca(){
        System.out.println("Marca: "+this.marca);
    }
}//fin abtract class dispositivo
