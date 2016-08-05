/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.e_shop.entidades;

/**
 *
 * @author carlos
 */
public class Costo_Envio extends Entidad {

    private int idcosto_envio;
    private double peso;
    private double precio;

    public Costo_Envio(int idcosto_envio, double peso, double precio) {
        this.idcosto_envio = idcosto_envio;
        this.peso = peso;
        this.precio = precio;
        init();
    }

    public Costo_Envio(double peso, double precio) {
        this.peso = peso;
        this.precio = precio;
        init();
    }

    public Costo_Envio(double precio) {
        this.precio = precio;
        init();
    }

    public Costo_Envio() {
        init();
    }

    public int getIdcosto_envio() {
        return idcosto_envio;
    }

    public void setIdcosto_envio(int idcosto_envio) {
        this.idcosto_envio = idcosto_envio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private void init() {
        AUTO_INCREMENT = true;
        PRIMARY_KEY = "idcosto_envio";
    }

}
