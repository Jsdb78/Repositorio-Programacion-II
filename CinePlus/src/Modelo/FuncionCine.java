/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jonathan
 */
public abstract class FuncionCine {
    private String pelicula;
    private String horario;
    private String idioma;
    private double precioBase;

    public FuncionCine(String pelicula, String horario, String idioma, double precioBase) {
        this.pelicula = pelicula;
        this.horario = horario;
        this.idioma = idioma;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioBoleto();

    public abstract String getTipoSalon();

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return pelicula + " | " + getTipoSalon() + " | " + horario + " | " + idioma;
    }
}
