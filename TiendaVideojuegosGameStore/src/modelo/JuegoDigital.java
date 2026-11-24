/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jonathan
 */
public class JuegoDigital extends Videojuego {
    private String CodigoActivacion;
    private double PorcentajeDescuento;
    

    public JuegoDigital(String titulo, String genero, double precioBase, boolean incluyeDLC, boolean esEdicionEspecial, double porcentajeDescuento) {
        super(titulo, genero, precioBase, incluyeDLC, esEdicionEspecial);
        this.PorcentajeDescuento = porcentajeDescuento;
        int numeroAleatorio = (int) (Math.random() * 9000) + 1000;
        this.CodigoActivacion = "GS-" + numeroAleatorio + "-DIG";
    }

    @Override
    public double calcularPrecioFinal() {
        double subtotal = super.calcularPrecioFinal();
        return subtotal - (subtotal * PorcentajeDescuento);
    }

    @Override
    public String generarFicha() {
        StringBuilder sb = new StringBuilder(super.generarFicha());
        sb.append("Formato: DIGITAL\n");
        sb.append("Descuento aplicado: ").append(String.format("%.0f%%", PorcentajeDescuento * 100)).append("\n");
        sb.append("Clave de activacion: ").append(CodigoActivacion).append("\n");
        sb.append("------------------------------\n");
        sb.append("TOTAL A PAGAR: $").append(String.format("%.2f", calcularPrecioFinal())).append("\n");
        return sb.toString();
    }
}
