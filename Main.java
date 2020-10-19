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
public class Main {

private static Materia datosInstitucion = new Materia();
    private static boolean procesoCorrecto; // se utiliza para almacenar el resultado de llamada a metodos
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);       
        int opcion;
                        
        do{
            System.out.println("");
            System.out.println("SISTEMA DE BITÁCORA");
            System.out.println("");
            System.out.println("Menú del sistema");
            System.out.println("1. Crear materia");
            System.out.println("2. Visualizar materia");
            System.out.println("3. Crear temas");
            System.out.println("4. Crear");
            System.out.println("5. Cargar porcentaje del examen final");
            System.out.println("6. Resultados");
            System.out.println("7. Salir");
            System.out.println("");
            System.out.print("Ingrese el número de la opción elegida: ");
            opcion = teclado.nextInt();
                
            switch(opcion){
                case 1: 
                    inscribirAlumno();
                    break;
                case 2:
                    matricularAlumno();
                    break;
                case 3:
                    cargarDatosProfesor();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Usted está en: ###___Informes___###");
                    
                    break;    
                case 7:
                    System.out.println("La ejecución del sistema ha finalizado");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de vuelta por favor");
            }
        }while(opcion != 7);
    }
    
    private static void inscribirAlumno(){        
        System.out.println("Usted está en: ###___Inscribir alumno___###");

        procesoCorrecto = datosInstitucion.inscribirAlumno();
        Mensaje.mensajeProceso(procesoCorrecto);
    }
    
    private static void cargarDatosProfesor(){
        System.out.println("Usted está en: ###___Cargar datos del profesor___###");

        procesoCorrecto = datosInstitucion.registrarProfesor();
        Mensaje.mensajeProceso(procesoCorrecto);
    }
    
}
