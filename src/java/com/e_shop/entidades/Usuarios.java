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
public class Usuarios extends Entidad {
   private int idusuario;
   private String nombreusuario;
   private String nombres;
   private String apellidos;
   private String telefono;
   private String direccion;
   private String correo;
   private String fecha_registro;
   private String fecha_nacimiento;
   private int idrol;
   private String clave;
   private int estado_cuenta;

    public Usuarios(String nombreusuario) {
        this.nombreusuario = nombreusuario;
        init();
    }
   
   
   public Usuarios()
   {
       init();
   }

    /*public Usuarios(int idusuario, String nombres, String apellidos, String telefono, String direccion, String correo, String fecha_registro, String fecha_nacimiento, int idrol, String clave, int estado_cuenta) {
        this.idusuario = idusuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.fecha_registro = fecha_registro;
        this.fecha_nacimiento = fecha_nacimiento;
        this.idrol = idrol;
        this.clave = clave;
        this.estado_cuenta = estado_cuenta;
        init();
    }

    public Usuarios(String nombres, String apellidos, String telefono, String direccion, String correo, String fecha_registro, String fecha_nacimiento, int idrol, String clave, int estado_cuenta) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.fecha_registro = fecha_registro;
        this.fecha_nacimiento = fecha_nacimiento;
        this.idrol = idrol;
        this.clave = clave;
        this.estado_cuenta = estado_cuenta;
        init();
    }

    public Usuarios(String apellidos, String telefono, String direccion, String correo, String fecha_registro, String fecha_nacimiento, int idrol, String clave, int estado_cuenta) {
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.fecha_registro = fecha_registro;
        this.fecha_nacimiento = fecha_nacimiento;
        this.idrol = idrol;
        this.clave = clave;
        this.estado_cuenta = estado_cuenta;
        init();
    }

    public Usuarios(String telefono, String direccion, String correo, String fecha_registro, String fecha_nacimiento, int idrol, String clave, int estado_cuenta) {
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.fecha_registro = fecha_registro;
        this.fecha_nacimiento = fecha_nacimiento;
        this.idrol = idrol;
        this.clave = clave;
        this.estado_cuenta = estado_cuenta;
        init();
    }

    public Usuarios(String direccion, String correo, String fecha_registro, String fecha_nacimiento, int idrol, String clave, int estado_cuenta) {
        this.direccion = direccion;
        this.correo = correo;
        this.fecha_registro = fecha_registro;
        this.fecha_nacimiento = fecha_nacimiento;
        this.idrol = idrol;
        this.clave = clave;
        this.estado_cuenta = estado_cuenta;
        init();
    }

    public Usuarios(String correo, String fecha_registro, String fecha_nacimiento, int idrol, String clave, int estado_cuenta) {
        this.correo = correo;
        this.fecha_registro = fecha_registro;
        this.fecha_nacimiento = fecha_nacimiento;
        this.idrol = idrol;
        this.clave = clave;
        this.estado_cuenta = estado_cuenta;
        init();
    }*/
    
    
    
    
   
   
   
   
   
   private void init()
   {
       AUTO_INCREMENT = true;
       PRIMARY_KEY = "idusuario";
   }

    public int getIdusuario() {
        return idusuario;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public int getIdrol() {
        return idrol;
    }

    public String getClave() {
        return clave;
    }

    public int getEstado_cuenta() {
        return estado_cuenta;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setEstado_cuenta(int estado_cuenta) {
        this.estado_cuenta = estado_cuenta;
    }
    
    
    
    
   
   

}