package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import excepciones.MesesTrabajoException;
import excepciones.NombreEmpleadoException;
import syspagos.Empleado;

public class TestMesesTrabajados {

	@Test 
	public void mesesTrabajadosCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("012");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals("012",e.getMesesTrabajo());
	}
	@Test 
	public void mesesTrabajadosInorrectoMenosDigitos() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("12");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals("12",e.getMesesTrabajo());
	}
	@Test 
	public void mesesTrabajadosInorrectoMasDigitos() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("1223");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals("1232",e.getMesesTrabajo());
	}
	
	
}
