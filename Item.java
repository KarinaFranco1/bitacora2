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
public class Item {
    
    private String concepto;
    private String descripcion;
    private String dudas;
    private Boolean aprendido;
                
        
    public Item (){
        
    }
        
    public Item(String concepto, String descripcion, String dudas, Boolean aprendido) {
        this.concepto = concepto;
        this.descripcion = descripcion;
        this.dudas = dudas;
        this.aprendido = aprendido;
     }
    
    
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDudas() {
        return dudas;
    }

    public void setDudas(String dudas) {
        this.dudas = dudas;
    }

    public Boolean getAprendido() {
        return aprendido;
    }

    public void setAprendido(Boolean aprendido) {
        this.aprendido = aprendido;
    }
    
}
