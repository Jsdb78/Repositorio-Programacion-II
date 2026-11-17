/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemainvernadero;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class SistemaInvernadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Suculenta> suculentas = new ArrayList<>();

        Suculenta s1 = new Suculenta("SUC-01", "Crassulaceae", 14.0, "Apta para exhibicion");
        Suculenta s2 = new Suculenta("SUC-02", "Cactaceae", 18.0, "En cuarentena");
        Suculenta s3 = new Suculenta("SUC-03", "Asphodelaceae", 21.0, "Apta para exhibicion");

        s2.EstadoVital = "Apta para exhibicion";

        suculentas.add(s1);
        suculentas.add(s2);
        suculentas.add(s3);

        for (Suculenta suculenta : suculentas) {
            suculenta.Hidratar();
        }
        s1.Podar();
    }
    
}//fin main
