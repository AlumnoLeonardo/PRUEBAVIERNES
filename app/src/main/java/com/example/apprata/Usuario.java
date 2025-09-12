package com.example.apprata;

public class Usuario {
    private String nombre;
    private String fechaIngreso;
    private String rut;
    private String estado;
    private String fechaVencimiento;
    private String tipoSubscripcion;

    public Usuario(String nombre, String fechaIngreso, String rut, String estado, String fechaVencimiento, String tipoSubscripcion) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.rut = rut;
        this.estado = estado;
        this.fechaVencimiento = fechaVencimiento;
        this.tipoSubscripcion = tipoSubscripcion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(String fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    public String getTipoSubscripcion() { return tipoSubscripcion; }
    public void setTipoSubscripcion(String tipoSubscripcion) { this.tipoSubscripcion = tipoSubscripcion; }

    @Override
    public String toString() {
        return nombre + " (" + rut + ")";
    }
}
