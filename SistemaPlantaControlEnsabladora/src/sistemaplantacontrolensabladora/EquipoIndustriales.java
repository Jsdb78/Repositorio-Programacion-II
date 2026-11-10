/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaplantacontrolensabladora;

/**
 *
 * @author Jonathan
 */
public abstract class EquipoIndustriales {
    public String NumeroSerie;
    public boolean estadoOperativo;
    protected int horasUso;
    protected double capacidadCarga;
    
    public EquipoIndustriales(String numSerie){
    
        this.NumeroSerie = numSerie;
    }

    public String getNumeroSerie() {
        return NumeroSerie;
    }

    public boolean isEstadoOperativo() {
        return estadoOperativo;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setNumeroSerie(String NumeroSerie) {
        this.NumeroSerie = NumeroSerie;
    }

    public void setEstadoOperativo(boolean estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    
    
    public void encender(){}
    
    public void apagar(){}
    
    public abstract void procesarMaterial();
}//fin class
