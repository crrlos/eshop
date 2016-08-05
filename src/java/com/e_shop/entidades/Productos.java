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
public class Productos extends Entidad {

    private int idproducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private String imagen;
    private int cantidad;
    private double peso;
    private int id_subcategoria;

    public Productos() {
        init();
    }

    public Productos(int idproducto, String nombre, String descripcion, double precio, String imagen, int cantidad, double peso, int id_subcategoria) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
        this.cantidad = cantidad;
        this.peso = peso;
        this.id_subcategoria = id_subcategoria;
        init();
    }

    public Productos(String nombre, String descripcion, double precio, String imagen, int cantidad, double peso, int id_subcategoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
        this.cantidad = cantidad;
        this.peso = peso;
        this.id_subcategoria = id_subcategoria;
        init();
    }

    public Productos(String descripcion, double precio, String imagen, int cantidad, double peso, int id_subcategoria) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
        this.cantidad = cantidad;
        this.peso = peso;
        this.id_subcategoria = id_subcategoria;
        init();
    }

    public Productos(double precio, String imagen, int cantidad, double peso, int id_subcategoria) {
        this.precio = precio;
        this.imagen = imagen;
        this.cantidad = cantidad;
        this.peso = peso;
        this.id_subcategoria = id_subcategoria;
        init();
    }

    public Productos(String imagen, int cantidad, double peso, int id_subcategoria) {
        this.imagen = imagen;
        this.cantidad = cantidad;
        this.peso = peso;
        this.id_subcategoria = id_subcategoria;
        init();
    }

    public Productos(int cantidad, double peso, int id_subcategoria) {
        this.cantidad = cantidad;
        this.peso = peso;

        this.id_subcategoria = id_subcategoria;
        init();
    }

    public Productos(double peso, int id_subcategoria) {
        this.peso = peso;
        this.id_subcategoria = id_subcategoria;
        init();
    }

    public Productos(int id_subcategoria) {
        this.id_subcategoria = id_subcategoria;

        init();
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getId_subcategoria() {
        return id_subcategoria;
    }

    public void setId_subcategoria(int id_subcategoria) {
        this.id_subcategoria = id_subcategoria;
    }

    private void init() {
        AUTO_INCREMENT = true;
        PRIMARY_KEY = "idproducto";
    }

}
