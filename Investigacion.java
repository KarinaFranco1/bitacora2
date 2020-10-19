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
public class Investigacion {

    private String tiempoDedicado;
    private String temaInvestigado;
    private String comentario;
    private int nivelComprension;
    private String dudas;

    public Investigacion() {

    }

    public Investigacion(String tiempoDedicado, String temaInvestigado, String comentario, int nivelComprension, String dudas) {
        this.tiempoDedicado = tiempoDedicado;
        this.temaInvestigado = temaInvestigado;
        this.comentario = comentario;
        this.nivelComprension = nivelComprension;
        this.dudas = dudas;
    }
  
    

    public void showInfoInvestigacion() {
        System.out.println("Tiempo dedicado: " + tiempoDedicado + " Tema Investigado: " + temaInvestigado + " Comentario: " + comentario
                + " Nivel Comprension: " + nivelComprension + " Dudas: " + dudas);
    }

    public String getTiempoDedicado() {
        return tiempoDedicado;
    }

    public void setTiempoDedicado(String tiempoDedicado) {
        this.tiempoDedicado = tiempoDedicado;
    }

    public String getTemaInvestigado() {
        return temaInvestigado;
    }

    public void setTemaInvestigado(String temaInvestigado) {
        this.temaInvestigado = temaInvestigado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getDudas() {
        return dudas;
    }

    public void setDudas(String dudas) {
        this.dudas = dudas;
    }

    public int getNivelComprension() {
        return nivelComprension;
    }

    public void setNivelComprension(int nivelComprension) {
        this.nivelComprension = nivelComprension;
    }
}
