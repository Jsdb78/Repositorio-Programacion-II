/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainvernadero;

/**
 *
 * @author Jonathan
 */
public class Suculenta extends Planta implements Tratable {
    
    private static double UmbralHumedadBajo = 15.0;
    private static double IncrementoHidratacion = 2.5;
    
    public Suculenta(String CodigoInventario, String FamiliaTaxonomica,double NivelHumedad, String EstadoVital){
        super(CodigoInventario, FamiliaTaxonomica, NivelHumedad, EstadoVital);
    }
    
    @Override
    public void Hidratar(){
        this.NivelHumedad += IncrementoHidratacion;
        
        System.out.println("---------------------------------------------");
        System.out.println("Brazo Robotico Ejecutando Comando: Hidtratar");
        System.out.println("Codigo de Inentario: "+getCodigoInventario());
        System.out.println("Familia Taxonomica : "+FamiliaTaxonomica);
        System.out.println("Estado Vital       : "+EstadoVital);
        System.out.println("Humedad Actual     : "+this.NivelHumedad + "% (+" + IncrementoHidratacion + " %)");
        
        if (this.NivelHumedad > UmbralHumedadBajo){
            System.out.println("ALERTA: Riesgo de Pudricion, sobrepaso el umbral bajo" + UmbralHumedadBajo +" %");
        }
        else{
            System.out.println("Estado de Riego Optimo, dentro del porcentaje seguro");
        }
        System.out.println("---------------------------------------------");
    }
    
    @Override
    public void Podar(){
        System.out.println("---------------------------------------------");
        System.out.println("Brazo Robotico Ejecutando Comando: Podar");
        System.out.println("Codigo de Inentario: "+getCodigoInventario());
        System.out.println("Familia Taxonomica : "+FamiliaTaxonomica);
        System.out.println("Estado Vital       : "+EstadoVital);
        System.out.println("Accion Realizada   : Se Cortaron las hojas secas y brotes danados");
        System.out.println("---------------------------------------------");
    }

}//fin class suculenta
