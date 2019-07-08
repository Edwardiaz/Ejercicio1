
package com.persona.controlador;

import com.persona.modelo.Cliente;
import com.persona.modelo.Empleado;
import com.persona.modelo.Persona;

/**
 *
 * @author educacion
 */
public class ControladorPersona {
    
    public static void main(String[] args) {
        
        Persona perEmp = new Empleado();
        Persona perClie = new Cliente();
        
        System.out.println("DATOS DE DOS PERSONAS: ");
        System.out.println("El usuario 1 es "+perClie.getCliente());
        System.out.println("Su nombre es: "+perClie.getNombres());
        System.out.println("El usuario 2 es "+perEmp.getEmpleado());
        System.out.println("Nombre empleado: "+perEmp.getNombres());
        //metodo que solo le pertenece a Empleado
        System.out.println("Nombre empresa es: "+((Empleado)perEmp).getEmpresa());
        
    }
    
}