/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaplantacontrolensabladora;

/**
 *
 * @author Jonathan
 */
public class BrazoRobotico extends EquipoIndustriales implements ICalibracion{
    private String tipoSoldadura;
    
    public BrazoRobotico (String numSerie, String tiposol){
        super(numSerie);
        this.tipoSoldadura = tiposol;
    }
    public String getSoldadura(){
        return this.tipoSoldadura;
    }
    
    @Override
    public void procesarMaterial(){
        System.out.print("Esta maquina opera con la soldadura: ");
        System.out.println(""+getSoldadura());
    }
    
    @Override
    public void IniciarCalibracion (){
        System.out.println("Iniciio de Calibracion Brazo");
        System.out.println("Numero de Serie:"+this.NumeroSerie);
    };
    
    @Override
    public void TerminarCalibracion (){
        System.out.println("Calibracion con exito");
    }
    
    @Override
    public boolean ObtenerEstadoCalibracion(){
        return this.estadoOperativo;
    }
}
