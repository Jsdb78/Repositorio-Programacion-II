/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cieloslimpios;

/**
 *
 * @author Jonathan
 */
public class dronCarga extends Dron{
    private double cargaMaxPermitida;
    private double cargaActual;

    // Constructor
    public dronCarga(String codigoSerie, int nivelEnergia, boolean enRed, double cargaMaxPermitida) {
        super(codigoSerie, nivelEnergia, enRed);
        this.cargaMaxPermitida = cargaMaxPermitida;
        this.cargaActual = 0.0;
    }

    //Sensor de Sobrecarga
    public boolean evaluarPesoObjeto(double pesoNuevo) {
        return (this.cargaActual + pesoNuevo) <= this.cargaMaxPermitida;
    }

    //Grua de Recoleccion
    public void engancharDesecho(double pesoNuevo) {
        if (evaluarPesoObjeto(pesoNuevo)) {
            this.cargaActual += pesoNuevo;
            System.out.println("Dron de Carga " + getCodigoSerial()+ ": Exito! Desecho de " + pesoNuevo + " kg enganchado. Carga actual: " + cargaActual + " kg.");
        } else {
            System.out.println("Dron de Carga " + getCodigoSerial()+ ": Maniobra abortada. El objeto de " + pesoNuevo + " kg supera el limite permitido.");
        }
    }//fin Grua de Recoleccion

    //Protocolo de Vaciado
    public void descargarContenedorBase() {
        this.cargaActual = 0.0;
        System.out.println("Dron de Carga " + getCodigoSerial()+ ": Contenedor descargado en la base. Carga actual reiniciada a 0 kg.");
    }
}//fin dron carga
