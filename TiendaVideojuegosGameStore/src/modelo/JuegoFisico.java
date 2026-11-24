/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jonathan
 */
public class JuegoFisico extends Videojuego {
    
    private double CostoEnvio;
    
    public JuegoFisico(String Titulo, String Genero, double PrecioBase, boolean IncluyeDLC, boolean EsEdicionEspecial, double CostoEnvio){
        super(Titulo, Genero, PrecioBase, IncluyeDLC, EsEdicionEspecial);
        this.CostoEnvio = CostoEnvio;
    }
    
    @Override
    public double calcularPrecioFinal() {
        return super.calcularPrecioFinal() + CostoEnvio;
    }

    @Override
    public String generarFicha() {
        StringBuilder sb = new StringBuilder(super.generarFicha());
        sb.append("Formato: FÍSICO\n");
        sb.append("Costo de Envío: $").append(String.format("%.2f", CostoEnvio)).append("\n");
        sb.append("------------------------------\n");
        sb.append("TOTAL A PAGAR: $").append(String.format("%.2f", calcularPrecioFinal())).append("\n");
        return sb.toString();
    }
    
}
