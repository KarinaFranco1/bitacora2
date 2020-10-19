/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitacora;

import java.util.Scanner;

/**
 *
 * @author KariCastiglioni
 */
public class LecturaDatos {

    private static Scanner teclado = new Scanner(System.in);

    /**
     * Pide al usuario que ingrese una cadena.
     *
     * @param mensaje: mensaje que sera mostrado al usuario para el pedido del
     * dato
     * @return la cadena ingresada por el usuario
     */
    public static String leerString(String mensaje) {
        System.out.print(mensaje);
        String cadena = teclado.nextLine();
        return cadena;
    }

    /**
     * Pide al usuario que ingrese una cadena.
     *
     * @param mensaje: mensaje que sera mostrado al usuario para el pedido del
     * dato
     * @return la cadena ingresada por el usuario
     */
    public static int leerInt(String mensaje) {
        System.out.print(mensaje);
        int entero = teclado.nextInt();
        teclado.nextLine();// consume el enter ingreado despues del numero
        return entero;
    }

//    public static boolean leerBoolean(String mensaje) {
//        System.out.print(mensaje);
//        boolean entero = teclado.equals();
//        teclado.equals();// consume el enter ingreado despues del numero
//        return entero;
    }


