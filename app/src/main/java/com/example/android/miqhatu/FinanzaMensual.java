package com.example.android.miqhatu;

/**
 * Created by alan on 01-12-16.
 */

public class FinanzaMensual {
    private  String fecha;
    private double egresos;
    private double ingresos;
    private double ganancia;
    private String [][] productosVendidos;

    public FinanzaMensual(String fecha, double egresos, double ingresos, double ganancia, String[][] productosVendidos) {
        this.fecha = fecha;
        this.egresos = egresos;
        this.ingresos = ingresos;
        this.ganancia = ganancia;
        this.productosVendidos = productosVendidos;
    }

    public String getFecha() {
        return fecha;
    }

    public String[][] getProductosVendidos() {
        return productosVendidos;
    }

    public double getGanancia() {
        return ganancia;
    }

    public double getIngresos() {
        return ingresos;
    }

    public double getEgresos() {
        return egresos;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setProductosVendidos(String[][] productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
}
