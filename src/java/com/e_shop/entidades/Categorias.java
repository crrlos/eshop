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
public class Categorias extends Entidad{
    private int idcategoria;
    private String nombre_categoria;

    public Categorias() {
    init();
    }
    

    public Categorias(int idcategoria, String nombre_categoria) {
        this.idcategoria = idcategoria;
        this.nombre_categoria = nombre_categoria;
        init();
    }

    public Categorias(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
        init();
    }
    
    

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }
    
    
    
    
    
    private void init()
    {
        AUTO_INCREMENT = true;
        PRIMARY_KEY = "idcategoria";
    }
    
    
    
}
