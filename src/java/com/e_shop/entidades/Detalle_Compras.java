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
public class Detalle_Compras extends Entidad {

    private int iddetalle_compras;
    private int idcompra;
    private int idproducto;
    private int cantidad;
    private double precio_compra;

    public Detalle_Compras() {
        init();
    }

    public Detalle_Compras(int iddetalle_compras, int idcompra, int idproducto, int cantidad, double precio_compra) {
        this.iddetalle_compras = iddetalle_compras;
        this.idcompra = idcompra;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.precio_compra = precio_compra;
        init();
    }

    public Detalle_Compras(int idcompra, int idproducto, int cantidad, double precio_compra) {
        this.idcompra = idcompra;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.precio_compra = precio_compra;
        init();
    }

    public Detalle_Compras(int idproducto, int cantidad, double precio_compra) {
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.precio_compra = precio_compra;
        init();
    }

    public Detalle_Compras(int cantidad, double precio_compra) {
        this.cantidad = cantidad;
        this.precio_compra = precio_compra;
        init();
    }

    public Detalle_Compras(double precio_compra) {
        this.precio_compra = precio_compra;
        init();
    }

    public int getIddetalle_compras() {
        return iddetalle_compras;
    }

    public void setIddetalle_compras(int iddetalle_compras) {
        this.iddetalle_compras = iddetalle_compras;
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    private void init() {
        AUTO_INCREMENT = true;
        PRIMARY_KEY = "iddetalle_compras";
    }

}
