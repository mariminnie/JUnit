package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import excepciones.NumeroEmpleadoException;
import syspagos.Empleado;
import syspagos.Prima;

public class TestPrima {

	@Test 
	public void calcularPrimaP1() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("625","Jorge","035","+");
        } catch (Exception ex) 
        {
        	ex.printStackTrace();
        }
        assertEquals(Prima.P1,e.getPrima());
	}
	@Test 
	public void calcularPrimaP2() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("333","Jorge","010","-");
        } catch (Exception ex) 
        {
        	ex.printStackTrace();
        }
        assertEquals(Prima.P2,e.getPrima());
	}
        @Test 
    	public void calcularPrimaP3() 
    	{
    		Empleado e = new Empleado();
            try 
            {
                e.calcularPrima("333","Jorge","013","+");
            } catch (Exception ex) 
            {
            	ex.printStackTrace();
            }
            assertEquals(Prima.P3,e.getPrima());
    	}
        @Test 
    	public void calcularPrimaP4() 
    	{
    		Empleado e = new Empleado();
            try 
            {
                e.calcularPrima("625","Jorge","013","-");
            } catch (Exception ex) 
            {
            	ex.printStackTrace();
            }
            assertEquals(Prima.P4,e.getPrima());
    	}
	}

