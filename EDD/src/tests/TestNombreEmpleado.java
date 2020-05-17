package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import excepciones.NombreEmpleadoException;
import syspagos.Empleado;

public class TestNombreEmpleado {

	@Test 
	public void nombreEmpleadoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado("Jorge");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("Jorge",e.getNombreEmpleado());
	}
	@Test 
	public void nombreEmpleadoIncorectoNulo() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado("");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("",e.getNombreEmpleado());
	}

	@Test 
	public void nombreEmpleadoIncorectoNombreLargo() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado("JorgeGonzalez");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("JorgeGonzalez",e.getNombreEmpleado());
	}
	@Test 
	public void nombreEmpleadoIncorectoNoValido() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado("Jorge123");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("Jorge123",e.getNombreEmpleado());
	}



}
