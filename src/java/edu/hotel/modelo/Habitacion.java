/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hotel.modelo;

/**
 *
 * @author Usuario
 */
public class Habitacion {
    private String  numeroHabitacion;
    private boolean banioPrivado;
    private boolean telefono;
    private boolean calefaccion;
    private int camas;
    private String tipoHabitacion;
    private Huesped resposable;

    public Habitacion() {
    }

    public Habitacion(String numeroHabitacion, boolean banioPrivado, boolean telefono, boolean calefaccion, int camas, String tipoHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.banioPrivado = banioPrivado;
        this.telefono = telefono;
        this.calefaccion = calefaccion;
        this.camas = camas;
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean isBanioPrivado() {
        return banioPrivado;
    }

    public void setBanioPrivado(boolean banioPrivado) {
        this.banioPrivado = banioPrivado;
    }

    public boolean isTelefono() {
        return telefono;
    }

    public void setTelefono(boolean telefono) {
        this.telefono = telefono;
    }

    public boolean isCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public Huesped getResposable() {
        return resposable;
    }

    public void setResposable(Huesped resposable) {
        this.resposable = resposable;
    }
    
    
    
    
    
    
}
