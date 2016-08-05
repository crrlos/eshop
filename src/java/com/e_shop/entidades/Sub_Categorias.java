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
public class Sub_Categorias extends Entidad{
    private int idsub_categoria;
    private int idcategoria;
    private String  nombre_subcategoria;

    public Sub_Categorias() {
        init();
    }

    public Sub_Categorias(String nombre_subcategoria) {
        this.nombre_subcategoria = nombre_subcategoria;
        init();
    }
    
    

    public Sub_Categorias(int idsub_categoria, int idcategoria, String nombre_subcategoria) {
        this.idsub_categoria = idsub_categoria;
        this.idcategoria = idcategoria;
        this.nombre_subcategoria = nombre_subcategoria;
        init();
    }

    public Sub_Categorias(int idcategoria, String nombre_subcategoria) {
        this.idcategoria = idcategoria;
        this.nombre_subcategoria = nombre_subcategoria;
        init();
    }

    public int getIdsub_categoria() {
        return idsub_categoria;
    }

    public void setIdsub_categoria(int idsub_categoria) {
        this.idsub_categoria = idsub_categoria;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombre_subcategoria() {
        return nombre_subcategoria;
    }

    public void setNombre_subcategoria(String nombre_subcategoria) {
        this.nombre_subcategoria = nombre_subcategoria;
    }
    
    
    
    
    
    private void init()
    {
        AUTO_INCREMENT = true;
        PRIMARY_KEY =   "idsub_categoria";
    }
    
}
