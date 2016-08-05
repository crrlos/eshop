/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.e_shop.entidades;

/**
 *
 * @author Carlos
 */
public class Compras extends Entidad {

    private int idcompra;
    private String fecha_compra;

    Compras() {
        init();
    }

    public Compras(int idcompra, String fecha_compra) {
        init();
        this.idcompra = idcompra;
        this.fecha_compra = fecha_compra;
    }

    public Compras(String fecha_compra) {
        init();
        this.fecha_compra = fecha_compra;
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    private void init() {
        AUTO_INCREMENT = true;
        PRIMARY_KEY = "idcompra";
    }

}
