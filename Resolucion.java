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
public class Resolucion {
    
    private String tiempoDedicado;
    private String experiencia;
    private String dudas;
    private int porcentaje;
                
        
    public Resolucion (){
        
    }
        
    public Resolucion(String tiempoDedicado, String experiencia, String dudas, int porcentaje) {
        this.tiempoDedicado = tiempoDedicado;
        this.experiencia = experiencia;
        this.dudas = dudas;
        this.porcentaje = porcentaje;
     }
    
    
    public void showInfoResolucion(){
        System.out.println("Tiempo dedicado: "+tiempoDedicado+" Experiencia: "+experiencia+" Dudas: "+dudas
                            +" Porcentaje: "+porcentaje);
    }

    
    
    
    public String getTiempoDedicado() {
        return tiempoDedicado;
    }

    public void setTiempoDedicado(String tiempoDedicado) {
        this.tiempoDedicado = tiempoDedicado;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getDudas() {
        return dudas;
    }

    public void setDudas(String dudas) {
        this.dudas = dudas;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
   
}

