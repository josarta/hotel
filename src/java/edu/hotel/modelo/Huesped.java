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
public class Huesped {

    private String nombre;
    private String direccion;
    private String profesion;
    private String estadoCivil;
    private String horaDespertar;
    private String tipoReserva;

    public Huesped() {
    }

    public Huesped(String nombre, String direccion, String profesion, String estadoCivil, String horaDespertar, String tipoReserva) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.profesion = profesion;
        this.estadoCivil = estadoCivil;
        this.horaDespertar = horaDespertar;
        this.tipoReserva = tipoReserva;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getHoraDespertar() {
        return horaDespertar;
    }

    public void setHoraDespertar(String horaDespertar) {
        this.horaDespertar = horaDespertar;
    }

    
    
    
}
