package com.persona.modelo;

/**
 *
 * @author educacion
 */
public class Empleado extends Persona {

    private int idEmpleado;
    private String Empresa;
    
    @Override
    public String getEmpleado() {
        return "Persona: EMPLEADO ";
    }
    
   @Override
    public String nombreEmpleado(){
        return "Mi nombre es Felix";
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getEmpresa() {
        return "Tienda.Inc";
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }
    
    
}
