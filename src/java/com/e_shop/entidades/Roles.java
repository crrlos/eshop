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
public class Roles extends Entidad {

    private int idrol;
    private String nombre_rol;
    private String campo;

    public Roles() {
        init();
    }

    
    

    public Roles(int idrol, String nombre_rol,String campo) {
        this.idrol = idrol;
        this.nombre_rol = nombre_rol;
        this.campo = campo;
        init();
    }

    public Roles(String nombre_rol) {
        this.nombre_rol = nombre_rol;
        init();
    }

    
    
    private void init() {
        AUTO_INCREMENT = true;

        PRIMARY_KEY = "idrol";
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public String getCampo() {
        return campo;
    }
    
    

}
