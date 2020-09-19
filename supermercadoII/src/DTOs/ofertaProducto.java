/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import Modelo.Producto;

/**
 *
 * @author Denise
 */
public class ofertaProducto {
    
    private int id;
     private String nombre;
    private double PrecioNormal;
    private double preciOferta;   
    private int stock;
    private String fechaInicio;
    private int vigencia;

    public ofertaProducto(int id, String nombre, double PrecioNormal, double preciOferta, int stock, String fechaInicio, int vigencia) {
        this.id = id;
        this.nombre = nombre;
        this.PrecioNormal = PrecioNormal;
        this.preciOferta = preciOferta;
        this.stock = stock;
        this.fechaInicio = fechaInicio;
        this.vigencia = vigencia;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
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
