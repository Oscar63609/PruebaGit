package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void test() {
		
		Calculadora calc = new Calculadora();
		String mensaje = "hola";
		
//		int[] esperado = (1,2,3);
//		int[] resultado = (1,2,3);
		
//		assertEquals(4,calc.sumar(2, 2));
//		assertEquals(4,5);
//		assertEquals(4,4);
		
//		assertAll(
//			() ->assertEquals(4,4),
//			() ->assertEquals(4,5),
//			() ->assertEquals(4,4)
			
			//-------------------------------------
			
			//ASSERTS clase del jueves
			
//			assertNotEquals(4,calc.sumar(2, 3)); // Si no son iguales
//			assertTrue(4<7); // Si la condicion se cumple dando True
//			assertFalse(4==5);// Si la condicion se cumple dando False
			assertNull(mensaje);// Si es null
//			assertNotNull(mensaje);// Si no es null
//			assertArraysEquals(esperado,resultado);// Si dos array son iguales
			
			
//			);
		
	}

}
