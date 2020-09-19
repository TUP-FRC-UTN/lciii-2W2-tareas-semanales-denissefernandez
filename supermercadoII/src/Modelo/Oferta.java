/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Denise
 */
public class Oferta {
    private int id;
    private Producto producto;
    private double PrecioNormal;
    private double preciOferta;   
    private int stock;
    private String fechaInicio;
    private int vigencia;

    public Oferta(int id, Producto producto, double PrecioNormal, double preciOferta, int stock, String fechaInicio, int vigencia) {
        this.id = id;
        this.producto = producto;
        this.PrecioNormal = PrecioNormal;
        this.preciOferta = preciOferta;
        this.stock = stock;
        this.fechaInicio = fechaInicio;
        this.vigencia = vigencia;
    }

    public int getId() {
        return id;
    }

    public Producto getProducto() {
        return producto;
    }

    public double getPrecioNormal() {
        return PrecioNormal;
    }

    public double getPreciOferta() {
        return preciOferta;
    }

    public int getStock() {
        return stock;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public int getVigencia() {
        return vigencia;
    }
    
    
    
    
}
