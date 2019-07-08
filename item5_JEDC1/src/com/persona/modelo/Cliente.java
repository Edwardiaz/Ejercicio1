/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persona.modelo;

/**
 *
 * @author educacion
 */
public class Cliente extends Persona{
    
    private int idCliente;
    private String nombreCliente;
    
    @Override
    public String getCliente(){
        return "PERSONA: CLIENTE ";
    }
    @Override
    public String nombreCliente(){
        return "hola soy "+getNombreCliente();
        
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return "Juan";
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    
}
