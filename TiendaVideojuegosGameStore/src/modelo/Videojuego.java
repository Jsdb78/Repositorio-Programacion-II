package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jonathan
 */
public class Videojuego {
    protected String Titulo;
    protected String Genero;
    protected double PrecioBase;
    protected boolean IncluyeDLC;
    protected boolean EsEdicionEspecial;
    
    public Videojuego (String Titulo, String Genero, double PrecioBase, boolean IncluyeDLC, boolean EsEdicionEspecial){
        this.Titulo = Titulo;
        this.Genero = Genero;
        this.PrecioBase = PrecioBase;
        this.IncluyeDLC = IncluyeDLC;
        this.EsEdicionEspecial = EsEdicionEspecial;
    }
    
    public double calcularPrecioFinal() {
        double total = PrecioBase;
        if (IncluyeDLC) {
            total += 15.00;
        }
        if (EsEdicionEspecial) {
            total += PrecioBase * 0.20;
        }
        return total;
    }
    
    public String generarFicha() {
        StringBuilder sb = new StringBuilder();
        sb.append("------------------------------\n");
        sb.append("      GAMESTORE COTIZACION    \n");
        sb.append("------------------------------\n");
        sb.append("Titulo: ").append(Titulo).append("\n");
        sb.append("Genero: ").append(Genero).append("\n");
        sb.append("Precio Base: $").append(String.format("%.2f", PrecioBase)).append("\n");
        sb.append("Incluye DLC: ").append(IncluyeDLC ? "Sí (+$15.00)" : "No").append("\n");
        sb.append("Edicion Especial: ").append(EsEdicionEspecial ? "Sí (+20%)" : "No").append("\n");
        return sb.toString();
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public double getPrecioBase() {
        return PrecioBase;
    }
    
}
