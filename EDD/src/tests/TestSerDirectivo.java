package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import excepciones.CargoException;

import syspagos.Empleado;

public class TestSerDirectivo {

	@Test 
	public void establecerSerDirectivoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo("+");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals("+",e.getDirectivo());
	}
	@Test 
	public void establecerNoSerDirectivoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo("-");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals("-",e.getDirectivo());
	}
	@Test 
	public void establecerSerDirectivoInorrectoNulo() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo("");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals("",e.getDirectivo());
	}
	@Test 
	public void establecerSerDirectivoInorrectoCaracterInvalido() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo("*");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals("*",e.getDirectivo());
	}
}
