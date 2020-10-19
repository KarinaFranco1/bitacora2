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
public class prueba {

    private static Alumno datosInstitucion = new Alumno();
    private static Materia datos = new Materia();
    private static boolean procesoCorrecto; // se utiliza para almacenar el resultado de llamada a metodos

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("");
            System.out.println("SISTEMA DE BITÁCORA");
            System.out.println("");
            System.out.println("Menú del sistema");
            System.out.println("1. Crear una materia");
            System.out.println("2. Visualizar las materia");
            System.out.println("3. Salir");
            System.out.println("");
            System.out.print("Ingrese el número de la opción elegida: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    opcionCrearMateria();
                    break;
                case 2:
                    showInfoMateria();
                    break;
                case 3:
                    System.out.println("La ejecución del sistema ha finalizado");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de vuelta por favor");
            }
        } while (opcion != 3);
    }

    private static void opcionCrearMateria() {
        System.out.println("Usted está en: ###___Inscribir alumno___###");

        procesoCorrecto = datosInstitucion.opcionCrearMateria();
        Mensaje.mensajeProceso(procesoCorrecto);
    }

    private static void showInfoMateria() {
        System.out.println("Usted está en: ###___Cargar datos del profesor___###");
        procesoCorrecto = datos.showInfoMateria();
        Mensaje.mensajeProceso(procesoCorrecto);
    }

}
