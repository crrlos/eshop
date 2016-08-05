/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.e_shop.entidades;

import java.util.Vector;

/**
 *
 * @author carlos
 */
public class Pedidos extends Entidad{
    
    private int idpedido;
    private int idcliente;
    private String estado;

    public Pedidos(int idpedido, int idcliente, String estado) {
        this.idpedido = idpedido;
        this.idcliente = idcliente;
        this.estado = estado;
        init();
    }

    
    

    public Pedidos(int idcliente, String estado) {
        this.idcliente = idcliente;
        this.estado = estado;
        init();
    }

    public Pedidos(String estado) {
        this.estado = estado;
        init();
    }
    
    

    
    public Pedidos() {
        
    init();
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    
    private void init() {
        AUTO_INCREMENT = true;
        PRIMARY_KEY = "idpedido";
    }
    
}
