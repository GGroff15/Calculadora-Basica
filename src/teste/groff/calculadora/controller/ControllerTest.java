package teste.groff.calculadora.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import groff.calculadora.controller.Controller;

class ControllerTest {

	Controller controller;
	
	@BeforeEach	void setUp() {
		controller = new Controller();
	}
	
	@Test
	void testSomar() {
		controller.adicionarElemento(1);
		controller.adicionarElemento(2);
		controller.adicionarElemento(3);
		
		assertEquals(6, controller.somar());
	}
	
	@Test
	void testSubtrair() {
		controller.adicionarElemento(6);
		controller.adicionarElemento(4);
		controller.adicionarElemento(3);
		assertEquals(-1, controller.subtrair());
	}
	
	@Test
	void testMultiplicar() {
		controller.adicionarElemento(4);
		controller.adicionarElemento(3);
		controller.adicionarElemento(2);
		assertEquals(24, controller.multiplicar());
	}
	
	@Test
	void testDividir() {
		controller.adicionarElemento(8);
		controller.adicionarElemento(4);
		controller.adicionarElemento(2);
		assertEquals(1, controller.dividir());
	}

}
