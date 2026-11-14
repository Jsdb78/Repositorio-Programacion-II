/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedioestudiante;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class PromedioEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        /*
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        double Promedio = 0;
        String nombre = "JD";
        /*
        System.out.print("Ingresa la 1ra nota: ");
        nota1 = scan.nextInt();
        
        System.out.print("Ingresa la 2da nota: ");
        nota2 = scan.nextInt();
        
        System.out.print("Ingresa la 3ra nota: ");
        nota3 = scan.nextInt();
        */
        Estudiante Jonathan = new Estudiante();
        Estudiante Sameul = new Estudiante();
        Jonathan.nota1=Jonathan.IngresoNota(scan, "1ra");
        Jonathan.nota2=Jonathan.IngresoNota(scan, "2da");
        Jonathan.nota3=Jonathan.IngresoNota(scan, "3ra");
        
        Sameul.nota1=Sameul.IngresoNota(scan, "1ra");
        Sameul.nota2=Sameul.IngresoNota(scan, "2da");
        Sameul.nota3=Sameul.IngresoNota(scan, "3ra");
        
        Jonathan.promedio = Jonathan.CalculoPromedio(Jonathan.nota1, 
                            Jonathan.nota2, Jonathan.nota3);
        
        Sameul.promedio = Sameul.CalculoPromedio(Sameul.nota1, 
                            Sameul.nota2, Sameul.nota3);
        
        if (Jonathan.promedio >= 70){
            System.out.println("Aprbado");
        } else{
            System.out.println("Reprobado");
        }
        
        if (Sameul.promedio >= 70){
            System.out.println("Aprbado");
        } else{
            System.out.println("Reprobado");
        }
    }// Fin Main
    /*
    public static int IngresoNota(Scanner scan, String numNota){
        int notaTemporal = 0;
        
        System.out.printf("Inresa la %s Nota: ", numNota);
                notaTemporal = scan.nextInt();
                
                notaTemporal = ValidarNota(notaTemporal, 0, 100);
                return notaTemporal;
    }//Fin IngresaNota
   
    public static int ValidarNota(int nota, int limINF, int limSUP) {
        Scanner scan = new Scanner(System.in);
        do {
        if(nota<limINF || nota>limSUP){
            System.out.println("Nota Fuera de Rango");
            System.out.printf("Limites son %d - %d \n", limINF,limSUP);
            System.out.println("Ingrese Nuevamente la nota");
            System.out.print("Nota: ");
            nota = scan.nextInt();
        }
        
        } while (nota<limINF || nota>limSUP);
        return nota;
    }//Fin ValidarNota
        
    public static double CalculoPromedio (int n1, int n2, int n3){
        double valorTemporal = 0;
    
         valorTemporal = (n1+n2+n3)/3;
         return valorTemporal;
    }// Fin CalculoPromedio*/
}// Fin Class
