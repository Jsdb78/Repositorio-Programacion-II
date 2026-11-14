/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cieloslimpios;

/**
 *
 * @author Jonathan
 */
public class Dron {
    //atributos
    private String codigoSerial;
    private int nivelEnergia;
    private boolean enRed;
    
    //constructor
    public Dron(String codigoSerial, int nivelEnergia, boolean enRed){
        this.codigoSerial = codigoSerial;
        setNivelEnergia(nivelEnergia);
        this.enRed = enRed;
    }
    
    //Protocolo Calibracion
    private void calibrarGiroscopioInterno() {
        System.out.println("SISTEMA Dron " + codigoSerial + ": Reajustando sensores y calibrando giroscopio...");
    }

    //Esstado de red
    public void transmitirEstadoRed() {
        System.out.println("--- REPORTE DE TELEMETRIA ---");
        System.out.println("Codigo de Serie: " + codigoSerial);
        System.out.println("Nivel de Energia: " + nivelEnergia + "%");
        System.out.println("En linea (Listo para ordenes): " + enRed);
        System.out.println("-----------------------------");
    }

    //Getters y Setters
    
    public void setCodigoSerial(String codigoSerie) {
        this.codigoSerial = codigoSerie;
    }//fin set codigoSerial
    
    public String getCodigoSerial() {
        return codigoSerial;
    }//fin get codigoSerial

    
    public int getNivelEnergia() {
        return nivelEnergia;
    }//fin get nivel de energia

    //porcentaje de enrgia
    public void setNivelEnergia(int nivelEnergia) {
        if (nivelEnergia < 0) {
            this.nivelEnergia = 0;
        } else if (nivelEnergia > 100) {
            this.nivelEnergia = 100;
        } else {
            this.nivelEnergia = nivelEnergia;
        }//fin porcentaje de energia
        
        calibrarGiroscopioInterno();
    }//fin set porcetanje de enrgia

    public boolean isEnRed() {
        return enRed;
    }

    public void setEnRed(boolean enRed) {
        this.enRed = enRed;
    }
    
}//fin class dron
