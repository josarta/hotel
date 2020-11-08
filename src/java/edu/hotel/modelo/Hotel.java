/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hotel.modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Hotel {

    private String direccion;
    private String ciudad;
    private String barrio;
    private String telefono;
    private ArrayList<Habitacion> listaHabitaciones;
    private ArrayList<Confiteria> listaConfiteria = new ArrayList<>();
    

    public Hotel() {
        this.listaHabitaciones = new ArrayList<>();
    }

    public Hotel(String direccion, String ciudad, String barrio, String telefono) {
        this.listaHabitaciones = new ArrayList<>();
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.telefono = telefono;
    }

    public Hotel(String direccion, String ciudad) {
        this.listaHabitaciones = new ArrayList<>();
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    
    
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public ArrayList<Confiteria> getListaConfiteria() {
        return listaConfiteria;
    }

    public void setListaConfiteria(ArrayList<Confiteria> listaConfiteria) {
        this.listaConfiteria = listaConfiteria;
    }
    
    
    

}
