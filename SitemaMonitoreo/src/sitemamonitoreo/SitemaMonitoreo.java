/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sitemamonitoreo;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class SitemaMonitoreo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SensorAmbiental prueba = new SensorAmbiental("AA:BB:CC:DD",100,0,true);
        Scanner scan = new Scanner(System.in);
        boolean cicloActivo = true;
        char seleccionMenu = 'A';
        
        while (cicloActivo){
            System.out.println("Menu de control");
            System.out.println("1: Ingresar Nueva Lectura Termica");
            System.out.println("2: Actualizar Lectura del Higrometro");
            System.out.println("3: Solicitud de Diagnostico Completo");
            System.out.println("4: Inicio de Secuencia de Apagado");
            System.out.println("Seleccion: ");
            seleccionMenu = scan.next().charAt (0);
            
            switch (seleccionMenu) {
                case '1':
                    System.out.println("Ingresa Temperatura: ");
                    double nuevaTemp = scan.nextDouble();
                    prueba.setTemperatura(nuevaTemp);
                    break;
                case '2':
                    System.out.println("Ingresa HR: ");
                    int nuevaHR = scan.nextInt();
                    prueba.setHumedadRelativa(nuevaHR);
                    break;
                case '3':
                    prueba.reporteEstado();
                    break;
                case '4':
                    cicloActivo = false;
                    System.out.println("Cerrando....cerrando");
                    System.out.println("Ya casi.....");
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Compa..... es del 1 al 4");
                    System.out.println("Opcion invalida");
            }
            
        }//fin while
        
    }//fin main
    
}//fin class sensor
