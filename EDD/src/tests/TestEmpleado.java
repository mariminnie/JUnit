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
	
	public void establecerNumeroDeEmpleadoIncorrectoNumeroMayor() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("4444");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(4444,e.getNumeroEmpleado());
	}
	@Test 
	public void establecerNumeroDeEmpleadoIncorrectoNumeroMenor() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("000");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(000,e.getNumeroEmpleado());
	}
	
	@Test 
	public void establecerNumeroDeEmpleadoIncorrectoNumeroNegativo() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("-13");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(-13,e.getNumeroEmpleado());
	}
	@Test 
	public void establecerNumeroDeEmpleadoIncorrectoNoNumero() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("HOLA");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("HOLA",e.getNumeroEmpleado());
	}
	
}
