/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitacora;

/**
 *
 * @author KariCastiglioni
 */
public class Mensaje {
    public static void mensajeProceso(boolean procesoExitoso){
        if(procesoExitoso){
            System.out.println("El proceso fue exitoso!!");
        }else{
            System.out.println("Ocurrió un error en el proceso!!");
        }
    }
}
