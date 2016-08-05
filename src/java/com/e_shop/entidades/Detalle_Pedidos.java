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
public class Detalle_Pedidos extends Entidad {

    private int iddetalle_pedido;
    private int idpedido;
    private int idproducto;
    private int cantidad;
    private double precio;
    
    

   

    public Detalle_Pedidos(int idpedido, int idproducto, int cantidad, double precio) {
        this.idpedido = idpedido;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.precio = precio;
        init();
    }

   

  
    
    

    public Detalle_Pedidos() {
        init();
    }

    public int getIddetalle_pedido() {
        return iddetalle_pedido;
    }

    public void setIddetalle_pedido(int iddetalle_pedido) {
        this.iddetalle_pedido = iddetalle_pedido;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private void init() {
        AUTO_INCREMENT = true;
        PRIMARY_KEY = "iddetalle_pedido";
    }

}
