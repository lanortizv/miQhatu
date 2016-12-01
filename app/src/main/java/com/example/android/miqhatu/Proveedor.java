package com.example.android.miqhatu;

/**
 * Created by alan on 01-12-16.
 */

public class Proveedor {
    private String nombreEmpresa;
    private String nombrePreventista;
    private int telefono;
    private String diasPreventa;

    public Proveedor(String nombreEmpresa, String nombrePreventista, int telefono, String diasPreventa) {
        this.nombreEmpresa = nombreEmpresa;
        this.nombrePreventista = nombrePreventista;
        this.telefono = telefono;
        this.diasPreventa = diasPreventa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getNombrePreventista() {
        return nombrePreventista;
    }

    public String getDiasPreventa() {
        return diasPreventa;
    }

    public int getTelefono() {
        return telefono;
    }
    public void updateProveedor(String nombreEmpresa, String nombrePreventista, int telefono, String diasPreventa) {
        this.nombreEmpresa = nombreEmpresa;
        this.nombrePreventista = nombrePreventista;
        this.telefono = telefono;
        this.diasPreventa = diasPreventa;
    }
}
