package com.example.android.miqhatu;

/**
 * Created by alan on 30-11-16.
 */

public class Producto {
    private String nombre;
    private double precio;
    private String categoria;
    private String fecha_de_vencimiento;
    private double cantidad;
    private int imagen;

    public Producto(String nombre, double precio, String fecha_de_vencimiento, String categoria, double cantidad,int imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.fecha_de_vencimiento = fecha_de_vencimiento;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.imagen=imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getFecha_de_vencimiento() {
        return fecha_de_vencimiento;
    }

    public int getImagen() {
        return imagen;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void updateProducto(String nombre, double precio, String fecha_de_vencimiento, String categoria, double cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.fecha_de_vencimiento = fecha_de_vencimiento;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public double totalPrice(double cant) {
        return cant * precio;
    }
}

