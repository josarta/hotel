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
public class Confiteria {

    private String menu;
    private String adicionales;

    public Confiteria() {
    }

    public Confiteria(String menu, String adicionales) {
        this.menu = menu;
        this.adicionales = adicionales;
    }

    public String getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(String adicionales) {
        this.adicionales = adicionales;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

}
