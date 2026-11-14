/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cieloslimpios;

import java.util.Random;

/**
 *
 * @author Jonathan
 */
public class dronReconocimientoTactico extends Dron{
    private int [] cuadrantesForestales;
    
    public dronReconocimientoTactico(String codigoSerial, int nivelEnergia, boolean enRed){
        super(codigoSerial, nivelEnergia, enRed);
        this.cuadrantesForestales = new int[7];
    }
    
    public void generarMapeoEstocastico() {
        Random random = new Random();
        for (int i = 0; i < cuadrantesForestales.length; i++) {
            cuadrantesForestales[i] = random.nextInt(51);
        }
        System.out.println("Dron Tactico " + getCodigoSerial()+ ": Mapeo estocastico generado en los 7 cuadrantes.");
    }

    
    private void emitirAlertaIncendio() {
        System.out.println("ALERTA ROJA!!! Posible incendio en el sector (Unidad: " + getCodigoSerial()+ ")");
    }

    //Analizador de Amenzas
    public void analizarAmenazas() {
        boolean peligroInminente = false;
        
        for (int lectura : cuadrantesForestales) {
            if (lectura > 35) {
                peligroInminente = true;
                break;
            }
        }

        if (peligroInminente) {
            emitirAlertaIncendio();
        } else {
            System.out.println("Dron Tactico " + getCodigoSerial()+ ": Niveles seguros. Sin amenazas detectadas.");
        }
    }//fin Analizador de amenzas
    
}//fin dronReconocimientoTactico
