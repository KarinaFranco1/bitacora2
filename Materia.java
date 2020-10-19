/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitacora;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KariCastiglioni
 */
public class Materia {

    Scanner teclado = new Scanner(System.in);

    private String nombreMateria;
    private String duracion;
    private String profesor;
    private ArrayList<Tema> temas;

    Materia(String nombreMateria, String duracion, String profesor) {
    }

    Materia() {

    }

    public void crearTema() {
        System.out.println("Deseas crear un tema?");
        int opcion;
        do {
            System.out.println("1- si");
            System.out.println("2- no");
            opcion = teclado.nextInt();
        } while (opcion != 1 && opcion != 2);
        if (opcion == 1) {
            String nombreTema = LecturaDatos.leerString("Ingrese nombre del tema: ");
            String fecha = LecturaDatos.leerString("Ingrese la fecha: ");
            Tema unTema = new Tema(nombreTema, fecha);
            this.temas.add(unTema);
        }
    }

    public void Materia(String nombreMateria, String duracion, String profesor) {
        this.nombreMateria = nombreMateria;
        this.duracion = duracion;
        this.profesor = profesor;
        this.temas = new ArrayList();
    }

    public boolean showInfoMateria() {
        boolean procesoCorrecto = true;
        System.out.println("Nombre: " + nombreMateria + " Duracion: " + duracion + " Profesor: " + profesor
                + " Temas: " + temas);
        return procesoCorrecto;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Tema> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<Tema> temas) {
        this.temas = temas;
    }
}
