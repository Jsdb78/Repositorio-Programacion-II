/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainvernadero;

/**
 *
 * @author Jonathan
 */
public class Planta {
    
    private String CodigoInventario;
    protected String FamiliaTaxonomica;
    protected double NivelHumedad;
    public String EstadoVital;
    
    public Planta(String CodigoInventario, String FamiliaTaxonomica, double NivelHumedad, String EstadoVital){
        
        this.CodigoInventario = CodigoInventario;
        this.FamiliaTaxonomica = FamiliaTaxonomica;
        this.NivelHumedad = NivelHumedad;
        this.EstadoVital = EstadoVital;
        
    }
    
    public String getCodigoInventario(){
        return CodigoInventario;
    }
     
}//fin class planta
