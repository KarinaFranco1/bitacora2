/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitacora;

import java.util.ArrayList;

/**
 *
 * @author KariCastiglioni
 */
public class Tema {

    String nombreTema;
    String fecha;
    ArrayList<Resolucion> resoluciones;
    ArrayList<Investigacion> investigaciones;
    ArrayList<Item> items;

    public Tema() {

    }

    public Tema(String nombreTema, String fecha) {
        this.nombreTema = nombreTema;
        this.fecha = fecha;
    }

    public Tema(String nombreTema, String fecha, ArrayList resoluciones, ArrayList investigaciones, ArrayList items) {
        this.nombreTema = nombreTema;
        this.fecha = fecha;
        this.resoluciones = resoluciones;
        this.investigaciones = investigaciones;
        this.items = items;
    }

    public String getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Resolucion> getResoluciones() {
        return resoluciones;
    }

    public void setResoluciones(ArrayList<Resolucion> resoluciones) {
        this.resoluciones = resoluciones;
    }

    public ArrayList<Investigacion> getInvestigaciones() {
        return investigaciones;
    }

    public void setInvestigaciones(ArrayList<Investigacion> investigaciones) {
        this.investigaciones = investigaciones;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

}
