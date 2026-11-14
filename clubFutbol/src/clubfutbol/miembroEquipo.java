package clubfutbol;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jonathan
 */
public class miembroEquipo {
    protected String ligaOrigen;
    private double salarioMensual;
    private boolean altaMedica;
    private int minutosJugados;
    
    public miembroEquipo(String liga){
        this.altaMedica = false;
        this.minutosJugados = 0;
        this.salarioMensual= 1000;
    }//fin constructor
    
    public void setSalarioMensual(double salario){
        if(salario>0){
            this.salarioMensual = salario;
        }
        else
        {
            System.out.println("Alerta.... Contrato Invalido");
        }
    }//fin metodo setsalario mensual
    
    public void iniciarPretemporada(){
        this.altaMedica = true;
        realizarPruebasFisicas();
        this.altaMedica = true;
        System.out.println("se dio el alta medica");
    }//fin metodo iniciar pretemporada
    
    private void realizarPruebasFisicas(){
        System.out.println("Realizando Pruebas Fisicas");
        String[] fases = new String[]{
            "Resistencia Fisica","Fuerza","Velocidad"};
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("Aprobando Fase %d: %s\n",i+1,fases[i]);
        }//fin ciclo for
    }//fin metodo realizar pruebas fisicas
    
    public void setSumarMinutos(int cantidad){
        if(cantidad>0){
            System.out.println("Sumando Minutos al jugador");
            this.minutosJugados += cantidad;
        }//fin if
    }//fin sumar minutos
    
    public void VisualizacionDatos(){
        System.out.printf("Liga Origen: %s",this.ligaOrigen);
    }
    
}// fin mienbro equipo
