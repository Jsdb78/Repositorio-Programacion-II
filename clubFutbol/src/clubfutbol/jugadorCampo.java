/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubfutbol;

import java.util.Set;

/**
 *
 * @author Jonathan
 */
public class jugadorCampo extends miembroEquipo{
    private String posicionTactica;
    private int golesMarcados;
    
    public jugadorCampo(String liga, int goles){
        
        super(liga);
        this.golesMarcados = goles;
    }

    //setters
    public void setPosicionTactica(String posicion) {
        if(posicion.isBlank()){
            this.posicionTactica = "Sin Posicion";
        }
        else{
            this.posicionTactica = posicionTactica;
        }
    }//fin set posicion

    public void setGolesMarcados(int golesMarcados) {
        if(golesMarcados<0){
            this.golesMarcados = 0;
            System.out.println("No puede haber goles negativos");
        }else{
            this.golesMarcados = golesMarcados;
        }
    }//fin set goles

    //getters
    public String getPosicionTactica() {
        return posicionTactica;
    }//fin get posiocion

    public int getGolesMarcados() {
        return golesMarcados;
    }//fin goles
    
   public void disputarPartido(){
       int goles = 0;
       System.out.println("Seleccionada Oficial");
       System.out.println("--------------------");
       
       iniciarPretemporada();
       System.out.printf("Jugador proveniente de: %s, sale de la cancha",this.ligaOrigen);
       
       while(goles<this.golesMarcados){
           if(goles %2 == 0){
               System.out.printf("Gol #%d par anotado de pierna izquierda.\n",goles+1);
           }
           else
           {
               System.out.printf("Gol #%d impar anotado de pierna derecha.\n",goles+1);
           }
           goles++;
       }//fin ciclo while
       
       System.out.println("Prrrrr....Fin de partido");
       
       setSumarMinutos(90);
       
   }//fin disputar partido
    
  
    
}//fin jugador campo
