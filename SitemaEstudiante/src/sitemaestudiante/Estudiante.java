/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitemaestudiante;

/**
 *
 * @author Sergio
 */
public class Estudiante {
    // Atributos (variables)
    private int edad;
    private double estatura;
    private char genero;
    String nombre;
    String apellido;
    private double descuento;

    
    
    
    
    // Constructor
    public Estudiante(){
        this.edad = 0;
        this.estatura = 0;
        this.nombre = "Jonathan";
        this.apellido = "Degrandez";
    }// Fin de Constructor
    
    public Estudiante(int edad, double estatura){
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = "Jonathan";
        this.apellido = "Degrandez";
    }
    
   
    //Metodo (Funcion)
    public void MostrarDatos(){
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Apellido: %s\n", this.apellido);
        System.out.printf("Edad: %s\n", this.edad);
        System.out.printf("Estatura:%s\n",this.estatura);
    }//Fin Metodo MostrarDatos
    
    //Getter y Setter
    //Modificar la Edad
    public void setEdad(int edad){
        if(edad>0 && edad<100){
            this.edad = edad;
        }
        else{
              System.out.println("Eror");  
                }
    }
    
    
    //Obtener Edad
    public int getEdad(){
        return this.edad;
    }

    
    
    // genero
    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        if(genero == 'm' || genero == 'f'){
            this.genero = genero;
        }
        else{
            System.out.println("No es vvalido otro dato F/M");
        }
    }
    
    public void SETTER_Descuento(double descuento){
        if(this.edad>80){
            descuento = 0.40;
        }
        else if(this.edad<40){
            this.descuento = 0.25;
        }
        else if(this.edad<21){
            this.descuento = 0.10;
        }
        else{
            this.descuento = 0;
        }
        
        
        
    }//fin SETTER

    public double getDescuento() {
        return descuento;
    }

    

}// fin de Class estudiante;
