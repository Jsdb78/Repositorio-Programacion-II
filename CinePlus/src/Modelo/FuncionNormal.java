/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jonathan
 */
public class FuncionNormal extends FuncionCine {
    
    public FuncionNormal(String pelicula, String horario, String idioma, double precioBase) {
        super(pelicula, horario, idioma, precioBase);
    }

    @Override
    public double calcularPrecioBoleto() {
        return getPrecioBase();
    }

    @Override
    public String getTipoSalon() {
        return "Salón Normal";
    }
    
}
