/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hotel.controlador;

import edu.hotel.modelo.Confiteria;
import edu.hotel.modelo.Habitacion;
import edu.hotel.modelo.Hotel;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Usuario
 */
@Named(value = "gestionView")
@ViewScoped
public class GestionView implements Serializable {

    private Hotel miHotel = new Hotel();
    private Habitacion nuevaHabitacion = new Habitacion();
    private Confiteria nuevaConfiteria = new Confiteria();

    /**
     * Creates a new instance of GestionView
     */
    public GestionView() {
    }

    public Hotel getMiHotel() {
        return miHotel;
    }
    
    
    public void guardarHabitacion(){
      miHotel.getListaHabitaciones().add(new Habitacion(nuevaHabitacion.getNumeroHabitacion(), nuevaHabitacion.isBanioPrivado(), nuevaHabitacion.isTelefono(), nuevaHabitacion.isCalefaccion(), 0, nuevaHabitacion.getTipoHabitacion()));
      nuevaHabitacion = new Habitacion();
    }
    
    public void guardarConfiteria(){
      miHotel.getListaConfiteria().add(new Confiteria(nuevaConfiteria.getMenu(), nuevaConfiteria.getAdicionales()));
      nuevaConfiteria = new Confiteria();
    }
    
    

    public void setMiHotel(Hotel miHotel) {
        this.miHotel = miHotel;
    }

    public Habitacion getNuevaHabitacion() {
        return nuevaHabitacion;
    }

    public void setNuevaHabitacion(Habitacion nuevaHabitacion) {
        this.nuevaHabitacion = nuevaHabitacion;
    }

    public Confiteria getNuevaConfiteria() {
        return nuevaConfiteria;
    }

    public void setNuevaConfiteria(Confiteria nuevaConfiteria) {
        this.nuevaConfiteria = nuevaConfiteria;
    }

}
