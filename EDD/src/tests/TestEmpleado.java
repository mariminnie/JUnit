package tests;

import static org.junit.Assert.*;


import org.junit.Test;

import syspagos.Empleado;
import excepciones.*;

public class TestEmpleado 
{
	@Test 
	public void establecerNumeroDeEmpleadoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("4");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(4,e.getNumeroEmpleado());
	}
	



}
