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
public class Ventas extends Entidad {

    private int idventas;
    private int idpedido;
    private String fecha;
    private double precio_envio;
    private String forma_pago;
    private String codigo_transaccion;
    private double descuento;
    private double total;
    private int idcosto_envio;

    public Ventas(int idventas, int idpedido, String fecha, double precio_envio, String forma_pago, String codigo_transaccion, double descuento, double total, int idcosto_envio) {
        this.idventas = idventas;
        this.idpedido = idpedido;
        this.fecha = fecha;
        this.precio_envio = precio_envio;
        this.forma_pago = forma_pago;
        this.codigo_transaccion = codigo_transaccion;
        this.descuento = descuento;
        this.total = total;
        this.idcosto_envio = idcosto_envio;
        init();
    }

    public Ventas(int idpedido, String fecha, double precio_envio, String forma_pago, String codigo_transaccion, double descuento, double total, int idcosto_envio) {
        this.idpedido = idpedido;
        this.fecha = fecha;
        this.precio_envio = precio_envio;
        this.forma_pago = forma_pago;
        this.codigo_transaccion = codigo_transaccion;
        this.descuento = descuento;
        this.total = total;
        this.idcosto_envio = idcosto_envio;
        init();
    }

    public Ventas(String fecha, double precio_envio, String forma_pago, String codigo_transaccion, double descuento, double total, int idcosto_envio) {
        this.fecha = fecha;
        this.precio_envio = precio_envio;
        this.forma_pago = forma_pago;
        this.codigo_transaccion = codigo_transaccion;
        this.descuento = descuento;
        this.total = total;
        this.idcosto_envio = idcosto_envio;
        init();
    }

    public Ventas(String forma_pago, String codigo_transaccion, double descuento, double total, int idcosto_envio) {
        this.forma_pago = forma_pago;
        this.codigo_transaccion = codigo_transaccion;
        this.descuento = descuento;
        this.total = total;
        this.idcosto_envio = idcosto_envio;
        init();
    }

    public Ventas(String codigo_transaccion, double descuento, double total, int idcosto_envio) {
        this.codigo_transaccion = codigo_transaccion;
        this.descuento = descuento;
        this.total = total;
        this.idcosto_envio = idcosto_envio;
        init();
    }

    public Ventas(double descuento, double total, int idcosto_envio) {
        this.descuento = descuento;
        this.total = total;
        this.idcosto_envio = idcosto_envio;
        init();
    }

    public Ventas(double total, int idcosto_envio) {
        this.total = total;
        this.idcosto_envio = idcosto_envio;
        init();
    }

    public Ventas(int idcosto_envio) {
        this.idcosto_envio = idcosto_envio;
        init();
    }

    public int getIdventas() {
        return idventas;
    }

    public void setIdventas(int idventas) {
        this.idventas = idventas;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio_envio() {
        return precio_envio;
    }

    public void setPrecio_envio(double precio_envio) {
        this.precio_envio = precio_envio;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public String getCodigo_transaccion() {
        return codigo_transaccion;
    }

    public void setCodigo_transaccion(String codigo_transaccion) {
        this.codigo_transaccion = codigo_transaccion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdcosto_envio() {
        return idcosto_envio;
    }

    public void setIdcosto_envio(int idcosto_envio) {
        this.idcosto_envio = idcosto_envio;
    }

    public Ventas() {
        init();
    }

    private void init() {
        AUTO_INCREMENT = true;
        PRIMARY_KEY = "idventas";
    }

}
