/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitemamonitoreo;

/**
 *
 * @author Sergio
 */
public class SensorAmbiental {
    //Atributos
    private String codigoMAC;
    private double temperaturaCelsius;
    private  int humedadRelativa;
    private boolean estado;
    
    public SensorAmbiental(String codigo, double tempCel, int humedadRel,Boolean estado){
        this.codigoMAC = codigo;
        this.temperaturaCelsius = tempCel;
        this.humedadRelativa = humedadRel;
        this.estado = estado;
    }//fin constructor
    
    //getter

    public String getCodigoMAC() {
        return this.codigoMAC;
    }

    public double getTemperaturaCelsius() {
        return this.temperaturaCelsius;
    }

    public int getHumedadRelativa() {
        return this.humedadRelativa;
    }

    public boolean isEstado() {
        return this.estado;
    }
    
    //setter
    public void setTemperatura(double tempC){
        if(tempC >= -40 && tempC <=125){
            this.temperaturaCelsius = tempC;
        System.out.println("Temperatura Actualizada");
    }
    else{
            System.out.println("Alerta de Seguridad");
            System.out.println("Lectura de Temperatura Descartada");
            System.out.println("Fuera de Rango");
        }//fin setter temperatura
}
    public void setHumedadRelativa(int hr){
        if (hr < 0 || hr >100){
            System.out.println("Advertencia...lectura erronea");
            this.humedadRelativa = 0;
        }
        else{
            this.humedadRelativa = hr;
            System.out.println("HR....actualizado");
        }
    }//fin de set humedad relativa
    
    public void setCodigoMAC(String coidgo){
        this.codigoMAC = codigoMAC;
    }//Fin setCodigo
    public void setEstado(boolean estado){
        this.estado = estado;
    }//fin setEstado
    
    public void reporteEstado(){
        System.out.printf("Temperatura: %.2f\n",this.temperaturaCelsius);
        System.out.printf("Humedad Relativa: %d\n",this.humedadRelativa);
        System.out.printf("Codigo: %s\n",this.codigoMAC);
        System.out.printf("Estado: %b\n",this.estado);
    }
    
}//fin class SensorAmbniental
