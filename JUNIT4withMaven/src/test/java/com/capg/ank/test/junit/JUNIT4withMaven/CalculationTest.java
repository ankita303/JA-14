package com.capg.ank.test.junit.JUNIT4withMaven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculationTest {
   
	@Test
	public void testMethods()
	{
		try
		{
			assertEquals(20,new Calculation().addition(10,10));
			assertEquals(10, new Calculation().subtraction(20, 10));
			assertEquals(30, new Calculation().multiplication(20, 10));
			assertEquals(2, new Calculation().divison(20, 10));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
