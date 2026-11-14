/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cieloslimpios;

/**
 *
 * @author Jonathan
 */
public class CielosLimpios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        dronReconocimientoTactico[] escuadronTactico = {
            new dronReconocimientoTactico("TACTICO-01", 90, true),
            new dronReconocimientoTactico("TACTICO-02", 85, true),
            new dronReconocimientoTactico("TACTICO-03", 95, true)
        };

        //Escuadrón Pesado
        dronCarga[] escuadronPesado = {
            new dronCarga("CARGA-01", 100, true, 50.0),
            new dronCarga("CARGA-02", 80, true, 40.0)
        };

        System.out.println("=== INICIO DE OPERACION 'CIELOS LIMPIOS' ===\n");

        //Escuadron Tactico y Escuadron Pesado
        System.out.println("--- SUPERVISION DEL ESCUADRON TACTICO ---");
        for (int i = 0; i < escuadronTactico.length; i++) {
            System.out.println("\nProcesando Unidad: " + escuadronTactico[i].getCodigoSerial());
            escuadronTactico[i].generarMapeoEstocastico();
            escuadronTactico[i].analizarAmenazas();
        }//fin escuadron Tactico

        
        System.out.println("\n--- SUPERVISION DEL ESCUADRON PESADO ---");
        for (int i = 0; i < escuadronPesado.length; i++) {
            System.out.println("\nProcesando Unidad: " + escuadronPesado[i].getCodigoSerial());
            escuadronPesado[i].engancharDesecho(20.0);
            escuadronPesado[i].engancharDesecho(35.0);
            escuadronPesado[i].descargarContenedorBase();
        }//fin escuadron Pesado

        //Desgaste post-misión
        System.out.println("\n=== REVISION DEL DESGASTE POST-MISION ===");
        escuadronTactico[0].setNivelEnergia(50);
        escuadronTactico[1].setNivelEnergia(-10);
        escuadronTactico[2].setNivelEnergia(150);

        escuadronPesado[0].setNivelEnergia(40);
        escuadronPesado[1].setNivelEnergia(10);

        // Telemetría final de los Drones 
        System.out.println("\n=== TELEMETRIA FINAL DE TODAS LAS UNIDADES ===");
        
        System.out.println("\n[Unidades Tacticas]");
        for (dronReconocimientoTactico dron : escuadronTactico) {
            dron.transmitirEstadoRed();
        }

        System.out.println("\n[Unidades de Carga]");
        for (dronCarga dron : escuadronPesado) {
            dron.transmitirEstadoRed();
        }
    
        
    }//fin main
    
}//fin class
