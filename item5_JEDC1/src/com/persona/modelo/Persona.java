
package com.persona.modelo;

/**
 *
 * @author educacion
 */
public abstract class Persona{

    private int idPersona;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }
    
    public String getCliente(){
        return "persona: Cliente";
    }
    public String getEmpleado(){
        return "Hola soy un Empleado";
    }
    public String nombreCliente(){
        return "Mucho gusto Juan";
    }
    
    public String nombreEmpleado(){
        return "muicho gusto Felix";
    }
    
    
    
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
