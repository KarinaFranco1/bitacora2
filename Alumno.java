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
public class Alumno {

    private static Materia datos = new Materia();

    Scanner teclado = new Scanner(System.in);
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String username;
    private String password;
    private ArrayList<Materia> materias;

    public Alumno() {

    }

    public Alumno(String nombre, String apellido, String telefono, String correo, String username, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.username = username;
        this.correo = correo;
        this.password = password;
    }

    public boolean crearMateria() {
        boolean procesoCorrecto = true;
        String nombreMateria = LecturaDatos.leerString("Ingrese nombre de la materia: ");
        String duracion = LecturaDatos.leerString("Ingrese la duración: ");
        String profesor = LecturaDatos.leerString("Ingrese el profesor encargado de la materia: ");

        Materia unaMateria = new Materia(nombreMateria, duracion, profesor);
        this.materias.add(unaMateria);

        
        return procesoCorrecto;
    }

    public boolean opcionCrearMateria() {
        boolean procesoCorrecto = true;
        int opcion;
        do {
            System.out.println("Usted está en:___Crear una materia___");
            System.out.println("1. Crear una materia");
            System.out.println("2. Visualizar las materia");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    crearMateria();
                case 2:
                    showInfoMateria();
                default:

                    System.out.println("Opcion no valida. Intente de vuelta por favor");
            }
        } while (opcion != 2);
        return procesoCorrecto;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void showInfoMateria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
